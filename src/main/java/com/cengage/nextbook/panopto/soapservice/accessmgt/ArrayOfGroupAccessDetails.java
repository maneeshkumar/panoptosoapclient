package com.cengage.nextbook.panopto.soapservice.accessmgt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfGroupAccessDetails complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGroupAccessDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupAccessDetails" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}GroupAccessDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGroupAccessDetails",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"groupAccessDetails"})
public class ArrayOfGroupAccessDetails {
    
    @XmlElement(name = "GroupAccessDetails", nillable = true)
    protected List<GroupAccessDetails> groupAccessDetails;
    
    /**
     * Gets the value of the groupAccessDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the groupAccessDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getGroupAccessDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GroupAccessDetails }
     * 
     * 
     */
    public List<GroupAccessDetails> getGroupAccessDetails() {
        if (groupAccessDetails == null) {
            groupAccessDetails = new ArrayList<GroupAccessDetails>();
        }
        return this.groupAccessDetails;
    }
    
}
