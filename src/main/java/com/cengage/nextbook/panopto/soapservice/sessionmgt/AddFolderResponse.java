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
 *         &lt;element name="AddFolderResult" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Folder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"addFolderResult"})
@XmlRootElement(name = "AddFolderResponse")
public class AddFolderResponse {
    
    @XmlElementRef(name = "AddFolderResult",
                   namespace = "http://tempuri.org/",
                   type = JAXBElement.class,
                   required = false)
    protected JAXBElement<Folder> addFolderResult;
    
    /**
     * Gets the value of the addFolderResult property.
     * 
     * @return possible object is {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     */
    public JAXBElement<Folder> getAddFolderResult() {
        return addFolderResult;
    }
    
    /**
     * Sets the value of the addFolderResult property.
     * 
     * @param value allowed object is {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     */
    public void setAddFolderResult(JAXBElement<Folder> value) {
        this.addFolderResult = value;
    }
    
}
