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
 *         &lt;element name="GetUserAccessDetailsResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}UserAccessDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getUserAccessDetailsResult"})
@XmlRootElement(name = "GetUserAccessDetailsResponse")
public class GetUserAccessDetailsResponse {
    
    @XmlElementRef(name = "GetUserAccessDetailsResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<UserAccessDetails> getUserAccessDetailsResult;
    
    /**
     * Gets the value of the getUserAccessDetailsResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link UserAccessDetails }{@code >}
     * 
     */
    public JAXBElement<UserAccessDetails> getGetUserAccessDetailsResult() {
        return getUserAccessDetailsResult;
    }
    
    /**
     * Sets the value of the getUserAccessDetailsResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link UserAccessDetails }{@code >}
     * 
     */
    public void setGetUserAccessDetailsResult(JAXBElement<UserAccessDetails> value) {
        this.getUserAccessDetailsResult = value;
    }
    
}
