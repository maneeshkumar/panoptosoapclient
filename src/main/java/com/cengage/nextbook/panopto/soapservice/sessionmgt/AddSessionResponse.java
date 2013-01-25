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
 *         &lt;element name="AddSessionResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Session" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"addSessionResult"})
@XmlRootElement(name = "AddSessionResponse")
public class AddSessionResponse {
    
    @XmlElementRef(name = "AddSessionResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Session> addSessionResult;
    
    /**
     * Gets the value of the addSessionResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Session }{@code >}
     * 
     */
    public JAXBElement<Session> getAddSessionResult() {
        return addSessionResult;
    }
    
    /**
     * Sets the value of the addSessionResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Session }{@code >}
     * 
     */
    public void setAddSessionResult(JAXBElement<Session> value) {
        this.addSessionResult = value;
    }
    
}
