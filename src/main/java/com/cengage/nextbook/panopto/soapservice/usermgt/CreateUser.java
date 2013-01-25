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
 *         &lt;element name="user" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}User" minOccurs="0"/>
 *         &lt;element name="initialPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "user", "initialPassword"})
@XmlRootElement(name = "CreateUser")
public class CreateUser {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    @XmlElementRef(name = "user", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<User> user;
    @XmlElementRef(name = "initialPassword",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> initialPassword;
    
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
     * Gets the value of the user property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    public JAXBElement<User> getUser() {
        return user;
    }
    
    /**
     * Sets the value of the user property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    public void setUser(JAXBElement<User> value) {
        this.user = value;
    }
    
    /**
     * Gets the value of the initialPassword property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getInitialPassword() {
        return initialPassword;
    }
    
    /**
     * Sets the value of the initialPassword property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setInitialPassword(JAXBElement<String> value) {
        this.initialPassword = value;
    }
    
}
