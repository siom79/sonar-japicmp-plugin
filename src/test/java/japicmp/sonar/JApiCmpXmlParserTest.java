package japicmp.sonar;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import japicmp.xml.JApiCmpXmlRoot.Classes;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Test;

public class JApiCmpXmlParserTest {

	@Test
	public void test() {
		Path path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "xml", "japicmp-guava.xml");
		JApiCmpXmlParser parser = new JApiCmpXmlParser();
		Classes classes = parser.parse(path.toFile());
		assertThat(classes, notNullValue());
		assertThat(classes.getClazz().size(), is(105));
	}

}
