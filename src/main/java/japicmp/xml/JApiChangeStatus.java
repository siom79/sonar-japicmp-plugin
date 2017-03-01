
package japicmp.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiChangeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jApiChangeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="REMOVED"/>
 *     &lt;enumeration value="UNCHANGED"/>
 *     &lt;enumeration value="MODIFIED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jApiChangeStatus")
@XmlEnum
public enum JApiChangeStatus {

    NEW,
    REMOVED,
    UNCHANGED,
    MODIFIED;

    public String value() {
        return name();
    }

    public static JApiChangeStatus fromValue(String v) {
        return valueOf(v);
    }

}
