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
 *         &lt;element name="GetSessionAccessDetailsResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SessionAccessDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getSessionAccessDetailsResult"})
@XmlRootElement(name = "GetSessionAccessDetailsResponse")
public class GetSessionAccessDetailsResponse {
    
    @XmlElementRef(name = "GetSessionAccessDetailsResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<SessionAccessDetails> getSessionAccessDetailsResult;
    
    /**
     * Gets the value of the getSessionAccessDetailsResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link SessionAccessDetails }{@code >}
     * 
     */
    public JAXBElement<SessionAccessDetails> getGetSessionAccessDetailsResult() {
        return getSessionAccessDetailsResult;
    }
    
    /**
     * Sets the value of the getSessionAccessDetailsResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link SessionAccessDetails }{@code >}
     * 
     */
    public void setGetSessionAccessDetailsResult(JAXBElement<SessionAccessDetails> value) {
        this.getSessionAccessDetailsResult = value;
    }
    
}
