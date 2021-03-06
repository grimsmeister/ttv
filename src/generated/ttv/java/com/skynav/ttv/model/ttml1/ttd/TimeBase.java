//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.23 at 04:51:16 PM MDT 
//


package com.skynav.ttv.model.ttml1.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for timeBase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="timeBase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="media"/>
 *     &lt;enumeration value="smpte"/>
 *     &lt;enumeration value="clock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "timeBase", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum TimeBase {

    @XmlEnumValue("media")
    MEDIA("media"),
    @XmlEnumValue("smpte")
    SMPTE("smpte"),
    @XmlEnumValue("clock")
    CLOCK("clock");
    private final String value;

    TimeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeBase fromValue(String v) {
        for (TimeBase c: TimeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
