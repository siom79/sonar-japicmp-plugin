package japicmp.sonar;

import org.sonar.api.CoreProperties;
import org.sonar.api.Plugin;
import org.sonar.api.config.PropertyDefinition;

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
                .defaultValue(JApiCmpSonarConstants.DEFAULT_VALUE_REPORT_PATH)
                .build());
        context.addExtension(PropertyDefinition.builder(JApiCmpSonarConstants.PROPERTY_USE_SEMANTIC_VERSIONING)
                .category(CoreProperties.CATEGORY_JAVA)
                .subCategory("JApiCmp")
                .name("Use semantic versioning")
                .description("If set to true, the plugin will only create a Sonar issue if incompatibility violates" +
                        " semantic versioning and major, minor and patch information can be extracted.")
                .defaultValue(JApiCmpSonarConstants.DEFAULT_VALUE_SEMANTIC_VERSIONING)
                .build());
	}
}
