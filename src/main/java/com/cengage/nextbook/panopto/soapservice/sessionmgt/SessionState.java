package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SessionState.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SessionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Scheduled"/>
 *     &lt;enumeration value="Recording"/>
 *     &lt;enumeration value="Broadcasting"/>
 *     &lt;enumeration value="Processing"/>
 *     &lt;enumeration value="Complete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SessionState",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum SessionState {
    
    @XmlEnumValue("Created")
    CREATED("Created"), @XmlEnumValue("Scheduled")
    SCHEDULED("Scheduled"), @XmlEnumValue("Recording")
    RECORDING("Recording"), @XmlEnumValue("Broadcasting")
    BROADCASTING("Broadcasting"), @XmlEnumValue("Processing")
    PROCESSING("Processing"), @XmlEnumValue("Complete")
    COMPLETE("Complete");
    private final String value;
    
    SessionState(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SessionState fromValue(String v) {
        for (SessionState c:SessionState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
