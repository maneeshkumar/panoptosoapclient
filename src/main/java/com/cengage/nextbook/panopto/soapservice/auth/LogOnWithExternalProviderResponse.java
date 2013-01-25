package com.cengage.nextbook.panopto.soapservice.auth;

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
 *         &lt;element name="LogOnWithExternalProviderResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"logOnWithExternalProviderResult"})
@XmlRootElement(name = "LogOnWithExternalProviderResponse")
public class LogOnWithExternalProviderResponse {
    
    @XmlElement(name = "LogOnWithExternalProviderResult")
    protected Boolean logOnWithExternalProviderResult;
    
    /**
     * Gets the value of the logOnWithExternalProviderResult property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isLogOnWithExternalProviderResult() {
        return logOnWithExternalProviderResult;
    }
    
    /**
     * Sets the value of the logOnWithExternalProviderResult property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setLogOnWithExternalProviderResult(Boolean value) {
        this.logOnWithExternalProviderResult = value;
    }
    
}
