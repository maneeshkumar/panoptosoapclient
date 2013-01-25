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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="folderIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"auth", "name", "externalId", "folderIds"})
@XmlRootElement(name = "SetExternalCourseAccess")
public class SetExternalCourseAccess {
    
    @XmlElementRef(name = "auth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationInfo> auth;
    @XmlElementRef(name = "name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "externalId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> externalId;
    @XmlElementRef(name = "folderIds", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfguid> folderIds;
    
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
     * Gets the value of the name property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getName() {
        return name;
    }
    
    /**
     * Sets the value of the name property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }
    
    /**
     * Gets the value of the externalId property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getExternalId() {
        return externalId;
    }
    
    /**
     * Sets the value of the externalId property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setExternalId(JAXBElement<String> value) {
        this.externalId = value;
    }
    
    /**
     * Gets the value of the folderIds property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getFolderIds() {
        return folderIds;
    }
    
    /**
     * Sets the value of the folderIds property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setFolderIds(JAXBElement<ArrayOfguid> value) {
        this.folderIds = value;
    }
    
}
