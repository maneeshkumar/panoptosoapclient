package com.cengage.nextbook.panopto.soapservice.sessionmgt;

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
 *         &lt;element name="allowPublicNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "folderId", "allowPublicNotes"})
@XmlRootElement(name = "UpdateFolderAllowPublicNotes")
public class UpdateFolderAllowPublicNotes {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    protected String folderId;
    protected Boolean allowPublicNotes;
    
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
     * Gets the value of the allowPublicNotes property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isAllowPublicNotes() {
        return allowPublicNotes;
    }
    
    /**
     * Sets the value of the allowPublicNotes property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAllowPublicNotes(Boolean value) {
        this.allowPublicNotes = value;
    }
    
}
