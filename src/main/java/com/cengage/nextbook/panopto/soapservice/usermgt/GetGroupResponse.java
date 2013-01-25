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
 *         &lt;element name="GetGroupResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Group" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"getGroupResult"})
@XmlRootElement(name = "GetGroupResponse")
public class GetGroupResponse {
    
    @XmlElementRef(name = "GetGroupResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Group> getGroupResult;
    
    /**
     * Gets the value of the getGroupResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    public JAXBElement<Group> getGetGroupResult() {
        return getGroupResult;
    }
    
    /**
     * Sets the value of the getGroupResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    public void setGetGroupResult(JAXBElement<Group> value) {
        this.getGroupResult = value;
    }
    
}
