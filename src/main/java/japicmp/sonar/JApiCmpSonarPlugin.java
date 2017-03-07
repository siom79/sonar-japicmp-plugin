package japicmp.sonar;

import org.sonar.api.CoreProperties;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;

import static japicmp.sonar.JApiCmpSonarConstants.DEFAULT_VALUE_REPORT_PATH;

public class JApiCmpSonarPlugin implements Plugin {

    @Override
	public void define(Context context) {
		context.addExtension(JApiCmpRulesDefinition.class);
		context.addExtension(JApiCmpSensor.class);
		context.addExtension(PropertyDefinition.builder(JApiCmpSonarConstants.PROPERTY_XML_REPORT_PATH)
				.category(CoreProperties.CATEGORY_JAVA)
				.subCategory("JApiCmp")
				.name("Report path")
				.description("Path (absolute or relative) to japicmp xml report file.")
				.defaultValue(DEFAULT_VALUE_REPORT_PATH)
				.build());
	}
}
