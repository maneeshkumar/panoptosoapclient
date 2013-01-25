package com.cengage.nextbook.panopto.soapservice.accessmgt;

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
 *         &lt;element name="folderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="userIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="role" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}AccessRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "folderId", "userIds", "role"})
@XmlRootElement(name = "GrantUsersAccessToFolder")
public class GrantUsersAccessToFolder {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    protected String folderId;
    @XmlElementRef(name = "userIds", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> userIds;
    protected AccessRole role;
    
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
     * Gets the value of the folderId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFolderId() {
        return folderId;
    }
    
    /**
     * Sets the value of the folderId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }
    
    /**
     * Gets the value of the userIds property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getUserIds() {
        return userIds;
    }
    
    /**
     * Sets the value of the userIds property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setUserIds(JAXBElement<ArrayOfguid> value) {
        this.userIds = value;
    }
    
    /**
     * Gets the value of the role property.
     * 
     * @return possible object is {@link AccessRole }
     * 
     */
    public AccessRole getRole() {
        return role;
    }
    
    /**
     * Sets the value of the role property.
     * 
     * @param value allowed object is {@link AccessRole }
     * 
     */
    public void setRole(AccessRole value) {
        this.role = value;
    }
    
}
