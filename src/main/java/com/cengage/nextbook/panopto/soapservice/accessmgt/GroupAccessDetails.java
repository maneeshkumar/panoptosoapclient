package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GroupAccessDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupAccessDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoldersWithCreatorAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="FoldersWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="GroupId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SessionsWithViewerAccess" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="SystemRole" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SystemRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupAccessDetails",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"foldersWithCreatorAccess",
                      "foldersWithViewerAccess",
                      "groupId",
                      "sessionsWithViewerAccess",
                      "systemRole"})
public class GroupAccessDetails {
    
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
    @XmlElement(name = "GroupId")
    protected String groupId;
    @XmlElementRef(name = "SessionsWithViewerAccess",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> sessionsWithViewerAccess;
    @XmlElement(name = "SystemRole")
    protected SystemRole systemRole;
    
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
     * Gets the value of the groupId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getGroupId() {
        return groupId;
    }
    
    /**
     * Sets the value of the groupId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setGroupId(String value) {
        this.groupId = value;
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
    
}
