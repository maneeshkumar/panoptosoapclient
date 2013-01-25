package com.cengage.nextbook.panopto.soapservice.usermgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for UserSortField.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="UserSortField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UserKey"/>
 *     &lt;enumeration value="Role"/>
 *     &lt;enumeration value="Added"/>
 *     &lt;enumeration value="LastLogOn"/>
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="FullName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserSortField",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum UserSortField {
    
    @XmlEnumValue("UserKey")
    USER_KEY("UserKey"), @XmlEnumValue("Role")
    ROLE("Role"), @XmlEnumValue("Added")
    ADDED("Added"), @XmlEnumValue("LastLogOn")
    LAST_LOG_ON("LastLogOn"), @XmlEnumValue("Email")
    EMAIL("Email"), @XmlEnumValue("FullName")
    FULL_NAME("FullName");
    private final String value;
    
    UserSortField(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static UserSortField fromValue(String v) {
        for (UserSortField c:UserSortField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
