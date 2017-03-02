package japicmp.sonar;

import japicmp.xml.*;
import japicmp.xml.JApiBehavior.Parameters;
import japicmp.xml.JApiClass.CompatibilityChanges;
import japicmp.xml.JApiClass.Constructors;
import japicmp.xml.JApiClass.Fields;
import japicmp.xml.JApiClass.Interfaces;
import japicmp.xml.JApiClass.Methods;
import japicmp.xml.JApiCmpXmlRoot.Classes;

import java.io.File;
import java.util.List;

import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.InputModule;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.scan.filesystem.PathResolver;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.java.api.JavaResourceLocator;

public class JApiCmpSensor implements Sensor {
	private static final Logger LOGGER = Loggers.get(JApiCmpSensor.class);
	private final PathResolver pathResolver;
	private JavaResourceLocator javaResourceLocator;

	public JApiCmpSensor(PathResolver pathResolver, JavaResourceLocator javaResourceLocator) {
		this.pathResolver = pathResolver;
		this.javaResourceLocator = javaResourceLocator;
	}

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.name(JApiCmpSensor.class.getName());
	}

	@Override
	public void execute(SensorContext context) {
		FileSystem fs = context.fileSystem();
		File file = this.pathResolver.relativeFile(fs.baseDir(), context.settings().getString(JApiCmpSonarConstants.PROPERTY_XML_REPORT_PATH));
		if (file.exists()) {
			JApiCmpXmlParser parser = new JApiCmpXmlParser();
			Classes classesElement = parser.parse(file);
			if (classesElement != null) {
				List<JApiClass> clazzes = classesElement.getClazz();
				if (clazzes != null) {
					processClasses(context, clazzes);
				} else {
					LOGGER.warn("File does not contain any <class/> elements: " + file.getAbsolutePath());
				}
			} else {
				LOGGER.warn("File does not contain any <classes/> element: " + file.getAbsolutePath());
			}
		} else {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("No japicmp XML file in base dir: " + fs.baseDir());
			}
		}
	}

	private void processClasses(SensorContext context, List<JApiClass> clazzes) {
		for (JApiClass jApiClass : clazzes) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug("Processing class: " + jApiClass.getFullyQualifiedName());
			}
			CompatibilityChanges compatibilityChangesClass = jApiClass.getCompatibilityChanges();
			if (compatibilityChangesClass != null) {
				String desc = jApiClass.getFullyQualifiedName();
				List<JApiCompatibilityChange> changes = compatibilityChangesClass.getCompatibilityChange();
				processCompatibilityChange(context, jApiClass, changes, -1, desc);
			}
			if (jApiClass.getChangeStatus() == JApiChangeStatus.REMOVED) {
				continue; //do not process removed classes further, otherwise a lot of further issues are created
			}
			processMethods(context, jApiClass);
			processConstructors(context, jApiClass);
			processFields(context, jApiClass);
			processSuperclass(context, jApiClass);
			processInterfaces(context, jApiClass);
		}
	}

	private void processInterfaces(SensorContext context, JApiClass jApiClass) {
		Interfaces interfaces = jApiClass.getInterfaces();
		if (interfaces != null) {
			for (JApiImplementedInterface jApiImplementedInterface : interfaces.getInterface()) {
				japicmp.xml.JApiImplementedInterface.CompatibilityChanges compatibilityChangesInterface = jApiImplementedInterface.getCompatibilityChanges();
				if (compatibilityChangesInterface != null) {
					String desc = "Interface " + jApiImplementedInterface.getFullyQualifiedName() + " of " + jApiClass.getFullyQualifiedName();
					processCompatibilityChange(context, jApiClass, compatibilityChangesInterface.getCompatibilityChange(), -1, desc);
				}
			}
		}
	}

	private void processSuperclass(SensorContext context, JApiClass jApiClass) {
		JApiSuperclass superclass = jApiClass.getSuperclass();
		if (superclass != null) {
			japicmp.xml.JApiSuperclass.CompatibilityChanges compatibilityChangesSuperclass = superclass.getCompatibilityChanges();
			if (compatibilityChangesSuperclass != null) {
				String desc = "Superclass of " + jApiClass.getFullyQualifiedName(); 
				processCompatibilityChange(context, jApiClass, compatibilityChangesSuperclass.getCompatibilityChange(), -1, desc);
			}
		}
	}

	private void processFields(SensorContext context, JApiClass jApiClass) {
		Fields fields = jApiClass.getFields();
		if (fields != null) {
			for (JApiField jApiField : fields.getField()) {
				japicmp.xml.JApiField.CompatibilityChanges compatibilityChangesField = jApiField.getCompatibilityChanges();
				if (compatibilityChangesField != null) {
					String desc = jApiClass.getFullyQualifiedName() + "#" + jApiField.getName();
					processCompatibilityChange(context, jApiClass, compatibilityChangesField.getCompatibilityChange(), -1, desc);
				}
			}
		}
	}

	private void processConstructors(SensorContext context, JApiClass jApiClass) {
		Constructors constructors = jApiClass.getConstructors();
		if (constructors != null) {
			for (JApiConstructor jApiConstructor : constructors.getConstructor()) {
				japicmp.xml.JApiBehavior.CompatibilityChanges compatibilityChangesConstructor = jApiConstructor.getCompatibilityChanges();
				if (compatibilityChangesConstructor != null) {
					String descriptor = createConstructorDescriptor(jApiClass, jApiConstructor);
					processCompatibilityChange(context, jApiClass, compatibilityChangesConstructor.getCompatibilityChange(), toInt(jApiConstructor.getNewLineNumber()), descriptor);
				}
			}
		}
	}

	private void processMethods(SensorContext context, JApiClass jApiClass) {
		Methods methods = jApiClass.getMethods();
		if (methods != null) {
			for (JApiMethod jApiMethod : methods.getMethod()) {
				japicmp.xml.JApiBehavior.CompatibilityChanges compatibilityChangesMethod = jApiMethod.getCompatibilityChanges();
				if (compatibilityChangesMethod != null) {
					String methodDescriptor = createMethodDescriptor(jApiClass, jApiMethod);
					processCompatibilityChange(context, jApiClass, compatibilityChangesMethod.getCompatibilityChange(), toInt(jApiMethod.getNewLineNumber()), methodDescriptor);
				}
			}
		}
	}
	
	private String createConstructorDescriptor(JApiClass jApiClass, JApiConstructor jApiConstructor) {
		StringBuilder sb = new StringBuilder();
		sb.append(jApiClass.getFullyQualifiedName());
		sb.append("#");
		sb.append("<init>");
		sb.append("(");
		Parameters parameters = jApiConstructor.getParameters();
		if (parameters != null) {
			List<JApiParameter> parameterList = parameters.getParameter();
			if (parameterList != null) {
				int paramCount = 0;
				for (JApiParameter jApiParameter : parameterList) {
					if (paramCount > 0) {
						sb.append(", ");
					}
					sb.append(jApiParameter.getType());
					paramCount++;
				}
			}
		}
		sb.append(")");
		return sb.toString();
	}

	private String createMethodDescriptor(JApiClass jApiClass, JApiMethod jApiMethod) {
		StringBuilder sb = new StringBuilder();
		sb.append(jApiClass.getFullyQualifiedName());
		sb.append("#");
		sb.append(jApiMethod.getName());
		sb.append("(");
		Parameters parameters = jApiMethod.getParameters();
		if (parameters != null) {
			List<JApiParameter> parameterList = parameters.getParameter();
			if (parameterList != null) {
				int paramCount = 0;
				for (JApiParameter jApiParameter : parameterList) {
					if (paramCount > 0) {
						sb.append(", ");
					}
					sb.append(jApiParameter.getType());
					paramCount++;
				}
			}
		}
		sb.append(")");
		return sb.toString();
	}
	
	private Integer toInt(String lineNumber) {
		int value;
		try {
			value = Integer.valueOf(lineNumber);
		} catch (NumberFormatException e) {
			value = -1;
		}
		return value;
	}

	private void processCompatibilityChange(SensorContext context, JApiClass jApiClass, List<JApiCompatibilityChange> changes, int lineNumber, String desc) {
		InputModule module = context.module();
		if (changes != null) {
			for (JApiCompatibilityChange change : changes) {
				japicmp.model.JApiCompatibilityChange jApiCompatibilityChange;
				try {
					jApiCompatibilityChange = japicmp.model.JApiCompatibilityChange.valueOf(change.name());
					if (!jApiCompatibilityChange.isBinaryCompatible()) {
						RuleKey rule = JApiCmpRulesDefinition.RULE_BINARY_INCOMPATBILE_CHANGE;
						createNewIssue(context, jApiClass, module, jApiCompatibilityChange, rule, lineNumber, "(" + desc + ") [binary incompatible]");
					}
					if (!jApiCompatibilityChange.isSourceCompatible()) {
						RuleKey rule = JApiCmpRulesDefinition.RULE_SOURCE_INCOMPATBILE_CHANGE;
						createNewIssue(context, jApiClass, module, jApiCompatibilityChange, rule, lineNumber, "(" + desc + ") [source incompatible]");
					}
				} catch (Exception e) {
					LOGGER.warn("Could not convert compatibility change " + change.name() + " into enum value: " + e.getLocalizedMessage(), e);
				}
			}
		}
	}

	private void createNewIssue(SensorContext context, JApiClass jApiClass, InputModule module, japicmp.model.JApiCompatibilityChange jApiCompatibilityChange,
								RuleKey rule, int lineNumber, String desc) {
		InputFile inputFile = this.javaResourceLocator.findResourceByClassName(jApiClass.getFullyQualifiedName());
		NewIssue newIssue = context.newIssue().forRule(rule);
		NewIssueLocation primaryLocation;
		if (inputFile != null) {
			primaryLocation = newIssue.newLocation().on(inputFile);
			if (lineNumber >= 0) {
				primaryLocation.at(inputFile.selectLine(lineNumber));
			}
		} else {
			primaryLocation = newIssue.newLocation().on(module);
		}
		String message = jApiCompatibilityChange.name() + " " + desc;
		primaryLocation.message(message);
		newIssue.at(primaryLocation);
		newIssue.save();
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("Created new issue for rule " + rule.toString() + " with message " + message + ".");
		}
	}
}
