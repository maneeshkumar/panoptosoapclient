package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}AuthenticationInfo" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="memberIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "groupId", "memberIds"})
@XmlRootElement(name = "RemoveMembersFromInternalGroup")
public class RemoveMembersFromInternalGroup {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    protected String groupId;
    @XmlElementRef(name = "memberIds", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> memberIds;
    
    /**
     * Gets the value of the auth property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    public JAXBElement<AuthenticationInfo> getAuth() {
        return auth;
    }
    
    /**
     * Sets the value of the auth property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    public void setAuth(JAXBElement<AuthenticationInfo> value) {
        this.auth = value;
    }
    
    /**
     * Gets the value of the groupId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * Sets the value of the groupId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }
    
    /**
     * Gets the value of the memberIds property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getMemberIds() {
        return memberIds;
    }
    
    /**
     * Sets the value of the memberIds property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setMemberIds(JAXBElement<ArrayOfguid> value) {
        this.memberIds = value;
    }
    
}
