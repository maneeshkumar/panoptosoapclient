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
 *         &lt;element name="ListGroupsResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ListGroupsResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"listGroupsResult"})
@XmlRootElement(name = "ListGroupsResponse")
public class ListGroupsResponse2 {
    
    @XmlElementRef(name = "ListGroupsResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ListGroupsResponse> listGroupsResult;
    
    /**
     * Gets the value of the listGroupsResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ListGroupsResponse }{@code >}
     * 
     */
    public JAXBElement<ListGroupsResponse> getListGroupsResult() {
        return listGroupsResult;
    }
    
    /**
     * Sets the value of the listGroupsResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ListGroupsResponse }{@code >}
     * 
     */
    public void setListGroupsResult(JAXBElement<ListGroupsResponse> value) {
        this.listGroupsResult = value;
    }
    
}
