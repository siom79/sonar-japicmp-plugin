
package japicmp.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiCmpXmlRoot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiCmpXmlRoot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="class" type="{}jApiClass" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="accessModifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignoreMissingClasses" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreMissingClassesByRegularExpressions" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="newJar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldJar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onlyBinaryIncompatibleModifications" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="onlyModifications" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="packagesExclude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="packagesInclude" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="semanticVersioning" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiCmpXmlRoot", propOrder = {
    "classes"
})
@XmlRootElement
public class JApiCmpXmlRoot {

    protected JApiCmpXmlRoot.Classes classes;
    @XmlAttribute(name = "accessModifier")
    protected String accessModifier;
    @XmlAttribute(name = "creationTimestamp")
    protected String creationTimestamp;
    @XmlAttribute(name = "ignoreMissingClasses", required = true)
    protected boolean ignoreMissingClasses;
    @XmlAttribute(name = "ignoreMissingClassesByRegularExpressions")
    protected String ignoreMissingClassesByRegularExpressions;
    @XmlAttribute(name = "newJar")
    protected String newJar;
    @XmlAttribute(name = "oldJar")
    protected String oldJar;
    @XmlAttribute(name = "onlyBinaryIncompatibleModifications", required = true)
    protected boolean onlyBinaryIncompatibleModifications;
    @XmlAttribute(name = "onlyModifications", required = true)
    protected boolean onlyModifications;
    @XmlAttribute(name = "packagesExclude")
    protected String packagesExclude;
    @XmlAttribute(name = "packagesInclude")
    protected String packagesInclude;
    @XmlAttribute(name = "semanticVersioning")
    protected String semanticVersioning;
    @XmlAttribute(name = "title")
    protected String title;

    /**
     * Gets the value of the classes property.
     * 
     * @return
     *     possible object is
     *     {@link JApiCmpXmlRoot.Classes }
     *     
     */
    public JApiCmpXmlRoot.Classes getClasses() {
        return classes;
    }

    /**
     * Sets the value of the classes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiCmpXmlRoot.Classes }
     *     
     */
    public void setClasses(JApiCmpXmlRoot.Classes value) {
        this.classes = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessModifier(String value) {
        this.accessModifier = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimestamp(String value) {
        this.creationTimestamp = value;
    }

    /**
     * Gets the value of the ignoreMissingClasses property.
     * 
     */
    public boolean isIgnoreMissingClasses() {
        return ignoreMissingClasses;
    }

    /**
     * Sets the value of the ignoreMissingClasses property.
     * 
     */
    public void setIgnoreMissingClasses(boolean value) {
        this.ignoreMissingClasses = value;
    }

    /**
     * Gets the value of the ignoreMissingClassesByRegularExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreMissingClassesByRegularExpressions() {
        return ignoreMissingClassesByRegularExpressions;
    }

    /**
     * Sets the value of the ignoreMissingClassesByRegularExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreMissingClassesByRegularExpressions(String value) {
        this.ignoreMissingClassesByRegularExpressions = value;
    }

    /**
     * Gets the value of the newJar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewJar() {
        return newJar;
    }

    /**
     * Sets the value of the newJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewJar(String value) {
        this.newJar = value;
    }

    /**
     * Gets the value of the oldJar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldJar() {
        return oldJar;
    }

    /**
     * Sets the value of the oldJar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldJar(String value) {
        this.oldJar = value;
    }

    /**
     * Gets the value of the onlyBinaryIncompatibleModifications property.
     * 
     */
    public boolean isOnlyBinaryIncompatibleModifications() {
        return onlyBinaryIncompatibleModifications;
    }

    /**
     * Sets the value of the onlyBinaryIncompatibleModifications property.
     * 
     */
    public void setOnlyBinaryIncompatibleModifications(boolean value) {
        this.onlyBinaryIncompatibleModifications = value;
    }

    /**
     * Gets the value of the onlyModifications property.
     * 
     */
    public boolean isOnlyModifications() {
        return onlyModifications;
    }

    /**
     * Sets the value of the onlyModifications property.
     * 
     */
    public void setOnlyModifications(boolean value) {
        this.onlyModifications = value;
    }

    /**
     * Gets the value of the packagesExclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagesExclude() {
        return packagesExclude;
    }

    /**
     * Sets the value of the packagesExclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagesExclude(String value) {
        this.packagesExclude = value;
    }

    /**
     * Gets the value of the packagesInclude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagesInclude() {
        return packagesInclude;
    }

    /**
     * Sets the value of the packagesInclude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagesInclude(String value) {
        this.packagesInclude = value;
    }

    /**
     * Gets the value of the semanticVersioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSemanticVersioning() {
        return semanticVersioning;
    }

    /**
     * Sets the value of the semanticVersioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSemanticVersioning(String value) {
        this.semanticVersioning = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="class" type="{}jApiClass" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "clazz"
    })
    public static class Classes {

        @XmlElement(name = "class")
        protected List<JApiClass> clazz;

        /**
         * Gets the value of the clazz property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the clazz property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClazz().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiClass }
         * 
         * 
         */
        public List<JApiClass> getClazz() {
            if (clazz == null) {
                clazz = new ArrayList<JApiClass>();
            }
            return this.clazz;
        }

    }

}
