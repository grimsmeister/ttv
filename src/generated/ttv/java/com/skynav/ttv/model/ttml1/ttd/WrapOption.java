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
 * <p>Java class for wrapOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wrapOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="wrap"/>
 *     &lt;enumeration value="noWrap"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wrapOption", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum WrapOption {

    @XmlEnumValue("wrap")
    WRAP("wrap"),
    @XmlEnumValue("noWrap")
    NO_WRAP("noWrap");
    private final String value;

    WrapOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WrapOption fromValue(String v) {
        for (WrapOption c: WrapOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
