
package japicmp.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiMethod">
 *   &lt;complexContent>
 *     &lt;extension base="{}jApiBehavior">
 *       &lt;sequence>
 *         &lt;element name="returnType" type="{}jApiReturnType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiMethod", propOrder = {
    "returnType"
})
public class JApiMethod
    extends JApiBehavior
{

    protected JApiReturnType returnType;

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link JApiReturnType }
     *     
     */
    public JApiReturnType getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiReturnType }
     *     
     */
    public void setReturnType(JApiReturnType value) {
        this.returnType = value;
    }

}
