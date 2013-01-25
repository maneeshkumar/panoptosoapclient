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
 *         &lt;element name="auth" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}AuthenticationInfo" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="pagination" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Pagination" minOccurs="0"/>
 *         &lt;element name="creatorId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchQuery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "sessionId", "pagination", "creatorId", "channel", "searchQuery"})
@XmlRootElement(name = "ListNotes")
public class ListNotes {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    protected String sessionId;
    @XmlElementRef(name = "pagination", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Pagination> pagination;
    @XmlElementRef(name = "creatorId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creatorId;
    @XmlElementRef(name = "channel", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> channel;
    @XmlElementRef(name = "searchQuery", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> searchQuery;
    
    /**
     * Gets the value of the auth property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    public JAXBElement<AuthenticationInfo> getAuth() {
        return auth;
    }
    
    /**
     * Sets the value of the auth property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    public void setAuth(JAXBElement<AuthenticationInfo> value) {
        this.auth = value;
    }
    
    /**
     * Gets the value of the sessionId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSessionId() {
        return sessionId;
    }
    
    /**
     * Sets the value of the sessionId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSessionId(String value) {
        this.sessionId = value;
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
     * Gets the value of the creatorId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getCreatorId() {
        return creatorId;
    }
    
    /**
     * Sets the value of the creatorId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setCreatorId(JAXBElement<String> value) {
        this.creatorId = value;
    }
    
    /**
     * Gets the value of the channel property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getChannel() {
        return channel;
    }
    
    /**
     * Sets the value of the channel property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setChannel(JAXBElement<String> value) {
        this.channel = value;
    }
    
    /**
     * Gets the value of the searchQuery property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getSearchQuery() {
        return searchQuery;
    }
    
    /**
     * Sets the value of the searchQuery property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setSearchQuery(JAXBElement<String> value) {
        this.searchQuery = value;
    }
    
}
