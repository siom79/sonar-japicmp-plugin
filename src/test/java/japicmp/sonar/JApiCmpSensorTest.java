package japicmp.sonar;

import japicmp.util.Optional;
import japicmp.versioning.SemanticVersion;
import japicmp.xml.JApiCmpXmlRoot;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JApiCmpSensorTest {

    @Test
    public void testSemanticVersionChangeMajor() {
        JApiCmpSensor sensor = new JApiCmpSensor(null, null);
        JApiCmpXmlRoot xmlRoot = new JApiCmpXmlRoot();
        xmlRoot.setOldVersion("0.0.1");
        xmlRoot.setNewVersion("1.0.0");
        Optional<SemanticVersion.ChangeType> changeTypeOptional = sensor.computeVersionChange(xmlRoot);
        assertThat(changeTypeOptional.isPresent(), is(true));
        assertThat(changeTypeOptional.get(), is(SemanticVersion.ChangeType.MAJOR));
    }

    @Test
    public void testSemanticVersionChangeMinor() {
        JApiCmpSensor sensor = new JApiCmpSensor(null, null);
        JApiCmpXmlRoot xmlRoot = new JApiCmpXmlRoot();
        xmlRoot.setOldVersion("0.0.1");
        xmlRoot.setNewVersion("0.1.0");
        Optional<SemanticVersion.ChangeType> changeTypeOptional = sensor.computeVersionChange(xmlRoot);
        assertThat(changeTypeOptional.isPresent(), is(true));
        assertThat(changeTypeOptional.get(), is(SemanticVersion.ChangeType.MINOR));
    }

    @Test
    public void testSemanticVersionChangePatch() {
        JApiCmpSensor sensor = new JApiCmpSensor(null, null);
        JApiCmpXmlRoot xmlRoot = new JApiCmpXmlRoot();
        xmlRoot.setOldVersion("0.0.1");
        xmlRoot.setNewVersion("0.0.2");
        Optional<SemanticVersion.ChangeType> changeTypeOptional = sensor.computeVersionChange(xmlRoot);
        assertThat(changeTypeOptional.isPresent(), is(true));
        assertThat(changeTypeOptional.get(), is(SemanticVersion.ChangeType.PATCH));
    }

    @Test
    public void testSemanticVersionChangeUnchanged() {
        JApiCmpSensor sensor = new JApiCmpSensor(null, null);
        JApiCmpXmlRoot xmlRoot = new JApiCmpXmlRoot();
        xmlRoot.setOldVersion("0.0.1");
        xmlRoot.setNewVersion("0.0.1");
        Optional<SemanticVersion.ChangeType> changeTypeOptional = sensor.computeVersionChange(xmlRoot);
        assertThat(changeTypeOptional.isPresent(), is(true));
        assertThat(changeTypeOptional.get(), is(SemanticVersion.ChangeType.UNCHANGED));
    }
}
