package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for RecorderDownloadUrlResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecorderDownloadUrlResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MacRecorderDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindowsRecorderDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WindowsRemoteRecorderDownloadUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecorderDownloadUrlResponse",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"macRecorderDownloadUrl", "windowsRecorderDownloadUrl", "windowsRemoteRecorderDownloadUrl"})
public class RecorderDownloadUrlResponse {
    
    @XmlElementRef(name = "MacRecorderDownloadUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> macRecorderDownloadUrl;
    @XmlElementRef(name = "WindowsRecorderDownloadUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> windowsRecorderDownloadUrl;
    @XmlElementRef(name = "WindowsRemoteRecorderDownloadUrl",
                   namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<String> windowsRemoteRecorderDownloadUrl;
    
    /**
     * Gets the value of the macRecorderDownloadUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getMacRecorderDownloadUrl() {
        return macRecorderDownloadUrl;
    }
    
    /**
     * Sets the value of the macRecorderDownloadUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setMacRecorderDownloadUrl(JAXBElement<String> value) {
        this.macRecorderDownloadUrl = value;
    }
    
    /**
     * Gets the value of the windowsRecorderDownloadUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getWindowsRecorderDownloadUrl() {
        return windowsRecorderDownloadUrl;
    }
    
    /**
     * Sets the value of the windowsRecorderDownloadUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setWindowsRecorderDownloadUrl(JAXBElement<String> value) {
        this.windowsRecorderDownloadUrl = value;
    }
    
    /**
     * Gets the value of the windowsRemoteRecorderDownloadUrl property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public JAXBElement<String> getWindowsRemoteRecorderDownloadUrl() {
        return windowsRemoteRecorderDownloadUrl;
    }
    
    /**
     * Sets the value of the windowsRemoteRecorderDownloadUrl property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    public void setWindowsRemoteRecorderDownloadUrl(JAXBElement<String> value) {
        this.windowsRemoteRecorderDownloadUrl = value;
    }
    
}
