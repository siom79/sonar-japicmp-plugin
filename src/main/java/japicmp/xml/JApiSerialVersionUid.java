
package japicmp.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiSerialVersionUid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiSerialVersionUid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="serialVersionUidDefaultNew" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serialVersionUidDefaultOld" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serialVersionUidInClassNew" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serialVersionUidInClassOld" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serializableNew" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="serializableOld" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiSerialVersionUid")
public class JApiSerialVersionUid {

    @XmlAttribute(name = "serialVersionUidDefaultNew")
    protected String serialVersionUidDefaultNew;
    @XmlAttribute(name = "serialVersionUidDefaultOld")
    protected String serialVersionUidDefaultOld;
    @XmlAttribute(name = "serialVersionUidInClassNew")
    protected String serialVersionUidInClassNew;
    @XmlAttribute(name = "serialVersionUidInClassOld")
    protected String serialVersionUidInClassOld;
    @XmlAttribute(name = "serializableNew", required = true)
    protected boolean serializableNew;
    @XmlAttribute(name = "serializableOld", required = true)
    protected boolean serializableOld;

    /**
     * Gets the value of the serialVersionUidDefaultNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialVersionUidDefaultNew() {
        return serialVersionUidDefaultNew;
    }

    /**
     * Sets the value of the serialVersionUidDefaultNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialVersionUidDefaultNew(String value) {
        this.serialVersionUidDefaultNew = value;
    }

    /**
     * Gets the value of the serialVersionUidDefaultOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialVersionUidDefaultOld() {
        return serialVersionUidDefaultOld;
    }

    /**
     * Sets the value of the serialVersionUidDefaultOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialVersionUidDefaultOld(String value) {
        this.serialVersionUidDefaultOld = value;
    }

    /**
     * Gets the value of the serialVersionUidInClassNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialVersionUidInClassNew() {
        return serialVersionUidInClassNew;
    }

    /**
     * Sets the value of the serialVersionUidInClassNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialVersionUidInClassNew(String value) {
        this.serialVersionUidInClassNew = value;
    }

    /**
     * Gets the value of the serialVersionUidInClassOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialVersionUidInClassOld() {
        return serialVersionUidInClassOld;
    }

    /**
     * Sets the value of the serialVersionUidInClassOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialVersionUidInClassOld(String value) {
        this.serialVersionUidInClassOld = value;
    }

    /**
     * Gets the value of the serializableNew property.
     * 
     */
    public boolean isSerializableNew() {
        return serializableNew;
    }

    /**
     * Sets the value of the serializableNew property.
     * 
     */
    public void setSerializableNew(boolean value) {
        this.serializableNew = value;
    }

    /**
     * Gets the value of the serializableOld property.
     * 
     */
    public boolean isSerializableOld() {
        return serializableOld;
    }

    /**
     * Sets the value of the serializableOld property.
     * 
     */
    public void setSerializableOld(boolean value) {
        this.serializableOld = value;
    }

}
