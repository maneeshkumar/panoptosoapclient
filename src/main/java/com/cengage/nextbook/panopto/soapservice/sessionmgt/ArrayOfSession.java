package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfSession complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Session" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}Session" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSession",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"session"})
public class ArrayOfSession {
    
    @XmlElement(name = "Session", nillable = true)
    protected List<Session> session;
    
    /**
     * Gets the value of the session property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the session property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSession().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Session }
     * 
     * 
     */
    public List<Session> getSession() {
        if (session == null) {
            session = new ArrayList<Session>();
        }
        return this.session;
    }
    
}
