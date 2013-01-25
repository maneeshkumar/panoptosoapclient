package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListGroupsResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListGroupsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PagedResults" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ArrayOfGroup" minOccurs="0"/>
 *         &lt;element name="TotalResultCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListGroupsResponse",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"pagedResults", "totalResultCount"})
public class ListGroupsResponse {
    
    @XmlElementRef(name = "PagedResults",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfGroup> pagedResults;
    @XmlElement(name = "TotalResultCount")
    protected Integer totalResultCount;
    
    /**
     * Gets the value of the pagedResults property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfGroup }{@code >}
     * 
     */
    public JAXBElement<ArrayOfGroup> getPagedResults() {
        return pagedResults;
    }
    
    /**
     * Sets the value of the pagedResults property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfGroup }{@code >}
     * 
     */
    public void setPagedResults(JAXBElement<ArrayOfGroup> value) {
        this.pagedResults = value;
    }
    
    /**
     * Gets the value of the totalResultCount property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTotalResultCount() {
        return totalResultCount;
    }
    
    /**
     * Sets the value of the totalResultCount property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setTotalResultCount(Integer value) {
        this.totalResultCount = value;
    }
    
}
