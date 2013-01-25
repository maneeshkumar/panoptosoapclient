package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SessionSortField.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SessionSortField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Duration"/>
 *     &lt;enumeration value="State"/>
 *     &lt;enumeration value="Relevance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionSortField",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum SessionSortField {
    
    @XmlEnumValue("Name")
    NAME("Name"), @XmlEnumValue("Date")
    DATE("Date"), @XmlEnumValue("Duration")
    DURATION("Duration"), @XmlEnumValue("State")
    STATE("State"), @XmlEnumValue("Relevance")
    RELEVANCE("Relevance");
    private final String value;
    
    SessionSortField(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SessionSortField fromValue(String v) {
        for (SessionSortField c:SessionSortField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
