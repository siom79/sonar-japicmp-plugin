
package japicmp.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiImplementedInterface complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiImplementedInterface">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compatibilityChanges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="compatibilityChange" type="{}jApiCompatibilityChange" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="binaryCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="changeStatus" type="{}jApiChangeStatus" />
 *       &lt;attribute name="fullyQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiImplementedInterface", propOrder = {
    "compatibilityChanges"
})
public class JApiImplementedInterface {

    protected JApiImplementedInterface.CompatibilityChanges compatibilityChanges;
    @XmlAttribute(name = "binaryCompatible", required = true)
    protected boolean binaryCompatible;
    @XmlAttribute(name = "changeStatus")
    protected JApiChangeStatus changeStatus;
    @XmlAttribute(name = "fullyQualifiedName")
    protected String fullyQualifiedName;
    @XmlAttribute(name = "sourceCompatible", required = true)
    protected boolean sourceCompatible;

    /**
     * Gets the value of the compatibilityChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JApiImplementedInterface.CompatibilityChanges }
     *     
     */
    public JApiImplementedInterface.CompatibilityChanges getCompatibilityChanges() {
        return compatibilityChanges;
    }

    /**
     * Sets the value of the compatibilityChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiImplementedInterface.CompatibilityChanges }
     *     
     */
    public void setCompatibilityChanges(JApiImplementedInterface.CompatibilityChanges value) {
        this.compatibilityChanges = value;
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
     * Gets the value of the fullyQualifiedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * Sets the value of the fullyQualifiedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullyQualifiedName(String value) {
        this.fullyQualifiedName = value;
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
     *         &lt;element name="compatibilityChange" type="{}jApiCompatibilityChange" maxOccurs="unbounded" minOccurs="0"/>
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

        protected List<JApiCompatibilityChange> compatibilityChange;

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
         * {@link JApiCompatibilityChange }
         * 
         * 
         */
        public List<JApiCompatibilityChange> getCompatibilityChange() {
            if (compatibilityChange == null) {
                compatibilityChange = new ArrayList<JApiCompatibilityChange>();
            }
            return this.compatibilityChange;
        }

    }

}