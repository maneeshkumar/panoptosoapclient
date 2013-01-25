package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Pagination complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pagination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxNumberResults" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagination",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"maxNumberResults", "pageNumber"})
public class Pagination {
    
    @XmlElement(name = "MaxNumberResults")
    protected Integer maxNumberResults;
    @XmlElement(name = "PageNumber")
    protected Integer pageNumber;
    
    /**
     * Gets the value of the maxNumberResults property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getMaxNumberResults() {
        return maxNumberResults;
    }
    
    /**
     * Sets the value of the maxNumberResults property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setMaxNumberResults(Integer value) {
        this.maxNumberResults = value;
    }
    
    /**
     * Gets the value of the pageNumber property.
     * 
     * @return possible object is {@link Integer }
     * 
     */
    public Integer getPageNumber() {
        return pageNumber;
    }
    
    /**
     * Sets the value of the pageNumber property.
     * 
     * @param value allowed object is {@link Integer }
     * 
     */
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }
    
}
