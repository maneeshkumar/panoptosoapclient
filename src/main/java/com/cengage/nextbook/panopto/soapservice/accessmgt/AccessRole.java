package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for AccessRole.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="AccessRole">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Creator"/>
 *     &lt;enumeration value="Viewer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccessRole",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum AccessRole {
    
    @XmlEnumValue("Creator")
    CREATOR("Creator"), @XmlEnumValue("Viewer")
    VIEWER("Viewer");
    private final String value;
    
    AccessRole(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static AccessRole fromValue(String v) {
        for (AccessRole c:AccessRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
