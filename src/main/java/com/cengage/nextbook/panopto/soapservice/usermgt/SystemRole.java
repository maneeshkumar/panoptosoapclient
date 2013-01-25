package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SystemRole.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="SystemRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Videographer"/>
 *     &lt;enumeration value="Admin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SystemRole",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum SystemRole {
    
    @XmlEnumValue("None")
    NONE("None"), @XmlEnumValue("Videographer")
    VIDEOGRAPHER("Videographer"), @XmlEnumValue("Admin")
    ADMIN("Admin");
    private final String value;
    
    SystemRole(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SystemRole fromValue(String v) {
        for (SystemRole c:SystemRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
