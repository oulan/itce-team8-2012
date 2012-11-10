
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopeDefinition.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeDefinition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Fixed"/>
 *     &lt;enumeration value="Configurable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScopeDefinition")
@XmlEnum
public enum ScopeDefinition {

    @XmlEnumValue("Fixed")
    FIXED("Fixed"),
    @XmlEnumValue("Configurable")
    CONFIGURABLE("Configurable");
    private final String value;

    ScopeDefinition(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeDefinition fromValue(String v) {
        for (ScopeDefinition c: ScopeDefinition.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
