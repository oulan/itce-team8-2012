
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelayLogicalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelayLogicalState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="active"/>
 *     &lt;enumeration value="inactive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelayLogicalState")
@XmlEnum
public enum RelayLogicalState {

    @XmlEnumValue("active")
    ACTIVE("active"),
    @XmlEnumValue("inactive")
    INACTIVE("inactive");
    private final String value;

    RelayLogicalState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelayLogicalState fromValue(String v) {
        for (RelayLogicalState c: RelayLogicalState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
