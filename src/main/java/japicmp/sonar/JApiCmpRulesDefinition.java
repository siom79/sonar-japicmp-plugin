package japicmp.sonar;

import static japicmp.sonar.JApiCmpSonarConstants.PLUGIN_KEY;
import static japicmp.sonar.JApiCmpSonarConstants.RULE_KEY_BINARY_INCOMPATBILE_CHANGE;
import static japicmp.sonar.JApiCmpSonarConstants.RULE_KEY_SOURCE_INCOMPATBILE_CHANGE;

import org.sonar.api.rule.RuleKey;
import org.sonar.api.rule.RuleStatus;
import org.sonar.api.rule.Severity;
import org.sonar.api.server.rule.RulesDefinition;

public class JApiCmpRulesDefinition implements RulesDefinition {
	
	public static final RuleKey RULE_BINARY_INCOMPATBILE_CHANGE = RuleKey.of(PLUGIN_KEY, RULE_KEY_BINARY_INCOMPATBILE_CHANGE);
	public static final RuleKey RULE_SOURCE_INCOMPATBILE_CHANGE = RuleKey.of(PLUGIN_KEY, RULE_KEY_SOURCE_INCOMPATBILE_CHANGE);

	@Override
	public void define(Context context) {
		NewRepository repository = context.createRepository(PLUGIN_KEY, "java").setName(JApiCmpSonarConstants.PLUGIN_KEY + " analyzer");
		repository
				.createRule(RULE_KEY_BINARY_INCOMPATBILE_CHANGE)
				.setName("API modification should not be binary incompatible.")
				.setHtmlDescription(
						"The API modification is binary incompatible, i.e. other software components using this component"
								+ " need to be modified/compiled in order to support at runtime the new version of this component. A simple upgrade by replacing"
								+ " the old version of this component with the new version is not possible.")
				.setTags("japicmp", "api-tracking")
				.setStatus(RuleStatus.READY)
				.setSeverity(Severity.CRITICAL);
		repository
				.createRule(RULE_KEY_SOURCE_INCOMPATBILE_CHANGE)
				.setName("API modification should not be source incompatible.")
				.setHtmlDescription(
						"The API modification is source incompatible, i.e. other software components using this component"
								+ " need to change their source code in order to be compiled against the new version of this component.")
				.setTags("japicmp", "api-tracking")
				.setStatus(RuleStatus.READY)
				.setSeverity(Severity.MAJOR);
		repository.done();
	}

}
