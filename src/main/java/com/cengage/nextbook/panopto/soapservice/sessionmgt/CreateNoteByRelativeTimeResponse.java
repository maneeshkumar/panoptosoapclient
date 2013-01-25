package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="CreateNoteByRelativeTimeResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"createNoteByRelativeTimeResult"})
@XmlRootElement(name = "CreateNoteByRelativeTimeResponse")
public class CreateNoteByRelativeTimeResponse {
    
    @XmlElement(name = "CreateNoteByRelativeTimeResult")
    protected String createNoteByRelativeTimeResult;
    
    /**
     * Gets the value of the createNoteByRelativeTimeResult property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateNoteByRelativeTimeResult() {
        return createNoteByRelativeTimeResult;
    }
    
    /**
     * Sets the value of the createNoteByRelativeTimeResult property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreateNoteByRelativeTimeResult(String value) {
        this.createNoteByRelativeTimeResult = value;
    }
    
}
