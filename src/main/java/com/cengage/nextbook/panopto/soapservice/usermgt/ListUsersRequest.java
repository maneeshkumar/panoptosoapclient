package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListUsersRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListUsersRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pagination" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Pagination" minOccurs="0"/>
 *         &lt;element name="SortBy" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}UserSortField" minOccurs="0"/>
 *         &lt;element name="SortIncreasing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListUsersRequest",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"pagination", "sortBy", "sortIncreasing"})
public class ListUsersRequest {
    
    @XmlElementRef(name = "Pagination",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Pagination> pagination;
    @XmlElement(name = "SortBy")
    protected UserSortField sortBy;
    @XmlElement(name = "SortIncreasing")
    protected Boolean sortIncreasing;
    
    /**
     * Gets the value of the pagination property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    public JAXBElement<Pagination> getPagination() {
        return pagination;
    }
    
    /**
     * Sets the value of the pagination property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    public void setPagination(JAXBElement<Pagination> value) {
        this.pagination = value;
    }
    
    /**
     * Gets the value of the sortBy property.
     * 
     * @return possible object is {@link UserSortField }
     * 
     */
    public UserSortField getSortBy() {
        return sortBy;
    }
    
    /**
     * Sets the value of the sortBy property.
     * 
     * @param value allowed object is {@link UserSortField }
     * 
     */
    public void setSortBy(UserSortField value) {
        this.sortBy = value;
    }
    
    /**
     * Gets the value of the sortIncreasing property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isSortIncreasing() {
        return sortIncreasing;
    }
    
    /**
     * Sets the value of the sortIncreasing property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setSortIncreasing(Boolean value) {
        this.sortIncreasing = value;
    }
    
}
