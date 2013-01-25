package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for GroupType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="GroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActiveDirectory"/>
 *     &lt;enumeration value="External"/>
 *     &lt;enumeration value="Internal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GroupType",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum GroupType {
    
    @XmlEnumValue("ActiveDirectory")
    ACTIVE_DIRECTORY("ActiveDirectory"), @XmlEnumValue("External")
    EXTERNAL("External"), @XmlEnumValue("Internal")
    INTERNAL("Internal");
    private final String value;
    
    GroupType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static GroupType fromValue(String v) {
        for (GroupType c:GroupType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
