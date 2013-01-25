package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Note complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Note">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatorId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="SessionID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Note",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"channel", "creatorId", "id", "sessionID", "text", "timestamp"})
public class Note {
    
    @XmlElementRef(name = "Channel",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> channel;
    @XmlElement(name = "CreatorId")
    protected String creatorId;
    @XmlElement(name = "ID")
    protected String id;
    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElementRef(name = "Text",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> text;
    @XmlElement(name = "Timestamp")
    protected Double timestamp;
    
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
     * Gets the value of the id property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getID() {
        return id;
    }
    
    /**
     * Sets the value of the id property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setID(String value) {
        this.id = value;
    }
    
    /**
     * Gets the value of the sessionID property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getSessionID() {
        return sessionID;
    }
    
    /**
     * Sets the value of the sessionID property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }
    
    /**
     * Gets the value of the text property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getText() {
        return text;
    }
    
    /**
     * Sets the value of the text property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setText(JAXBElement<String> value) {
        this.text = value;
    }
    
    /**
     * Gets the value of the timestamp property.
     * 
     * @return possible object is {@link Double }
     * 
     */
    public Double getTimestamp() {
        return timestamp;
    }
    
    /**
     * Sets the value of the timestamp property.
     * 
     * @param value allowed object is {@link Double }
     * 
     */
    public void setTimestamp(Double value) {
        this.timestamp = value;
    }
    
}
