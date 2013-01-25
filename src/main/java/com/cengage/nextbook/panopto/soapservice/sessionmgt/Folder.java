package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Folder complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Folder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowPublicNotes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AllowSessionDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AudioPodcastITunesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AudioRssUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChildFolders" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnablePodcast" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="IsPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ListUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentFolder" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Sessions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         &lt;element name="SettingsUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VideoPodcastITunesUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VideoRssUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Folder",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"allowPublicNotes",
                      "allowSessionDownload",
                      "audioPodcastITunesUrl",
                      "audioRssUrl",
                      "childFolders",
                      "description",
                      "enablePodcast",
                      "id",
                      "isPublic",
                      "listUrl",
                      "name",
                      "parentFolder",
                      "sessions",
                      "settingsUrl",
                      "videoPodcastITunesUrl",
                      "videoRssUrl"})
public class Folder {
    
    @XmlElement(name = "AllowPublicNotes")
    protected Boolean allowPublicNotes;
    @XmlElement(name = "AllowSessionDownload")
    protected Boolean allowSessionDownload;
    @XmlElementRef(name = "AudioPodcastITunesUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> audioPodcastITunesUrl;
    @XmlElementRef(name = "AudioRssUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> audioRssUrl;
    @XmlElementRef(name = "ChildFolders",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> childFolders;
    @XmlElementRef(name = "Description",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EnablePodcast")
    protected Boolean enablePodcast;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "IsPublic")
    protected Boolean isPublic;
    @XmlElementRef(name = "ListUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> listUrl;
    @XmlElementRef(name = "Name",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "ParentFolder",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> parentFolder;
    @XmlElementRef(name = "Sessions",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfguid> sessions;
    @XmlElementRef(name = "SettingsUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> settingsUrl;
    @XmlElementRef(name = "VideoPodcastITunesUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> videoPodcastITunesUrl;
    @XmlElementRef(name = "VideoRssUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> videoRssUrl;
    
    /**
     * Gets the value of the allowPublicNotes property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isAllowPublicNotes() {
        return allowPublicNotes;
    }
    
    /**
     * Sets the value of the allowPublicNotes property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAllowPublicNotes(Boolean value) {
        this.allowPublicNotes = value;
    }
    
    /**
     * Gets the value of the allowSessionDownload property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isAllowSessionDownload() {
        return allowSessionDownload;
    }
    
    /**
     * Sets the value of the allowSessionDownload property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAllowSessionDownload(Boolean value) {
        this.allowSessionDownload = value;
    }
    
    /**
     * Gets the value of the audioPodcastITunesUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getAudioPodcastITunesUrl() {
        return audioPodcastITunesUrl;
    }
    
    /**
     * Sets the value of the audioPodcastITunesUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setAudioPodcastITunesUrl(JAXBElement<String> value) {
        this.audioPodcastITunesUrl = value;
    }
    
    /**
     * Gets the value of the audioRssUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getAudioRssUrl() {
        return audioRssUrl;
    }
    
    /**
     * Sets the value of the audioRssUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setAudioRssUrl(JAXBElement<String> value) {
        this.audioRssUrl = value;
    }
    
    /**
     * Gets the value of the childFolders property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getChildFolders() {
        return childFolders;
    }
    
    /**
     * Sets the value of the childFolders property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setChildFolders(JAXBElement<ArrayOfguid> value) {
        this.childFolders = value;
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
     * Gets the value of the enablePodcast property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isEnablePodcast() {
        return enablePodcast;
    }
    
    /**
     * Sets the value of the enablePodcast property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setEnablePodcast(Boolean value) {
        this.enablePodcast = value;
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
     * Gets the value of the listUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getListUrl() {
        return listUrl;
    }
    
    /**
     * Sets the value of the listUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setListUrl(JAXBElement<String> value) {
        this.listUrl = value;
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
     * Gets the value of the parentFolder property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getParentFolder() {
        return parentFolder;
    }
    
    /**
     * Sets the value of the parentFolder property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setParentFolder(JAXBElement<String> value) {
        this.parentFolder = value;
    }
    
    /**
     * Gets the value of the sessions property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public JAXBElement<ArrayOfguid> getSessions() {
        return sessions;
    }
    
    /**
     * Sets the value of the sessions property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    public void setSessions(JAXBElement<ArrayOfguid> value) {
        this.sessions = value;
    }
    
    /**
     * Gets the value of the settingsUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getSettingsUrl() {
        return settingsUrl;
    }
    
    /**
     * Sets the value of the settingsUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setSettingsUrl(JAXBElement<String> value) {
        this.settingsUrl = value;
    }
    
    /**
     * Gets the value of the videoPodcastITunesUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getVideoPodcastITunesUrl() {
        return videoPodcastITunesUrl;
    }
    
    /**
     * Sets the value of the videoPodcastITunesUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setVideoPodcastITunesUrl(JAXBElement<String> value) {
        this.videoPodcastITunesUrl = value;
    }
    
    /**
     * Gets the value of the videoRssUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getVideoRssUrl() {
        return videoRssUrl;
    }
    
    /**
     * Sets the value of the videoRssUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setVideoRssUrl(JAXBElement<String> value) {
        this.videoRssUrl = value;
    }
    
}
