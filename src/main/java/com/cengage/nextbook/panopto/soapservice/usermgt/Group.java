package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Group complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}GroupType" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="MembershipProviderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemRole" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SystemRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"externalId", "groupType", "id", "membershipProviderName", "name", "systemRole"})
public class Group {
    
    @XmlElementRef(name = "ExternalId",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> externalId;
    @XmlElement(name = "GroupType")
    protected GroupType groupType;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElementRef(name = "MembershipProviderName",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> membershipProviderName;
    @XmlElementRef(name = "Name",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "SystemRole")
    protected SystemRole systemRole;
    
    /**
     * Gets the value of the externalId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getExternalId() {
        return externalId;
    }
    
    /**
     * Sets the value of the externalId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setExternalId(JAXBElement<String> value) {
        this.externalId = value;
    }
    
    /**
     * Gets the value of the groupType property.
     * 
     * @return possible object is {@link GroupType }
     * 
     */
    public GroupType getGroupType() {
        return groupType;
    }
    
    /**
     * Sets the value of the groupType property.
     * 
     * @param value allowed object is {@link GroupType }
     * 
     */
    public void setGroupType(GroupType value) {
        this.groupType = value;
    }
    
    /**
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }
    
    /**
     * Gets the value of the membershipProviderName property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getMembershipProviderName() {
        return membershipProviderName;
    }
    
    /**
     * Sets the value of the membershipProviderName property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setMembershipProviderName(JAXBElement<String> value) {
        this.membershipProviderName = value;
    }
    
    /**
     * Gets the value of the name property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getName() {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }
    
    /**
     * Gets the value of the systemRole property.
     * 
     * @return possible object is {@link SystemRole }
     * 
     */
    public SystemRole getSystemRole() {
        return systemRole;
    }
    
    /**
     * Sets the value of the systemRole property.
     * 
     * @param value allowed object is {@link SystemRole }
     * 
     */
    public void setSystemRole(SystemRole value) {
        this.systemRole = value;
    }
    
}
