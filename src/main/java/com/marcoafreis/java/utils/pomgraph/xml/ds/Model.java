
package com.marcoafreis.java.utils.pomgraph.xml.ds;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * 
 *         
 *         The <code>&lt;project&gt;</code> element is the root of the descriptor.
 *         The following table lists all of the possible child elements.
 *         
 *       
 * 
 * <p>Java class for Model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Model">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://maven.apache.org/POM/4.0.0}Parent" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inceptionYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="organization" type="{http://maven.apache.org/POM/4.0.0}Organization" minOccurs="0"/>
 *         &lt;element name="licenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="developers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contributors" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mailingLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prerequisites" type="{http://maven.apache.org/POM/4.0.0}Prerequisites" minOccurs="0"/>
 *         &lt;element name="modules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scm" type="{http://maven.apache.org/POM/4.0.0}Scm" minOccurs="0"/>
 *         &lt;element name="issueManagement" type="{http://maven.apache.org/POM/4.0.0}IssueManagement" minOccurs="0"/>
 *         &lt;element name="ciManagement" type="{http://maven.apache.org/POM/4.0.0}CiManagement" minOccurs="0"/>
 *         &lt;element name="distributionManagement" type="{http://maven.apache.org/POM/4.0.0}DistributionManagement" minOccurs="0"/>
 *         &lt;element name="properties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dependencyManagement" type="{http://maven.apache.org/POM/4.0.0}DependencyManagement" minOccurs="0"/>
 *         &lt;element name="dependencies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="repositories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pluginRepositories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}Build" minOccurs="0"/>
 *         &lt;element name="reports" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reporting" type="{http://maven.apache.org/POM/4.0.0}Reporting" minOccurs="0"/>
 *         &lt;element name="profiles" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Model", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Model {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String modelVersion;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Parent parent;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String groupId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String version;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "jar")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String packaging;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String description;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String url;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String inceptionYear;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Organization organization;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Licenses licenses;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Developers developers;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Contributors contributors;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.MailingLists mailingLists;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Prerequisites prerequisites;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Modules modules;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Scm scm;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected IssueManagement issueManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CiManagement ciManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DistributionManagement distributionManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Properties properties;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected DependencyManagement dependencyManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Dependencies dependencies;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Repositories repositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.PluginRepositories pluginRepositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Build build;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Reports reports;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Reporting reporting;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Model.Profiles profiles;

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setParent(Parent value) {
        this.parent = value;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPackaging(String value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDescription(String value) {
        this.description = value;
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

    /**
     * Gets the value of the inceptionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getInceptionYear() {
        return inceptionYear;
    }

    /**
     * Sets the value of the inceptionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setInceptionYear(String value) {
        this.inceptionYear = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Licenses }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Licenses getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Licenses }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLicenses(Model.Licenses value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the developers property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Developers }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Developers getDevelopers() {
        return developers;
    }

    /**
     * Sets the value of the developers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Developers }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDevelopers(Model.Developers value) {
        this.developers = value;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Contributors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Contributors getContributors() {
        return contributors;
    }

    /**
     * Sets the value of the contributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Contributors }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setContributors(Model.Contributors value) {
        this.contributors = value;
    }

    /**
     * Gets the value of the mailingLists property.
     * 
     * @return
     *     possible object is
     *     {@link Model.MailingLists }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.MailingLists getMailingLists() {
        return mailingLists;
    }

    /**
     * Sets the value of the mailingLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.MailingLists }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMailingLists(Model.MailingLists value) {
        this.mailingLists = value;
    }

    /**
     * Gets the value of the prerequisites property.
     * 
     * @return
     *     possible object is
     *     {@link Prerequisites }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Prerequisites getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the value of the prerequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prerequisites }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrerequisites(Prerequisites value) {
        this.prerequisites = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Modules }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Modules }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setModules(Model.Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the scm property.
     * 
     * @return
     *     possible object is
     *     {@link Scm }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Scm getScm() {
        return scm;
    }

    /**
     * Sets the value of the scm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scm }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setScm(Scm value) {
        this.scm = value;
    }

    /**
     * Gets the value of the issueManagement property.
     * 
     * @return
     *     possible object is
     *     {@link IssueManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public IssueManagement getIssueManagement() {
        return issueManagement;
    }

    /**
     * Sets the value of the issueManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIssueManagement(IssueManagement value) {
        this.issueManagement = value;
    }

    /**
     * Gets the value of the ciManagement property.
     * 
     * @return
     *     possible object is
     *     {@link CiManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CiManagement getCiManagement() {
        return ciManagement;
    }

    /**
     * Sets the value of the ciManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setCiManagement(CiManagement value) {
        this.ciManagement = value;
    }

    /**
     * Gets the value of the distributionManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DistributionManagement getDistributionManagement() {
        return distributionManagement;
    }

    /**
     * Sets the value of the distributionManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDistributionManagement(DistributionManagement value) {
        this.distributionManagement = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Properties }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Properties }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProperties(Model.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the dependencyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DependencyManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public DependencyManagement getDependencyManagement() {
        return dependencyManagement;
    }

    /**
     * Sets the value of the dependencyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyManagement }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDependencyManagement(DependencyManagement value) {
        this.dependencyManagement = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Dependencies }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Dependencies }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setDependencies(Model.Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the repositories property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Repositories }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Repositories getRepositories() {
        return repositories;
    }

    /**
     * Sets the value of the repositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Repositories }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRepositories(Model.Repositories value) {
        this.repositories = value;
    }

    /**
     * Gets the value of the pluginRepositories property.
     * 
     * @return
     *     possible object is
     *     {@link Model.PluginRepositories }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.PluginRepositories getPluginRepositories() {
        return pluginRepositories;
    }

    /**
     * Sets the value of the pluginRepositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.PluginRepositories }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPluginRepositories(Model.PluginRepositories value) {
        this.pluginRepositories = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link Build }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Build getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setBuild(Build value) {
        this.build = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Reports }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Reports }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReports(Model.Reports value) {
        this.reports = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Reporting getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setReporting(Reporting value) {
        this.reporting = value;
    }

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link Model.Profiles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Model.Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Model.Profiles }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setProfiles(Model.Profiles value) {
        this.profiles = value;
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
     *         &lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/>
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
        "contributor"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Contributors {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Contributor> contributor;

        /**
         * Gets the value of the contributor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contributor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContributor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Contributor }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Contributor> getContributor() {
            if (contributor == null) {
                contributor = new ArrayList<Contributor>();
            }
            return this.contributor;
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
     *         &lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
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
        "dependency"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Dependencies {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Dependency> dependency;

        /**
         * Gets the value of the dependency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dependency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDependency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dependency }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Dependency> getDependency() {
            if (dependency == null) {
                dependency = new ArrayList<Dependency>();
            }
            return this.dependency;
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
     *         &lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/>
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
        "developer"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Developers {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Developer> developer;

        /**
         * Gets the value of the developer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the developer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDeveloper().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Developer }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Developer> getDeveloper() {
            if (developer == null) {
                developer = new ArrayList<Developer>();
            }
            return this.developer;
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
     *         &lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/>
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
        "license"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Licenses {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<License> license;

        /**
         * Gets the value of the license property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the license property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLicense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link License }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<License> getLicense() {
            if (license == null) {
                license = new ArrayList<License>();
            }
            return this.license;
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
     *         &lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/>
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
        "mailingList"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class MailingLists {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<MailingList> mailingList;

        /**
         * Gets the value of the mailingList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mailingList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMailingList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MailingList }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<MailingList> getMailingList() {
            if (mailingList == null) {
                mailingList = new ArrayList<MailingList>();
            }
            return this.mailingList;
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
     *         &lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "module"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Modules {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<String> module;

        /**
         * Gets the value of the module property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the module property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<String> getModule() {
            if (module == null) {
                module = new ArrayList<String>();
            }
            return this.module;
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
     *         &lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
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
        "pluginRepository"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class PluginRepositories {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Repository> pluginRepository;

        /**
         * Gets the value of the pluginRepository property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pluginRepository property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPluginRepository().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Repository> getPluginRepository() {
            if (pluginRepository == null) {
                pluginRepository = new ArrayList<Repository>();
            }
            return this.pluginRepository;
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
     *         &lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/>
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
        "profile"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Profiles {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Profile> profile;

        /**
         * Gets the value of the profile property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profile property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfile().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Profile }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Profile> getProfile() {
            if (profile == null) {
                profile = new ArrayList<Profile>();
            }
            return this.profile;
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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Properties {

        @XmlAnyElement
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
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
     *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
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
        "any"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Reports {

        @XmlAnyElement
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Element> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Element> getAny() {
            if (any == null) {
                any = new ArrayList<Element>();
            }
            return this.any;
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
     *         &lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/>
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
        "repository"
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public static class Repositories {

        @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        protected List<Repository> repository;

        /**
         * Gets the value of the repository property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the repository property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRepository().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-10-24T04:04:52+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
        public List<Repository> getRepository() {
            if (repository == null) {
                repository = new ArrayList<Repository>();
            }
            return this.repository;
        }

    }

}
