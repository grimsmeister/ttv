//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.11 at 05:03:30 PM MST 
//


package com.skynav.ttv.model.ttml2.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rubyAlign.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="rubyAlign">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="start"/>
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="spaceBetween"/>
 *     &lt;enumeration value="spaceAround"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rubyAlign", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum RubyAlign {

    @XmlEnumValue("start")
    START("start"),
    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("spaceBetween")
    SPACE_BETWEEN("spaceBetween"),
    @XmlEnumValue("spaceAround")
    SPACE_AROUND("spaceAround");
    private final String value;

    RubyAlign(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RubyAlign fromValue(String v) {
        for (RubyAlign c: RubyAlign.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}