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
 * Java class for Session complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatorId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="EditorUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FolderId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="IsBroadcast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsDownloadable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MP3Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MP4Url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotesURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutputsPageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RemoteRecorderIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="SharePageUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="State" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SessionState" minOccurs="0"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ThumbUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ViewerUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"creatorId",
                      "description",
                      "duration",
                      "editorUrl",
                      "folderId",
                      "id",
                      "isBroadcast",
                      "isDownloadable",
                      "mp3Url",
                      "mp4Url",
                      "name",
                      "notesURL",
                      "outputsPageUrl",
                      "remoteRecorderIds",
                      "sharePageUrl",
                      "startTime",
                      "state",
                      "statusMessage",
                      "thumbUrl",
                      "viewerUrl"})
public class Session {
    
    @XmlElement(name = "CreatorId")
    protected String creatorId;
    @XmlElementRef(name = "Description",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "Duration",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Double> duration;
    @XmlElementRef(name = "EditorUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> editorUrl;
    @XmlElement(name = "FolderId")
    protected String folderId;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IsBroadcast")
    protected Boolean isBroadcast;
    @XmlElement(name = "IsDownloadable")
    protected Boolean isDownloadable;
    @XmlElementRef(name = "MP3Url",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> mp3Url;
    @XmlElementRef(name = "MP4Url",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> mp4Url;
    @XmlElementRef(name = "Name",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NotesURL",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> notesURL;
    @XmlElementRef(name = "OutputsPageUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> outputsPageUrl;
    @XmlElementRef(name = "RemoteRecorderIds",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> remoteRecorderIds;
    @XmlElementRef(name = "SharePageUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> sharePageUrl;
    @XmlElementRef(name = "StartTime",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElement(name = "State")
    protected SessionState state;
    @XmlElementRef(name = "StatusMessage",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> statusMessage;
    @XmlElementRef(name = "ThumbUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> thumbUrl;
    @XmlElementRef(name = "ViewerUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> viewerUrl;
    
    /**
     * Gets the value of the creatorId property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreatorId() {
        return creatorId;
    }
    
    /**
     * Sets the value of the creatorId property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreatorId(String value) {
        this.creatorId = value;
    }
    
    /**
     * Gets the value of the description property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getDescription() {
        return description;
    }
    
    /**
     * Sets the value of the description property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }
    
    /**
     * Gets the value of the duration property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    public JAXBElement<Double> getDuration() {
        return duration;
    }
    
    /**
     * Sets the value of the duration property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    public void setDuration(JAXBElement<Double> value) {
        this.duration = value;
    }
    
    /**
     * Gets the value of the editorUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getEditorUrl() {
        return editorUrl;
    }
    
    /**
     * Sets the value of the editorUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setEditorUrl(JAXBElement<String> value) {
        this.editorUrl = value;
    }
    
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
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setId(String value) {
        this.id = value;
    }
    
    /**
     * Gets the value of the isBroadcast property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsBroadcast() {
        return isBroadcast;
    }
    
    /**
     * Sets the value of the isBroadcast property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setIsBroadcast(Boolean value) {
        this.isBroadcast = value;
    }
    
    /**
     * Gets the value of the isDownloadable property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isIsDownloadable() {
        return isDownloadable;
    }
    
    /**
     * Sets the value of the isDownloadable property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setIsDownloadable(Boolean value) {
        this.isDownloadable = value;
    }
    
    /**
     * Gets the value of the mp3Url property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getMP3Url() {
        return mp3Url;
    }
    
    /**
     * Sets the value of the mp3Url property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setMP3Url(JAXBElement<String> value) {
        this.mp3Url = value;
    }
    
    /**
     * Gets the value of the mp4Url property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getMP4Url() {
        return mp4Url;
    }
    
    /**
     * Sets the value of the mp4Url property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setMP4Url(JAXBElement<String> value) {
        this.mp4Url = value;
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
     * Gets the value of the notesURL property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getNotesURL() {
        return notesURL;
    }
    
    /**
     * Sets the value of the notesURL property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setNotesURL(JAXBElement<String> value) {
        this.notesURL = value;
    }
    
    /**
     * Gets the value of the outputsPageUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getOutputsPageUrl() {
        return outputsPageUrl;
    }
    
    /**
     * Sets the value of the outputsPageUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setOutputsPageUrl(JAXBElement<String> value) {
        this.outputsPageUrl = value;
    }
    
    /**
     * Gets the value of the remoteRecorderIds property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getRemoteRecorderIds() {
        return remoteRecorderIds;
    }
    
    /**
     * Sets the value of the remoteRecorderIds property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setRemoteRecorderIds(JAXBElement<ArrayOfguid> value) {
        this.remoteRecorderIds = value;
    }
    
    /**
     * Gets the value of the sharePageUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getSharePageUrl() {
        return sharePageUrl;
    }
    
    /**
     * Sets the value of the sharePageUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setSharePageUrl(JAXBElement<String> value) {
        this.sharePageUrl = value;
    }
    
    /**
     * Gets the value of the startTime property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }
    
    /**
     * Sets the value of the startTime property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }
    
    /**
     * Gets the value of the state property.
     * 
     * @return possible object is {@link SessionState }
     * 
     */
    public SessionState getState() {
        return state;
    }
    
    /**
     * Sets the value of the state property.
     * 
     * @param value allowed object is {@link SessionState }
     * 
     */
    public void setState(SessionState value) {
        this.state = value;
    }
    
    /**
     * Gets the value of the statusMessage property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getStatusMessage() {
        return statusMessage;
    }
    
    /**
     * Sets the value of the statusMessage property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setStatusMessage(JAXBElement<String> value) {
        this.statusMessage = value;
    }
    
    /**
     * Gets the value of the thumbUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getThumbUrl() {
        return thumbUrl;
    }
    
    /**
     * Sets the value of the thumbUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setThumbUrl(JAXBElement<String> value) {
        this.thumbUrl = value;
    }
    
    /**
     * Gets the value of the viewerUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getViewerUrl() {
        return viewerUrl;
    }
    
    /**
     * Sets the value of the viewerUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setViewerUrl(JAXBElement<String> value) {
        this.viewerUrl = value;
    }
    
}
