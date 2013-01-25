package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for ListSessionsRequest complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListSessionsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Pagination" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Pagination" minOccurs="0"/>
 *         &lt;element name="RemoteRecorderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SortBy" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SessionSortField" minOccurs="0"/>
 *         &lt;element name="SortIncreasing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="States" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ArrayOfSessionState" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListSessionsRequest",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"endDate",
                      "folderId",
                      "pagination",
                      "remoteRecorderId",
                      "sortBy",
                      "sortIncreasing",
                      "startDate",
                      "states"})
public class ListSessionsRequest {
    
    @XmlElementRef(name = "EndDate",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    /*
     * @XmlElementRef(name = "FolderId", namespace =
     * "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", type = JAXBElement.class,
     * required = false) protected JAXBElement<String> folderId;
     */
    
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElementRef(name = "Pagination",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Pagination> pagination;
    @XmlElementRef(name = "RemoteRecorderId",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> remoteRecorderId;
    @XmlElement(name = "SortBy")
    protected SessionSortField sortBy;
    @XmlElement(name = "SortIncreasing")
    protected Boolean sortIncreasing;
    @XmlElementRef(name = "StartDate",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    /*
     * @XmlElementRef(name = "States", namespace =
     * "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40", type = JAXBElement.class,
     * required = false) protected ArrayOfSessionState states;
     */
    @XmlElement(name = "States")
    protected ArrayOfSessionState states;
    
    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }
    
    /**
     * Sets the value of the endDate property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }
    
    /**
     * Gets the value of the folderId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public String getFolderId() {
        return folderId;
    }
    
    /**
     * Sets the value of the folderId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }
    
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
     * Gets the value of the remoteRecorderId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getRemoteRecorderId() {
        return remoteRecorderId;
    }
    
    /**
     * Sets the value of the remoteRecorderId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setRemoteRecorderId(JAXBElement<String> value) {
        this.remoteRecorderId = value;
    }
    
    /**
     * Gets the value of the sortBy property.
     * 
     * @return possible object is {@link SessionSortField }
     * 
     */
    public SessionSortField getSortBy() {
        return sortBy;
    }
    
    /**
     * Sets the value of the sortBy property.
     * 
     * @param value allowed object is {@link SessionSortField }
     * 
     */
    public void setSortBy(SessionSortField value) {
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
    
    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }
    
    /**
     * Sets the value of the startDate property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }
    
    /**
     * Gets the value of the states property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfSessionState }{@code >}
     * 
     */
    public ArrayOfSessionState getStates() {
        return states;
    }
    
    /**
     * Sets the value of the states property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfSessionState }{@code >}
     * 
     */
    public void setStates(ArrayOfSessionState value) {
        this.states = value;
    }
    
}
