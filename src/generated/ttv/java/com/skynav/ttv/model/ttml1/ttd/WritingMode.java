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
 * <p>Java class for writingMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="writingMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="lrtb"/>
 *     &lt;enumeration value="rltb"/>
 *     &lt;enumeration value="tbrl"/>
 *     &lt;enumeration value="tblr"/>
 *     &lt;enumeration value="lr"/>
 *     &lt;enumeration value="rl"/>
 *     &lt;enumeration value="tb"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "writingMode", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum WritingMode {

    @XmlEnumValue("lrtb")
    LRTB("lrtb"),
    @XmlEnumValue("rltb")
    RLTB("rltb"),
    @XmlEnumValue("tbrl")
    TBRL("tbrl"),
    @XmlEnumValue("tblr")
    TBLR("tblr"),
    @XmlEnumValue("lr")
    LR("lr"),
    @XmlEnumValue("rl")
    RL("rl"),
    @XmlEnumValue("tb")
    TB("tb");
    private final String value;

    WritingMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WritingMode fromValue(String v) {
        for (WritingMode c: WritingMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
