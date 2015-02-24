//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.23 at 12:03:44 AM MST 
//


package com.skynav.ttv.model.ttml1.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataNameType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="metadataNameType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="full"/>
 *     &lt;enumeration value="family"/>
 *     &lt;enumeration value="given"/>
 *     &lt;enumeration value="alias"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "metadataNameType", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum NameType {

    @XmlEnumValue("full")
    FULL("full"),
    @XmlEnumValue("family")
    FAMILY("family"),
    @XmlEnumValue("given")
    GIVEN("given"),
    @XmlEnumValue("alias")
    ALIAS("alias"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    NameType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameType fromValue(String v) {
        for (NameType c: NameType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
