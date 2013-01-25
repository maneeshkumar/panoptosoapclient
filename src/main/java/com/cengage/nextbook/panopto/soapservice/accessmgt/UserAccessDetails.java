package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UserAccessDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAccessDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoldersWithCreatorAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="FoldersWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="GroupMembershipAccess" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ArrayOfGroupAccessDetails" minOccurs="0"/>
 *         &lt;element name="SessionsWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="SystemRole" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SystemRole" minOccurs="0"/>
 *         &lt;element name="UserId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAccessDetails",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"foldersWithCreatorAccess",
                      "foldersWithViewerAccess",
                      "groupMembershipAccess",
                      "sessionsWithViewerAccess",
                      "systemRole",
                      "userId"})
public class UserAccessDetails {
    
    @XmlElementRef(name = "FoldersWithCreatorAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> foldersWithCreatorAccess;
    @XmlElementRef(name = "FoldersWithViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> foldersWithViewerAccess;
    @XmlElementRef(name = "GroupMembershipAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfGroupAccessDetails> groupMembershipAccess;
    @XmlElementRef(name = "SessionsWithViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> sessionsWithViewerAccess;
    @XmlElement(name = "SystemRole")
    protected SystemRole systemRole;
    @XmlElement(name = "UserId")
    protected String userId;
    
    /**
     * Gets the value of the foldersWithCreatorAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getFoldersWithCreatorAccess() {
        return foldersWithCreatorAccess;
    }
    
    /**
     * Sets the value of the foldersWithCreatorAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setFoldersWithCreatorAccess(JAXBElement<ArrayOfguid> value) {
        this.foldersWithCreatorAccess = value;
    }
    
    /**
     * Gets the value of the foldersWithViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getFoldersWithViewerAccess() {
        return foldersWithViewerAccess;
    }
    
    /**
     * Sets the value of the foldersWithViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setFoldersWithViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.foldersWithViewerAccess = value;
    }
    
    /**
     * Gets the value of the groupMembershipAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfGroupAccessDetails }{@code >}
     * 
     */
    public JAXBElement<ArrayOfGroupAccessDetails> getGroupMembershipAccess() {
        return groupMembershipAccess;
    }
    
    /**
     * Sets the value of the groupMembershipAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfGroupAccessDetails }{@code >}
     * 
     */
    public void setGroupMembershipAccess(JAXBElement<ArrayOfGroupAccessDetails> value) {
        this.groupMembershipAccess = value;
    }
    
    /**
     * Gets the value of the sessionsWithViewerAccess property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getSessionsWithViewerAccess() {
        return sessionsWithViewerAccess;
    }
    
    /**
     * Sets the value of the sessionsWithViewerAccess property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setSessionsWithViewerAccess(JAXBElement<ArrayOfguid> value) {
        this.sessionsWithViewerAccess = value;
    }
    
    /**
     * Gets the value of the systemRole property.
     * 
     * @return possible object is {@link SystemRole }
     * 
     */
    public SystemRole getSystemRole() {
        return systemRole;
    }
    
    /**
     * Sets the value of the systemRole property.
     * 
     * @param value allowed object is {@link SystemRole }
     * 
     */
    public void setSystemRole(SystemRole value) {
        this.systemRole = value;
    }
    
    /**
     * Gets the value of the userId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * Sets the value of the userId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setUserId(String value) {
        this.userId = value;
    }
    
}
