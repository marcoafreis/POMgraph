
package com.marcoafreis.java.utils.pomgraph.xml.ds;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         
 *         The <code>&lt;exclusion&gt;</code> element contains informations required to exclude
 *         an artifact to the project.
 *         
 *       
 * 
 * <p>Java class for Exclusion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Exclusion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exclusion", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Exclusion {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String groupId;

    /**
     * Gets the value of the artifactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * Sets the value of the artifactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setArtifactId(String value) {
        this.artifactId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setGroupId(String value) {
        this.groupId = value;
    }

}
