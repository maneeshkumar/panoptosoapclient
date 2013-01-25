package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FolderAccessDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderAccessDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="GroupsWithCreatorAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="GroupsWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UsersWithCreatorAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="UsersWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderAccessDetails",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"folderId",
                      "groupsWithCreatorAccess",
                      "groupsWithViewerAccess",
                      "isPublic",
                      "usersWithCreatorAccess",
                      "usersWithViewerAccess"})
public class FolderAccessDetails {
    
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElementRef(name = "GroupsWithCreatorAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> groupsWithCreatorAccess;
    @XmlElementRef(name = "GroupsWithViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> groupsWithViewerAccess;
    @XmlElement(name = "IsPublic")
    protected Boolean isPublic;
    @XmlElementRef(name = "UsersWithCreatorAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> usersWithCreatorAccess;
    @XmlElementRef(name = "UsersWithViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> usersWithViewerAccess;
    
    /**
     * Gets the value of the folderId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFolderId() {
        return folderId;
    }
    
    /**
     * Sets the value of the folderId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setFolderId(String value) {
        this.folderId = value;
    }
    
    /**
     * Gets the value of the groupsWithCreatorAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getGroupsWithCreatorAccess() {
        return groupsWithCreatorAccess;
    }
    
    /**
     * Sets the value of the groupsWithCreatorAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setGroupsWithCreatorAccess(JAXBElement<ArrayOfguid> value) {
        this.groupsWithCreatorAccess = value;
    }
    
    /**
     * Gets the value of the groupsWithViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getGroupsWithViewerAccess() {
        return groupsWithViewerAccess;
    }
    
    /**
     * Sets the value of the groupsWithViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setGroupsWithViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.groupsWithViewerAccess = value;
    }
    
    /**
     * Gets the value of the isPublic property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsPublic() {
        return isPublic;
    }
    
    /**
     * Sets the value of the isPublic property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setIsPublic(Boolean value) {
        this.isPublic = value;
    }
    
    /**
     * Gets the value of the usersWithCreatorAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getUsersWithCreatorAccess() {
        return usersWithCreatorAccess;
    }
    
    /**
     * Sets the value of the usersWithCreatorAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setUsersWithCreatorAccess(JAXBElement<ArrayOfguid> value) {
        this.usersWithCreatorAccess = value;
    }
    
    /**
     * Gets the value of the usersWithViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getUsersWithViewerAccess() {
        return usersWithViewerAccess;
    }
    
    /**
     * Sets the value of the usersWithViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setUsersWithViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.usersWithViewerAccess = value;
    }
    
}
