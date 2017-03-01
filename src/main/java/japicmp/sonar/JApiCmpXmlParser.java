package japicmp.sonar;

import java.io.File;

import japicmp.xml.JApiCmpXmlRoot;
import japicmp.xml.JApiCmpXmlRoot.Classes;
import japicmp.xml.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JApiCmpXmlParser {

	public Classes parse(File file) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			@SuppressWarnings("unchecked")
			JAXBElement<JApiCmpXmlRoot> jaxbElement = (JAXBElement<JApiCmpXmlRoot>) jaxbUnmarshaller.unmarshal(file);
			JApiCmpXmlRoot xmlRoot = jaxbElement.getValue();
			return xmlRoot.getClasses();
		} catch (JAXBException e) {
			throw new IllegalArgumentException("Failed to unmarshal '" + file + "': " + e.getMessage(), e);
		}
	}
}
