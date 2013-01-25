package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="SetExternalCourseAccessResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}ArrayOfFolder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"setExternalCourseAccessResult"})
@XmlRootElement(name = "SetExternalCourseAccessResponse")
public class SetExternalCourseAccessResponse {
    
    @XmlElementRef(name = "SetExternalCourseAccessResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<ArrayOfFolder> setExternalCourseAccessResult;
    
    /**
     * Gets the value of the setExternalCourseAccessResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    public JAXBElement<ArrayOfFolder> getSetExternalCourseAccessResult() {
        return setExternalCourseAccessResult;
    }
    
    /**
     * Sets the value of the setExternalCourseAccessResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    public void setSetExternalCourseAccessResult(JAXBElement<ArrayOfFolder> value) {
        this.setExternalCourseAccessResult = value;
    }
    
}
