package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailSessionNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalGroupIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth",
                                 "firstName",
                                 "lastName",
                                 "email",
                                 "emailSessionNotifications",
                                 "externalGroupIds"})
@XmlRootElement(name = "SyncExternalUser")
public class SyncExternalUser {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    @XmlElementRef(name = "firstName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "lastName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "email", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "EmailSessionNotifications")
    protected Boolean emailSessionNotifications;
    @XmlElementRef(name = "externalGroupIds",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfstring> externalGroupIds;
    
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
     * Gets the value of the firstName property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the value of the firstName property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }
    
    /**
     * Gets the value of the lastName property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }
    
    /**
     * Sets the value of the lastName property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }
    
    /**
     * Gets the value of the email property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getEmail() {
        return email;
    }
    
    /**
     * Sets the value of the email property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }
    
    /**
     * Gets the value of the emailSessionNotifications property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isEmailSessionNotifications() {
        return emailSessionNotifications;
    }
    
    /**
     * Sets the value of the emailSessionNotifications property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setEmailSessionNotifications(Boolean value) {
        this.emailSessionNotifications = value;
    }
    
    /**
     * Gets the value of the externalGroupIds property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     */
    public JAXBElement<ArrayOfstring> getExternalGroupIds() {
        return externalGroupIds;
    }
    
    /**
     * Sets the value of the externalGroupIds property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     */
    public void setExternalGroupIds(JAXBElement<ArrayOfstring> value) {
        this.externalGroupIds = value;
    }
    
}
