
package japicmp.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="changeStatus" type="{}jApiChangeStatus" />
 *       &lt;attribute name="newType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oldType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiClassType")
public class JApiClassType {

    @XmlAttribute(name = "changeStatus")
    protected JApiChangeStatus changeStatus;
    @XmlAttribute(name = "newType")
    protected String newType;
    @XmlAttribute(name = "oldType")
    protected String oldType;

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
     * Gets the value of the newType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewType() {
        return newType;
    }

    /**
     * Sets the value of the newType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewType(String value) {
        this.newType = value;
    }

    /**
     * Gets the value of the oldType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldType() {
        return oldType;
    }

    /**
     * Sets the value of the oldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldType(String value) {
        this.oldType = value;
    }

}
