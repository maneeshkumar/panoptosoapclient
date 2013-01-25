package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.ws.RequestWrapper;

import org.apache.cxf.jaxb.JAXBToStringBuilder;
import org.apache.cxf.jaxb.JAXBToStringStyle;

/**
 * <p>
 * Java class for AuthenticationInfo complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationInfo",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"authCode", "password", "userKey"})
public class AuthenticationInfo {
    
    //@XmlElementRef(name = "AuthCode", namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", type = JAXBElement.class, required = false)
    
    @XmlElement(name = "AuthCode")
    protected String authCode;
    
    // @XmlElementRef(name = "Password", namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", type = JAXBElement.class, required = false)
    @XmlElement(name = "Password")
    protected String password;
    // @XmlElementRef(name = "UserKey", namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", type = JAXBElement.class, required = false)
    @XmlElement(name = "UserKey")
    protected String userKey;
    
    public AuthenticationInfo() {
    }
    
    public AuthenticationInfo(String authCode, String password, String userKey) {
        this.authCode = authCode;
        this.password = password;
        this.userKey = userKey;
    }
    
    /**
     * Gets the value of the authCode property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public String getAuthCode() {
        return authCode;
    }
    
    /**
     * Sets the value of the authCode property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public void setAuthCode(String value) {
        this.authCode = value;
    }
    
    /**
     * Gets the value of the password property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public String getPassword() {
        return password;
    }
    
    /**
     * Sets the value of the password property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public void setPassword(String value) {
        this.password = value;
    }
    
    /**
     * Gets the value of the userKey property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public String getUserKey() {
        return userKey;
    }
    
    /**
     * Sets the value of the userKey property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    
    public void setUserKey(String value) {
        this.userKey = value;
    }
    
    @Override
    public String toString() {
        return JAXBToStringBuilder.valueOf(this, JAXBToStringStyle.DEFAULT_STYLE);
    }
    
}
