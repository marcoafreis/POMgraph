
package com.marcoafreis.java.utils.pomgraph.xml.ds;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the file specification used to activate the profile. The <code>missing</code> value
 *         is the location of a file that needs to exist, and if it doesn't, the profile will be
 *         activated. On the other hand, <code>exists</code> will test for the existence of the file and if it is
 *         there, the profile will be activated.<br/>
 *         Variable interpolation for these file specifications is limited to <code>${basedir}</code>,
 *         System properties and request properties.
 * 
 * <p>Java class for ActivationFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivationFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="missing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationFile", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ActivationFile {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String missing;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String exists;

    /**
     * Gets the value of the missing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMissing() {
        return missing;
    }

    /**
     * Sets the value of the missing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMissing(String value) {
        this.missing = value;
    }

    /**
     * Gets the value of the exists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getExists() {
        return exists;
    }

    /**
     * Sets the value of the exists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setExists(String value) {
        this.exists = value;
    }

}
