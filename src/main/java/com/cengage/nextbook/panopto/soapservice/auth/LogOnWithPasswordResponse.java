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
 *         &lt;element name="LogOnWithPasswordResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"logOnWithPasswordResult"})
@XmlRootElement(name = "LogOnWithPasswordResponse")
public class LogOnWithPasswordResponse {
    
    @XmlElement(name = "LogOnWithPasswordResult")
    protected Boolean logOnWithPasswordResult;
    
    /**
     * Gets the value of the logOnWithPasswordResult property.
     * 
     * @return possible object is {@link Boolean }
     * 
     */
    public Boolean isLogOnWithPasswordResult() {
        return logOnWithPasswordResult;
    }
    
    /**
     * Sets the value of the logOnWithPasswordResult property.
     * 
     * @param value allowed object is {@link Boolean }
     * 
     */
    public void setLogOnWithPasswordResult(Boolean value) {
        this.logOnWithPasswordResult = value;
    }
    
}
