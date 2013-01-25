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
 *         &lt;element name="GetUserByKeyResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}User" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getUserByKeyResult"})
@XmlRootElement(name = "GetUserByKeyResponse")
public class GetUserByKeyResponse {
    
    @XmlElementRef(name = "GetUserByKeyResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<User> getUserByKeyResult;
    
    /**
     * Gets the value of the getUserByKeyResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    public JAXBElement<User> getGetUserByKeyResult() {
        return getUserByKeyResult;
    }
    
    /**
     * Sets the value of the getUserByKeyResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    public void setGetUserByKeyResult(JAXBElement<User> value) {
        this.getUserByKeyResult = value;
    }
    
}
