package com.cengage.nextbook.panopto.soapservice.usermgt;

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
 *         &lt;element name="CreateUserResult" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"createUserResult"})
@XmlRootElement(name = "CreateUserResponse")
public class CreateUserResponse {
    
    @XmlElement(name = "CreateUserResult")
    protected String createUserResult;
    
    /**
     * Gets the value of the createUserResult property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getCreateUserResult() {
        return createUserResult;
    }
    
    /**
     * Sets the value of the createUserResult property.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setCreateUserResult(String value) {
        this.createUserResult = value;
    }
    
}
