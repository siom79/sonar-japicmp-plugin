
package japicmp.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for jApiClass complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jApiClass">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="annotations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="annotation" type="{}jApiAnnotation" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attribute" type="{}jApiAttribute" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="classType" type="{}jApiClassType" minOccurs="0"/>
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
 *         &lt;element name="constructors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="constructor" type="{}jApiConstructor" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fields" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="field" type="{}jApiField" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="interfaces" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="interface" type="{}jApiImplementedInterface" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="methods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="method" type="{}jApiMethod" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modifiers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="modifier" type="{}jApiModifier" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="serialVersionUid" type="{}jApiSerialVersionUid" minOccurs="0"/>
 *         &lt;element name="superclass" type="{}jApiSuperclass" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="binaryCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="changeStatus" type="{}jApiChangeStatus" />
 *       &lt;attribute name="fullyQualifiedName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="javaObjectSerializationCompatible" type="{}jApiJavaObjectSerializationChangeStatus" />
 *       &lt;attribute name="javaObjectSerializationCompatibleAsString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sourceCompatible" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jApiClass", propOrder = {
    "annotations",
    "attributes",
    "classType",
    "compatibilityChanges",
    "constructors",
    "fields",
    "interfaces",
    "methods",
    "modifiers",
    "serialVersionUid",
    "superclass"
})
public class JApiClass {

    protected JApiClass.Annotations annotations;
    protected JApiClass.Attributes attributes;
    protected JApiClassType classType;
    protected JApiClass.CompatibilityChanges compatibilityChanges;
    protected JApiClass.Constructors constructors;
    protected JApiClass.Fields fields;
    protected JApiClass.Interfaces interfaces;
    protected JApiClass.Methods methods;
    protected JApiClass.Modifiers modifiers;
    protected JApiSerialVersionUid serialVersionUid;
    protected JApiSuperclass superclass;
    @XmlAttribute(name = "binaryCompatible", required = true)
    protected boolean binaryCompatible;
    @XmlAttribute(name = "changeStatus")
    protected JApiChangeStatus changeStatus;
    @XmlAttribute(name = "fullyQualifiedName")
    protected String fullyQualifiedName;
    @XmlAttribute(name = "javaObjectSerializationCompatible")
    protected JApiJavaObjectSerializationChangeStatus javaObjectSerializationCompatible;
    @XmlAttribute(name = "javaObjectSerializationCompatibleAsString")
    protected String javaObjectSerializationCompatibleAsString;
    @XmlAttribute(name = "sourceCompatible", required = true)
    protected boolean sourceCompatible;

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Annotations }
     *     
     */
    public JApiClass.Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Annotations }
     *     
     */
    public void setAnnotations(JApiClass.Annotations value) {
        this.annotations = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Attributes }
     *     
     */
    public JApiClass.Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Attributes }
     *     
     */
    public void setAttributes(JApiClass.Attributes value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the classType property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClassType }
     *     
     */
    public JApiClassType getClassType() {
        return classType;
    }

    /**
     * Sets the value of the classType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClassType }
     *     
     */
    public void setClassType(JApiClassType value) {
        this.classType = value;
    }

    /**
     * Gets the value of the compatibilityChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.CompatibilityChanges }
     *     
     */
    public JApiClass.CompatibilityChanges getCompatibilityChanges() {
        return compatibilityChanges;
    }

    /**
     * Sets the value of the compatibilityChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.CompatibilityChanges }
     *     
     */
    public void setCompatibilityChanges(JApiClass.CompatibilityChanges value) {
        this.compatibilityChanges = value;
    }

    /**
     * Gets the value of the constructors property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Constructors }
     *     
     */
    public JApiClass.Constructors getConstructors() {
        return constructors;
    }

    /**
     * Sets the value of the constructors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Constructors }
     *     
     */
    public void setConstructors(JApiClass.Constructors value) {
        this.constructors = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Fields }
     *     
     */
    public JApiClass.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Fields }
     *     
     */
    public void setFields(JApiClass.Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the interfaces property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Interfaces }
     *     
     */
    public JApiClass.Interfaces getInterfaces() {
        return interfaces;
    }

    /**
     * Sets the value of the interfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Interfaces }
     *     
     */
    public void setInterfaces(JApiClass.Interfaces value) {
        this.interfaces = value;
    }

    /**
     * Gets the value of the methods property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Methods }
     *     
     */
    public JApiClass.Methods getMethods() {
        return methods;
    }

    /**
     * Sets the value of the methods property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Methods }
     *     
     */
    public void setMethods(JApiClass.Methods value) {
        this.methods = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link JApiClass.Modifiers }
     *     
     */
    public JApiClass.Modifiers getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiClass.Modifiers }
     *     
     */
    public void setModifiers(JApiClass.Modifiers value) {
        this.modifiers = value;
    }

    /**
     * Gets the value of the serialVersionUid property.
     * 
     * @return
     *     possible object is
     *     {@link JApiSerialVersionUid }
     *     
     */
    public JApiSerialVersionUid getSerialVersionUid() {
        return serialVersionUid;
    }

    /**
     * Sets the value of the serialVersionUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiSerialVersionUid }
     *     
     */
    public void setSerialVersionUid(JApiSerialVersionUid value) {
        this.serialVersionUid = value;
    }

    /**
     * Gets the value of the superclass property.
     * 
     * @return
     *     possible object is
     *     {@link JApiSuperclass }
     *     
     */
    public JApiSuperclass getSuperclass() {
        return superclass;
    }

    /**
     * Sets the value of the superclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiSuperclass }
     *     
     */
    public void setSuperclass(JApiSuperclass value) {
        this.superclass = value;
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
     * Gets the value of the javaObjectSerializationCompatible property.
     * 
     * @return
     *     possible object is
     *     {@link JApiJavaObjectSerializationChangeStatus }
     *     
     */
    public JApiJavaObjectSerializationChangeStatus getJavaObjectSerializationCompatible() {
        return javaObjectSerializationCompatible;
    }

    /**
     * Sets the value of the javaObjectSerializationCompatible property.
     * 
     * @param value
     *     allowed object is
     *     {@link JApiJavaObjectSerializationChangeStatus }
     *     
     */
    public void setJavaObjectSerializationCompatible(JApiJavaObjectSerializationChangeStatus value) {
        this.javaObjectSerializationCompatible = value;
    }

    /**
     * Gets the value of the javaObjectSerializationCompatibleAsString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaObjectSerializationCompatibleAsString() {
        return javaObjectSerializationCompatibleAsString;
    }

    /**
     * Sets the value of the javaObjectSerializationCompatibleAsString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaObjectSerializationCompatibleAsString(String value) {
        this.javaObjectSerializationCompatibleAsString = value;
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
     *         &lt;element name="annotation" type="{}jApiAnnotation" maxOccurs="unbounded" minOccurs="0"/>
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
        "annotation"
    })
    public static class Annotations {

        protected List<JApiAnnotation> annotation;

        /**
         * Gets the value of the annotation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiAnnotation }
         * 
         * 
         */
        public List<JApiAnnotation> getAnnotation() {
            if (annotation == null) {
                annotation = new ArrayList<JApiAnnotation>();
            }
            return this.annotation;
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
     *         &lt;element name="attribute" type="{}jApiAttribute" maxOccurs="unbounded" minOccurs="0"/>
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
        "attribute"
    })
    public static class Attributes {

        protected List<JApiAttribute> attribute;

        /**
         * Gets the value of the attribute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attribute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttribute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiAttribute }
         * 
         * 
         */
        public List<JApiAttribute> getAttribute() {
            if (attribute == null) {
                attribute = new ArrayList<JApiAttribute>();
            }
            return this.attribute;
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
     *         &lt;element name="constructor" type="{}jApiConstructor" maxOccurs="unbounded" minOccurs="0"/>
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
        "constructor"
    })
    public static class Constructors {

        protected List<JApiConstructor> constructor;

        /**
         * Gets the value of the constructor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the constructor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConstructor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiConstructor }
         * 
         * 
         */
        public List<JApiConstructor> getConstructor() {
            if (constructor == null) {
                constructor = new ArrayList<JApiConstructor>();
            }
            return this.constructor;
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
     *         &lt;element name="field" type="{}jApiField" maxOccurs="unbounded" minOccurs="0"/>
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
        "field"
    })
    public static class Fields {

        protected List<JApiField> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiField }
         * 
         * 
         */
        public List<JApiField> getField() {
            if (field == null) {
                field = new ArrayList<JApiField>();
            }
            return this.field;
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
     *         &lt;element name="interface" type="{}jApiImplementedInterface" maxOccurs="unbounded" minOccurs="0"/>
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
        "_interface"
    })
    public static class Interfaces {

        @XmlElement(name = "interface")
        protected List<JApiImplementedInterface> _interface;

        /**
         * Gets the value of the interface property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the interface property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterface().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiImplementedInterface }
         * 
         * 
         */
        public List<JApiImplementedInterface> getInterface() {
            if (_interface == null) {
                _interface = new ArrayList<JApiImplementedInterface>();
            }
            return this._interface;
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
     *         &lt;element name="method" type="{}jApiMethod" maxOccurs="unbounded" minOccurs="0"/>
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
        "method"
    })
    public static class Methods {

        protected List<JApiMethod> method;

        /**
         * Gets the value of the method property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the method property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiMethod }
         * 
         * 
         */
        public List<JApiMethod> getMethod() {
            if (method == null) {
                method = new ArrayList<JApiMethod>();
            }
            return this.method;
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
     *         &lt;element name="modifier" type="{}jApiModifier" maxOccurs="unbounded" minOccurs="0"/>
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
        "modifier"
    })
    public static class Modifiers {

        protected List<JApiModifier> modifier;

        /**
         * Gets the value of the modifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JApiModifier }
         * 
         * 
         */
        public List<JApiModifier> getModifier() {
            if (modifier == null) {
                modifier = new ArrayList<JApiModifier>();
            }
            return this.modifier;
        }

    }

}
