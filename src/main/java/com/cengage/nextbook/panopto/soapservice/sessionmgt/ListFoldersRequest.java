package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ListFoldersRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListFoldersRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pagination" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Pagination" minOccurs="0"/>
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="PublicOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortBy" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}FolderSortField" minOccurs="0"/>
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
@XmlType(name = "ListFoldersRequest",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"pagination", "parentFolderId", "publicOnly", "sortBy", "sortIncreasing"})
public class ListFoldersRequest {
    
    @XmlElementRef(name = "Pagination",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Pagination> pagination;
    @XmlElementRef(name = "ParentFolderId",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> parentFolderId;
    @XmlElement(name = "PublicOnly")
    protected Boolean publicOnly;
    @XmlElement(name = "SortBy")
    protected FolderSortField sortBy;
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
     * Gets the value of the parentFolderId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getParentFolderId() {
        return parentFolderId;
    }
    
    /**
     * Sets the value of the parentFolderId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setParentFolderId(JAXBElement<String> value) {
        this.parentFolderId = value;
    }
    
    /**
     * Gets the value of the publicOnly property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isPublicOnly() {
        return publicOnly;
    }
    
    /**
     * Sets the value of the publicOnly property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setPublicOnly(Boolean value) {
        this.publicOnly = value;
    }
    
    /**
     * Gets the value of the sortBy property.
     * 
     * @return possible object is {@link FolderSortField }
     * 
     */
    public FolderSortField getSortBy() {
        return sortBy;
    }
    
    /**
     * Sets the value of the sortBy property.
     * 
     * @param value allowed object is {@link FolderSortField }
     * 
     */
    public void setSortBy(FolderSortField value) {
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
