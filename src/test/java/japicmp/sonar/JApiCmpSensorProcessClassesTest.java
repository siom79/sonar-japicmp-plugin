package japicmp.sonar;

import japicmp.util.Optional;
import japicmp.versioning.SemanticVersion;
import japicmp.xml.*;
import org.junit.Before;
import org.junit.Test;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.config.Settings;
import org.sonar.api.scan.filesystem.PathResolver;
import org.sonar.plugins.java.api.JavaResourceLocator;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class JApiCmpSensorProcessClassesTest {

    private JApiCmpSensor sensor;
    private PathResolver pathResolver;
    private JavaResourceLocator javaResourceLocator;
    private SensorContext context;
    private Settings settings;
    private NewIssue newIssue;
    private NewIssueLocation newIssueLocation;

    @Before
    public void before() {
        pathResolver = mock(PathResolver.class);
        javaResourceLocator = mock(JavaResourceLocator.class);
        sensor = new JApiCmpSensor(pathResolver, javaResourceLocator);
        context = mock(SensorContext.class);
        settings = mock(Settings.class);
        newIssue = mock(NewIssue.class);
        newIssueLocation = mock(NewIssueLocation.class);
    }

    @Test
    public void testClassAddedPatch() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.NEW);
        classes.add(jApiClass);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.PATCH));

        verify(context, times(1)).newIssue();
        verify(newIssue, times(1)).forRule(JApiCmpRulesDefinition.RULE_API_CHANGE);
    }

    @Test
    public void testClassAddedMinor() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.NEW);
        classes.add(jApiClass);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.MINOR));

        verify(context, times(0)).newIssue();
    }

    @Test
    public void testClassAddedMajor() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.NEW);
        classes.add(jApiClass);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.MAJOR));

        verify(context, times(0)).newIssue();
    }

    @Test
    public void testMethodRemovedPatch() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.MODIFIED);
        classes.add(jApiClass);

        addMethodToClass(jApiClass, "method", JApiCompatibilityChange.METHOD_REMOVED);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.PATCH));

        verify(context, times(1)).newIssue();
        verify(newIssue, times(1)).forRule(JApiCmpRulesDefinition.RULE_BINARY_INCOMPATBILE_CHANGE);
    }

    @Test
    public void testMethodRemovedMinor() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.MODIFIED);
        classes.add(jApiClass);

        addMethodToClass(jApiClass, "method", JApiCompatibilityChange.METHOD_REMOVED);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.MINOR));

        verify(context, times(1)).newIssue();
        verify(newIssue, times(1)).forRule(JApiCmpRulesDefinition.RULE_BINARY_INCOMPATBILE_CHANGE);
    }

    @Test
    public void testMethodRemovedMajor() {
        useSemanticVersioning("true");
        defaultNewIssueWhens();

        List<JApiClass> classes = new ArrayList<>();
        JApiClass jApiClass = createClass("japicmp.Test", JApiChangeStatus.MODIFIED);
        classes.add(jApiClass);

        addMethodToClass(jApiClass, "method", JApiCompatibilityChange.METHOD_REMOVED);

        sensor.processClasses(context, classes, Optional.of(SemanticVersion.ChangeType.MAJOR));

        verify(context, times(0)).newIssue();
    }

    private JApiClass createClass(String className, JApiChangeStatus modified) {
        JApiClass jApiClass = new JApiClass();
        jApiClass.setChangeStatus(modified);
        jApiClass.setFullyQualifiedName(className);
        return jApiClass;
    }

    private void addMethodToClass(JApiClass jApiClass, String methodName, JApiCompatibilityChange jApiCompatibilityChange) {
        JApiMethod jApiMethod = new JApiMethod();
        jApiMethod.setName(methodName);
        JApiBehavior.CompatibilityChanges compatChanges = new JApiBehavior.CompatibilityChanges();
        compatChanges.getCompatibilityChange().add(jApiCompatibilityChange);
        jApiMethod.setCompatibilityChanges(compatChanges);
        JApiClass.Methods methods = new JApiClass.Methods();
        methods.getMethod().add(jApiMethod);
        jApiClass.setMethods(methods);
    }

    private void defaultNewIssueWhens() {
        when(newIssue.forRule(any())).thenReturn(newIssue);
        when(newIssue.newLocation()).thenReturn(newIssueLocation);
        when(context.newIssue()).thenReturn(newIssue);
        when(newIssueLocation.on(any())).thenReturn(newIssueLocation);
    }

    private void useSemanticVersioning(String semanticVersioning) {
        when(context.settings()).thenReturn(settings);
        when(settings.getString(JApiCmpSonarConstants.PROPERTY_USE_SEMANTIC_VERSIONING)).thenReturn(semanticVersioning);
    }
}
