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
 *         &lt;element name="CreateNoteByAbsoluteTimeResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"createNoteByAbsoluteTimeResult"})
@XmlRootElement(name = "CreateNoteByAbsoluteTimeResponse")
public class CreateNoteByAbsoluteTimeResponse {
    
    @XmlElement(name = "CreateNoteByAbsoluteTimeResult")
    protected String createNoteByAbsoluteTimeResult;
    
    /**
     * Gets the value of the createNoteByAbsoluteTimeResult property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateNoteByAbsoluteTimeResult() {
        return createNoteByAbsoluteTimeResult;
    }
    
    /**
     * Sets the value of the createNoteByAbsoluteTimeResult property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreateNoteByAbsoluteTimeResult(String value) {
        this.createNoteByAbsoluteTimeResult = value;
    }
    
}
