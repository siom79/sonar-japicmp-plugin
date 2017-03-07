package japicmp.sonar;

import japicmp.xml.JApiCmpXmlRoot;
import japicmp.xml.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class JApiCmpXmlParser {

	public JApiCmpXmlRoot parse(InputStream inputStream) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			@SuppressWarnings("unchecked")
			JAXBElement<JApiCmpXmlRoot> jaxbElement = (JAXBElement<JApiCmpXmlRoot>) jaxbUnmarshaller.unmarshal(inputStream);
			return jaxbElement.getValue();
		} catch (JAXBException e) {
			throw new IllegalArgumentException("Failed to unmarshal '" + inputStream + "': " + e.getMessage(), e);
		}
	}
}
