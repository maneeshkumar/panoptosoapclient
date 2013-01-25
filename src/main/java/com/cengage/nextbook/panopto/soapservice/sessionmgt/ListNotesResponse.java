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
 *         &lt;element name="ListNotesResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ListNotesResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"listNotesResult"})
@XmlRootElement(name = "ListNotesResponse")
public class ListNotesResponse {
    
    @XmlElementRef(name = "ListNotesResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ListNotesResponse2> listNotesResult;
    
    /**
     * Gets the value of the listNotesResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ListNotesResponse2 }{@code >}
     * 
     */
    public JAXBElement<ListNotesResponse2> getListNotesResult() {
        return listNotesResult;
    }
    
    /**
     * Sets the value of the listNotesResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ListNotesResponse2 }{@code >}
     * 
     */
    public void setListNotesResult(JAXBElement<ListNotesResponse2> value) {
        this.listNotesResult = value;
    }
    
}
