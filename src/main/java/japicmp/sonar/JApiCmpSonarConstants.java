package japicmp.sonar;

public class JApiCmpSonarConstants {

	public static final String PLUGIN_KEY = "japicmp";

	public static final String RULE_KEY_BINARY_INCOMPATBILE_CHANGE = PLUGIN_KEY + "-binary-incompatible-change";
	public static final String RULE_KEY_SOURCE_INCOMPATBILE_CHANGE = PLUGIN_KEY + "-source-incompatible-change";
	public static final String RULE_KEY_API_CHANGE = PLUGIN_KEY + "-api-change";

	public static final String PROPERTY_XML_REPORT_PATH = "sonar.japicmp.xmlReportPath";
    public static final String DEFAULT_VALUE_REPORT_PATH = "target/japicmp/japicmp.xml";

    public static final String PROPERTY_USE_SEMANTIC_VERSIONING = "sonar.japicmp.useSemanticVersioning";
    public static final String DEFAULT_VALUE_SEMANTIC_VERSIONING = "true";

    private JApiCmpSonarConstants() {
        //private constructor
    }
}
