package japicmp.sonar;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import japicmp.xml.JApiCmpXmlRoot;
import japicmp.xml.JApiCmpXmlRoot.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class JApiCmpXmlParserTest {

	@Test
	public void test() throws FileNotFoundException {
		Path path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "xml", "japicmp-guava.xml");
		JApiCmpXmlParser parser = new JApiCmpXmlParser();
		JApiCmpXmlRoot jApiCmpXmlRoot = parser.parse(new FileInputStream(path.toFile()));
		assertThat(jApiCmpXmlRoot, notNullValue());
        Classes classes = jApiCmpXmlRoot.getClasses();
        assertThat(classes, notNullValue());
        assertThat(classes.getClazz(), notNullValue());
        assertThat(classes.getClazz().size(), is(105));
	}
}
