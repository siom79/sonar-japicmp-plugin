
package japicmp.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiCompatibilityChange.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="jApiCompatibilityChange">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASS_REMOVED"/>
 *     &lt;enumeration value="CLASS_NOW_ABSTRACT"/>
 *     &lt;enumeration value="CLASS_NOW_FINAL"/>
 *     &lt;enumeration value="CLASS_NO_LONGER_PUBLIC"/>
 *     &lt;enumeration value="CLASS_TYPE_CHANGED"/>
 *     &lt;enumeration value="CLASS_NOW_CHECKED_EXCEPTION"/>
 *     &lt;enumeration value="SUPERCLASS_REMOVED"/>
 *     &lt;enumeration value="SUPERCLASS_ADDED"/>
 *     &lt;enumeration value="SUPERCLASS_MODIFIED_INCOMPATIBLE"/>
 *     &lt;enumeration value="INTERFACE_ADDED"/>
 *     &lt;enumeration value="INTERFACE_REMOVED"/>
 *     &lt;enumeration value="METHOD_REMOVED"/>
 *     &lt;enumeration value="METHOD_REMOVED_IN_SUPERCLASS"/>
 *     &lt;enumeration value="METHOD_LESS_ACCESSIBLE"/>
 *     &lt;enumeration value="METHOD_LESS_ACCESSIBLE_THAN_IN_SUPERCLASS"/>
 *     &lt;enumeration value="METHOD_IS_STATIC_AND_OVERRIDES_NOT_STATIC"/>
 *     &lt;enumeration value="METHOD_RETURN_TYPE_CHANGED"/>
 *     &lt;enumeration value="METHOD_NOW_ABSTRACT"/>
 *     &lt;enumeration value="METHOD_NOW_FINAL"/>
 *     &lt;enumeration value="METHOD_NOW_STATIC"/>
 *     &lt;enumeration value="METHOD_NO_LONGER_STATIC"/>
 *     &lt;enumeration value="METHOD_ADDED_TO_INTERFACE"/>
 *     &lt;enumeration value="METHOD_NOW_THROWS_CHECKED_EXCEPTION"/>
 *     &lt;enumeration value="METHOD_ABSTRACT_ADDED_TO_CLASS"/>
 *     &lt;enumeration value="METHOD_ABSTRACT_ADDED_IN_SUPERCLASS"/>
 *     &lt;enumeration value="METHOD_ABSTRACT_ADDED_IN_IMPLEMENTED_INTERFACE"/>
 *     &lt;enumeration value="FIELD_STATIC_AND_OVERRIDES_STATIC"/>
 *     &lt;enumeration value="FIELD_LESS_ACCESSIBLE_THAN_IN_SUPERCLASS"/>
 *     &lt;enumeration value="FIELD_NOW_FINAL"/>
 *     &lt;enumeration value="FIELD_NOW_STATIC"/>
 *     &lt;enumeration value="FIELD_NO_LONGER_STATIC"/>
 *     &lt;enumeration value="FIELD_TYPE_CHANGED"/>
 *     &lt;enumeration value="FIELD_REMOVED"/>
 *     &lt;enumeration value="FIELD_REMOVED_IN_SUPERCLASS"/>
 *     &lt;enumeration value="FIELD_LESS_ACCESSIBLE"/>
 *     &lt;enumeration value="CONSTRUCTOR_REMOVED"/>
 *     &lt;enumeration value="CONSTRUCTOR_LESS_ACCESSIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "jApiCompatibilityChange")
@XmlEnum
public enum JApiCompatibilityChange {

    CLASS_REMOVED,
    CLASS_NOW_ABSTRACT,
    CLASS_NOW_FINAL,
    CLASS_NO_LONGER_PUBLIC,
    CLASS_TYPE_CHANGED,
    CLASS_NOW_CHECKED_EXCEPTION,
    SUPERCLASS_REMOVED,
    SUPERCLASS_ADDED,
    SUPERCLASS_MODIFIED_INCOMPATIBLE,
    INTERFACE_ADDED,
    INTERFACE_REMOVED,
    METHOD_REMOVED,
    METHOD_REMOVED_IN_SUPERCLASS,
    METHOD_LESS_ACCESSIBLE,
    METHOD_LESS_ACCESSIBLE_THAN_IN_SUPERCLASS,
    METHOD_IS_STATIC_AND_OVERRIDES_NOT_STATIC,
    METHOD_RETURN_TYPE_CHANGED,
    METHOD_NOW_ABSTRACT,
    METHOD_NOW_FINAL,
    METHOD_NOW_STATIC,
    METHOD_NO_LONGER_STATIC,
    METHOD_ADDED_TO_INTERFACE,
    METHOD_NOW_THROWS_CHECKED_EXCEPTION,
    METHOD_ABSTRACT_ADDED_TO_CLASS,
    METHOD_ABSTRACT_ADDED_IN_SUPERCLASS,
    METHOD_ABSTRACT_ADDED_IN_IMPLEMENTED_INTERFACE,
    FIELD_STATIC_AND_OVERRIDES_STATIC,
    FIELD_LESS_ACCESSIBLE_THAN_IN_SUPERCLASS,
    FIELD_NOW_FINAL,
    FIELD_NOW_STATIC,
    FIELD_NO_LONGER_STATIC,
    FIELD_TYPE_CHANGED,
    FIELD_REMOVED,
    FIELD_REMOVED_IN_SUPERCLASS,
    FIELD_LESS_ACCESSIBLE,
    CONSTRUCTOR_REMOVED,
    CONSTRUCTOR_LESS_ACCESSIBLE;

    public String value() {
        return name();
    }

    public static JApiCompatibilityChange fromValue(String v) {
        return valueOf(v);
    }

}
