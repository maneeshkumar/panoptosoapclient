package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SessionAccessDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionAccessDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderAccess" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}FolderAccessDetails" minOccurs="0"/>
 *         &lt;element name="GroupsWithDirectViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="InheritViewerAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SessionId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="UsersWithDirectViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionAccessDetails",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"folderAccess",
                      "groupsWithDirectViewerAccess",
                      "inheritViewerAccess",
                      "isPublic",
                      "sessionId",
                      "usersWithDirectViewerAccess"})
public class SessionAccessDetails {
    
    @XmlElementRef(name = "FolderAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<FolderAccessDetails> folderAccess;
    @XmlElementRef(name = "GroupsWithDirectViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> groupsWithDirectViewerAccess;
    @XmlElement(name = "InheritViewerAccess")
    protected Boolean inheritViewerAccess;
    @XmlElement(name = "IsPublic")
    protected Boolean isPublic;
    @XmlElement(name = "SessionId")
    protected String sessionId;
    @XmlElementRef(name = "UsersWithDirectViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> usersWithDirectViewerAccess;
    
    /**
     * Gets the value of the folderAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link FolderAccessDetails }{@code >}
     * 
     */
    public JAXBElement<FolderAccessDetails> getFolderAccess() {
        return folderAccess;
    }
    
    /**
     * Sets the value of the folderAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link FolderAccessDetails }{@code >}
     * 
     */
    public void setFolderAccess(JAXBElement<FolderAccessDetails> value) {
        this.folderAccess = value;
    }
    
    /**
     * Gets the value of the groupsWithDirectViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getGroupsWithDirectViewerAccess() {
        return groupsWithDirectViewerAccess;
    }
    
    /**
     * Sets the value of the groupsWithDirectViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setGroupsWithDirectViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.groupsWithDirectViewerAccess = value;
    }
    
    /**
     * Gets the value of the inheritViewerAccess property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isInheritViewerAccess() {
        return inheritViewerAccess;
    }
    
    /**
     * Sets the value of the inheritViewerAccess property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setInheritViewerAccess(Boolean value) {
        this.inheritViewerAccess = value;
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
     * Gets the value of the usersWithDirectViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getUsersWithDirectViewerAccess() {
        return usersWithDirectViewerAccess;
    }
    
    /**
     * Sets the value of the usersWithDirectViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setUsersWithDirectViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.usersWithDirectViewerAccess = value;
    }
    
}
