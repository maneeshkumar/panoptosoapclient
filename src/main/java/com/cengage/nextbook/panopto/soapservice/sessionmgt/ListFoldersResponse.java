package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListFoldersResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListFoldersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Results" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ArrayOfFolder" minOccurs="0"/>
 *         &lt;element name="TotalNumberResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListFoldersResponse",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"results", "totalNumberResults"})
public class ListFoldersResponse {
    
    @XmlElementRef(name = "Results",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfFolder> results;
    @XmlElement(name = "TotalNumberResults")
    protected Integer totalNumberResults;
    
    /**
     * Gets the value of the results property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    public JAXBElement<ArrayOfFolder> getResults() {
        return results;
    }
    
    /**
     * Sets the value of the results property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    public void setResults(JAXBElement<ArrayOfFolder> value) {
        this.results = value;
    }
    
    /**
     * Gets the value of the totalNumberResults property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getTotalNumberResults() {
        return totalNumberResults;
    }
    
    /**
     * Sets the value of the totalNumberResults property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setTotalNumberResults(Integer value) {
        this.totalNumberResults = value;
    }
    
}
