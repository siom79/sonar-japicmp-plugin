
package japicmp.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiAnnotationElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiAnnotationElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compatibilityChanges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="compatibilityChange" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="newElementValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="newElementValue" type="{}jApiAnnotationElementValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="oldElementValues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="oldElementValue" type="{}jApiAnnotationElementValue" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="binaryCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="changeStatus" type="{}jApiChangeStatus" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiAnnotationElement", propOrder = {
    "compatibilityChanges",
    "newElementValues",
    "oldElementValues"
})
public class JApiAnnotationElement {

    protected JApiAnnotationElement.CompatibilityChanges compatibilityChanges;
    protected JApiAnnotationElement.NewElementValues newElementValues;
    protected JApiAnnotationElement.OldElementValues oldElementValues;
    @XmlAttribute(name = "binaryCompatible", required = true)
    protected boolean binaryCompatible;
    @XmlAttribute(name = "changeStatus")
    protected JApiChangeStatus changeStatus;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "sourceCompatible", required = true)
    protected boolean sourceCompatible;

    /**
     * Gets the value of the compatibilityChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JApiAnnotationElement.CompatibilityChanges }
     *     
     */
    public JApiAnnotationElement.CompatibilityChanges getCompatibilityChanges() {
        return compatibilityChanges;
    }

    /**
     * Sets the value of the compatibilityChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiAnnotationElement.CompatibilityChanges }
     *     
     */
    public void setCompatibilityChanges(JApiAnnotationElement.CompatibilityChanges value) {
        this.compatibilityChanges = value;
    }

    /**
     * Gets the value of the newElementValues property.
     * 
     * @return
     *     possible object is
     *     {@link JApiAnnotationElement.NewElementValues }
     *     
     */
    public JApiAnnotationElement.NewElementValues getNewElementValues() {
        return newElementValues;
    }

    /**
     * Sets the value of the newElementValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiAnnotationElement.NewElementValues }
     *     
     */
    public void setNewElementValues(JApiAnnotationElement.NewElementValues value) {
        this.newElementValues = value;
    }

    /**
     * Gets the value of the oldElementValues property.
     * 
     * @return
     *     possible object is
     *     {@link JApiAnnotationElement.OldElementValues }
     *     
     */
    public JApiAnnotationElement.OldElementValues getOldElementValues() {
        return oldElementValues;
    }

    /**
     * Sets the value of the oldElementValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiAnnotationElement.OldElementValues }
     *     
     */
    public void setOldElementValues(JApiAnnotationElement.OldElementValues value) {
        this.oldElementValues = value;
    }

    /**
     * Gets the value of the binaryCompatible property.
     * 
     */
    public boolean isBinaryCompatible() {
        return binaryCompatible;
    }

    /**
     * Sets the value of the binaryCompatible property.
     * 
     */
    public void setBinaryCompatible(boolean value) {
        this.binaryCompatible = value;
    }

    /**
     * Gets the value of the changeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JApiChangeStatus }
     *     
     */
    public JApiChangeStatus getChangeStatus() {
        return changeStatus;
    }

    /**
     * Sets the value of the changeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiChangeStatus }
     *     
     */
    public void setChangeStatus(JApiChangeStatus value) {
        this.changeStatus = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the sourceCompatible property.
     * 
     */
    public boolean isSourceCompatible() {
        return sourceCompatible;
    }

    /**
     * Sets the value of the sourceCompatible property.
     * 
     */
    public void setSourceCompatible(boolean value) {
        this.sourceCompatible = value;
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
     *         &lt;element name="compatibilityChange" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
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
        "compatibilityChange"
    })
    public static class CompatibilityChanges {

        protected List<Object> compatibilityChange;

        /**
         * Gets the value of the compatibilityChange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the compatibilityChange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompatibilityChange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getCompatibilityChange() {
            if (compatibilityChange == null) {
                compatibilityChange = new ArrayList<Object>();
            }
            return this.compatibilityChange;
        }

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
     *         &lt;element name="newElementValue" type="{}jApiAnnotationElementValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "newElementValue"
    })
    public static class NewElementValues {

        protected List<JApiAnnotationElementValue> newElementValue;

        /**
         * Gets the value of the newElementValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the newElementValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNewElementValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiAnnotationElementValue }
         * 
         * 
         */
        public List<JApiAnnotationElementValue> getNewElementValue() {
            if (newElementValue == null) {
                newElementValue = new ArrayList<JApiAnnotationElementValue>();
            }
            return this.newElementValue;
        }

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
     *         &lt;element name="oldElementValue" type="{}jApiAnnotationElementValue" maxOccurs="unbounded" minOccurs="0"/>
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
        "oldElementValue"
    })
    public static class OldElementValues {

        protected List<JApiAnnotationElementValue> oldElementValue;

        /**
         * Gets the value of the oldElementValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oldElementValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOldElementValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiAnnotationElementValue }
         * 
         * 
         */
        public List<JApiAnnotationElementValue> getOldElementValue() {
            if (oldElementValue == null) {
                oldElementValue = new ArrayList<JApiAnnotationElementValue>();
            }
            return this.oldElementValue;
        }

    }

}
