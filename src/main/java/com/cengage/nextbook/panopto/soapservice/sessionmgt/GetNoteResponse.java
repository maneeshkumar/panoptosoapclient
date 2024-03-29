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
 *         &lt;element name="GetNoteResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Note" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getNoteResult"})
@XmlRootElement(name = "GetNoteResponse")
public class GetNoteResponse {
    
    @XmlElementRef(name = "GetNoteResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Note> getNoteResult;
    
    /**
     * Gets the value of the getNoteResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     */
    public JAXBElement<Note> getGetNoteResult() {
        return getNoteResult;
    }
    
    /**
     * Sets the value of the getNoteResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     */
    public void setGetNoteResult(JAXBElement<Note> value) {
        this.getNoteResult = value;
    }
    
}
