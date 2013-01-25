package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for FolderSortField.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FolderSortField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Name"/>
 *     &lt;enumeration value="Sessions"/>
 *     &lt;enumeration value="Relavance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FolderSortField",
         namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40")
@XmlEnum
public enum FolderSortField {
    
    @XmlEnumValue("Name")
    NAME("Name"), @XmlEnumValue("Sessions")
    SESSIONS("Sessions"), @XmlEnumValue("Relavance")
    RELAVANCE("Relavance");
    private final String value;
    
    FolderSortField(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static FolderSortField fromValue(String v) {
        for (FolderSortField c:FolderSortField.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
}
