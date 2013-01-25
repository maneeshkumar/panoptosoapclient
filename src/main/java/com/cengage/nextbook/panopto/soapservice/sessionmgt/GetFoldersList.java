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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ListFoldersRequest" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {"auth", "request", "searchQuery"})
@XmlRootElement(name = "GetFoldersList")
public class GetFoldersList {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    @XmlElementRef(name = "request", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ListFoldersRequest> request;
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
     * Gets the value of the request property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ListFoldersRequest }{@code >}
     * 
     */
    public JAXBElement<ListFoldersRequest> getRequest() {
        return request;
    }
    
    /**
     * Sets the value of the request property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ListFoldersRequest }{@code >}
     * 
     */
    public void setRequest(JAXBElement<ListFoldersRequest> value) {
        this.request = value;
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
