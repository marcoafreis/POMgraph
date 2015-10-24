
package com.marcoafreis.java.utils.pomgraph.xml.ds;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         
 *         The <code>&lt;scm&gt;</code> element contains informations required to the SCM
 *         (Source Control Management) of the project.
 *         
 *       
 * 
 * <p>Java class for Scm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Scm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="developerConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Scm", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Scm {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String connection;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String developerConnection;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "HEAD")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String tag;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String url;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the developerConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDeveloperConnection() {
        return developerConnection;
    }

    /**
     * Sets the value of the developerConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDeveloperConnection(String value) {
        this.developerConnection = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUrl(String value) {
        this.url = value;
    }

}
