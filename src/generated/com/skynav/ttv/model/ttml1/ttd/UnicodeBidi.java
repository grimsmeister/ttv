//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 12:19:44 PM MDT 
//


package com.skynav.ttv.model.ttml1.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unicodeBidi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unicodeBidi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="embed"/>
 *     &lt;enumeration value="bidiOverride"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unicodeBidi", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum UnicodeBidi {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("embed")
    EMBED("embed"),
    @XmlEnumValue("bidiOverride")
    BIDI_OVERRIDE("bidiOverride");
    private final String value;

    UnicodeBidi(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnicodeBidi fromValue(String v) {
        for (UnicodeBidi c: UnicodeBidi.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}