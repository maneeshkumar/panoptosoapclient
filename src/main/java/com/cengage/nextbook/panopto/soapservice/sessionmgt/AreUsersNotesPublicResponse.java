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
 *         &lt;element name="AreUsersNotesPublicResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"areUsersNotesPublicResult"})
@XmlRootElement(name = "AreUsersNotesPublicResponse")
public class AreUsersNotesPublicResponse {
    
    @XmlElement(name = "AreUsersNotesPublicResult")
    protected Boolean areUsersNotesPublicResult;
    
    /**
     * Gets the value of the areUsersNotesPublicResult property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isAreUsersNotesPublicResult() {
        return areUsersNotesPublicResult;
    }
    
    /**
     * Sets the value of the areUsersNotesPublicResult property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setAreUsersNotesPublicResult(Boolean value) {
        this.areUsersNotesPublicResult = value;
    }
    
}
