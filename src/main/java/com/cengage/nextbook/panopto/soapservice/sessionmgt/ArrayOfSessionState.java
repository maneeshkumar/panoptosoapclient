package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ArrayOfSessionState complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSessionState">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionState" type="{http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40}SessionState" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSessionState",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
         propOrder = {"sessionState"})
public class ArrayOfSessionState {
    
    @XmlElement(name = "SessionState")
    protected List<SessionState> sessionState;
    
    public ArrayOfSessionState(List<SessionState> sessionState) {
        
        this.sessionState = sessionState;
    }
    
    public ArrayOfSessionState() {
        
    }
    
    /**
     * Gets the value of the sessionState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
     * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
     * the sessionState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getSessionState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SessionState }
     * 
     * 
     */
    public List<SessionState> getSessionState() {
        if (sessionState == null) {
            sessionState = new ArrayList<SessionState>();
        }
        return this.sessionState;
    }
    
}
