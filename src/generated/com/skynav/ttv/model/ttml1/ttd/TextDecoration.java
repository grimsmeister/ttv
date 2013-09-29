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
 * <p>Java class for textDecoration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="textDecoration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="underline"/>
 *     &lt;enumeration value="noUnderline"/>
 *     &lt;enumeration value="lineThrough"/>
 *     &lt;enumeration value="noLineThrough"/>
 *     &lt;enumeration value="overline"/>
 *     &lt;enumeration value="noOverline"/>
 *     &lt;enumeration value="noUnderline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough noUnderline"/>
 *     &lt;enumeration value="noUnderline lineThrough"/>
 *     &lt;enumeration value="lineThrough noUnderline"/>
 *     &lt;enumeration value="underline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough underline"/>
 *     &lt;enumeration value="underline lineThrough"/>
 *     &lt;enumeration value="lineThrough underline"/>
 *     &lt;enumeration value="noUnderline noOverline"/>
 *     &lt;enumeration value="noOverline noUnderline"/>
 *     &lt;enumeration value="noUnderline overline"/>
 *     &lt;enumeration value="overline noUnderline"/>
 *     &lt;enumeration value="underline noOverline"/>
 *     &lt;enumeration value="noOverline underline"/>
 *     &lt;enumeration value="underline overline"/>
 *     &lt;enumeration value="overline underline"/>
 *     &lt;enumeration value="noUnderline noLineThrough noOverline"/>
 *     &lt;enumeration value="noUnderline noOverline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough noUnderline noOverline"/>
 *     &lt;enumeration value="noLineThrough noOverline noUnderline"/>
 *     &lt;enumeration value="noOverline noUnderline noLineThrough"/>
 *     &lt;enumeration value="noOverline noLineThrough noUnderline"/>
 *     &lt;enumeration value="noUnderline noLineThrough overline"/>
 *     &lt;enumeration value="noUnderline overline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough noUnderline overline"/>
 *     &lt;enumeration value="noLineThrough overline noUnderline"/>
 *     &lt;enumeration value="overline noUnderline noLineThrough"/>
 *     &lt;enumeration value="overline noLineThrough noUnderline"/>
 *     &lt;enumeration value="noUnderline lineThrough noOverline"/>
 *     &lt;enumeration value="noUnderline noOverline lineThrough"/>
 *     &lt;enumeration value="lineThrough noUnderline noOverline"/>
 *     &lt;enumeration value="lineThrough noOverline noUnderline"/>
 *     &lt;enumeration value="noOverline noUnderline lineThrough"/>
 *     &lt;enumeration value="noOverline lineThrough noUnderline"/>
 *     &lt;enumeration value="noUnderline lineThrough overline"/>
 *     &lt;enumeration value="noUnderline overline lineThrough"/>
 *     &lt;enumeration value="lineThrough noUnderline overline"/>
 *     &lt;enumeration value="lineThrough overline noUnderline"/>
 *     &lt;enumeration value="overline noUnderline lineThrough"/>
 *     &lt;enumeration value="overline lineThrough noUnderline"/>
 *     &lt;enumeration value="underline noLineThrough noOverline"/>
 *     &lt;enumeration value="underline noOverline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough underline noOverline"/>
 *     &lt;enumeration value="noLineThrough noOverline underline"/>
 *     &lt;enumeration value="noOverline underline noLineThrough"/>
 *     &lt;enumeration value="noOverline noLineThrough underline"/>
 *     &lt;enumeration value="underline noLineThrough overline"/>
 *     &lt;enumeration value="underline overline noLineThrough"/>
 *     &lt;enumeration value="noLineThrough underline overline"/>
 *     &lt;enumeration value="noLineThrough overline underline"/>
 *     &lt;enumeration value="overline underline noLineThrough"/>
 *     &lt;enumeration value="overline noLineThrough underline"/>
 *     &lt;enumeration value="underline lineThrough noOverline"/>
 *     &lt;enumeration value="underline noOverline lineThrough"/>
 *     &lt;enumeration value="lineThrough underline noOverline"/>
 *     &lt;enumeration value="lineThrough noOverline underline"/>
 *     &lt;enumeration value="noOverline underline lineThrough"/>
 *     &lt;enumeration value="noOverline lineThrough underline"/>
 *     &lt;enumeration value="underline lineThrough overline"/>
 *     &lt;enumeration value="underline overline lineThrough"/>
 *     &lt;enumeration value="lineThrough underline overline"/>
 *     &lt;enumeration value="lineThrough overline underline"/>
 *     &lt;enumeration value="overline underline lineThrough"/>
 *     &lt;enumeration value="overline lineThrough underline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textDecoration", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum TextDecoration {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("underline")
    UNDERLINE("underline"),
    @XmlEnumValue("noUnderline")
    NO_UNDERLINE("noUnderline"),
    @XmlEnumValue("lineThrough")
    LINE_THROUGH("lineThrough"),
    @XmlEnumValue("noLineThrough")
    NO_LINE_THROUGH("noLineThrough"),
    @XmlEnumValue("overline")
    OVERLINE("overline"),
    @XmlEnumValue("noOverline")
    NO_OVERLINE("noOverline"),
    @XmlEnumValue("noUnderline noLineThrough")
    NO_UNDERLINE_NO_LINE_THROUGH("noUnderline noLineThrough"),
    @XmlEnumValue("noLineThrough noUnderline")
    NO_LINE_THROUGH_NO_UNDERLINE("noLineThrough noUnderline"),
    @XmlEnumValue("noUnderline lineThrough")
    NO_UNDERLINE_LINE_THROUGH("noUnderline lineThrough"),
    @XmlEnumValue("lineThrough noUnderline")
    LINE_THROUGH_NO_UNDERLINE("lineThrough noUnderline"),
    @XmlEnumValue("underline noLineThrough")
    UNDERLINE_NO_LINE_THROUGH("underline noLineThrough"),
    @XmlEnumValue("noLineThrough underline")
    NO_LINE_THROUGH_UNDERLINE("noLineThrough underline"),
    @XmlEnumValue("underline lineThrough")
    UNDERLINE_LINE_THROUGH("underline lineThrough"),
    @XmlEnumValue("lineThrough underline")
    LINE_THROUGH_UNDERLINE("lineThrough underline"),
    @XmlEnumValue("noUnderline noOverline")
    NO_UNDERLINE_NO_OVERLINE("noUnderline noOverline"),
    @XmlEnumValue("noOverline noUnderline")
    NO_OVERLINE_NO_UNDERLINE("noOverline noUnderline"),
    @XmlEnumValue("noUnderline overline")
    NO_UNDERLINE_OVERLINE("noUnderline overline"),
    @XmlEnumValue("overline noUnderline")
    OVERLINE_NO_UNDERLINE("overline noUnderline"),
    @XmlEnumValue("underline noOverline")
    UNDERLINE_NO_OVERLINE("underline noOverline"),
    @XmlEnumValue("noOverline underline")
    NO_OVERLINE_UNDERLINE("noOverline underline"),
    @XmlEnumValue("underline overline")
    UNDERLINE_OVERLINE("underline overline"),
    @XmlEnumValue("overline underline")
    OVERLINE_UNDERLINE("overline underline"),
    @XmlEnumValue("noUnderline noLineThrough noOverline")
    NO_UNDERLINE_NO_LINE_THROUGH_NO_OVERLINE("noUnderline noLineThrough noOverline"),
    @XmlEnumValue("noUnderline noOverline noLineThrough")
    NO_UNDERLINE_NO_OVERLINE_NO_LINE_THROUGH("noUnderline noOverline noLineThrough"),
    @XmlEnumValue("noLineThrough noUnderline noOverline")
    NO_LINE_THROUGH_NO_UNDERLINE_NO_OVERLINE("noLineThrough noUnderline noOverline"),
    @XmlEnumValue("noLineThrough noOverline noUnderline")
    NO_LINE_THROUGH_NO_OVERLINE_NO_UNDERLINE("noLineThrough noOverline noUnderline"),
    @XmlEnumValue("noOverline noUnderline noLineThrough")
    NO_OVERLINE_NO_UNDERLINE_NO_LINE_THROUGH("noOverline noUnderline noLineThrough"),
    @XmlEnumValue("noOverline noLineThrough noUnderline")
    NO_OVERLINE_NO_LINE_THROUGH_NO_UNDERLINE("noOverline noLineThrough noUnderline"),
    @XmlEnumValue("noUnderline noLineThrough overline")
    NO_UNDERLINE_NO_LINE_THROUGH_OVERLINE("noUnderline noLineThrough overline"),
    @XmlEnumValue("noUnderline overline noLineThrough")
    NO_UNDERLINE_OVERLINE_NO_LINE_THROUGH("noUnderline overline noLineThrough"),
    @XmlEnumValue("noLineThrough noUnderline overline")
    NO_LINE_THROUGH_NO_UNDERLINE_OVERLINE("noLineThrough noUnderline overline"),
    @XmlEnumValue("noLineThrough overline noUnderline")
    NO_LINE_THROUGH_OVERLINE_NO_UNDERLINE("noLineThrough overline noUnderline"),
    @XmlEnumValue("overline noUnderline noLineThrough")
    OVERLINE_NO_UNDERLINE_NO_LINE_THROUGH("overline noUnderline noLineThrough"),
    @XmlEnumValue("overline noLineThrough noUnderline")
    OVERLINE_NO_LINE_THROUGH_NO_UNDERLINE("overline noLineThrough noUnderline"),
    @XmlEnumValue("noUnderline lineThrough noOverline")
    NO_UNDERLINE_LINE_THROUGH_NO_OVERLINE("noUnderline lineThrough noOverline"),
    @XmlEnumValue("noUnderline noOverline lineThrough")
    NO_UNDERLINE_NO_OVERLINE_LINE_THROUGH("noUnderline noOverline lineThrough"),
    @XmlEnumValue("lineThrough noUnderline noOverline")
    LINE_THROUGH_NO_UNDERLINE_NO_OVERLINE("lineThrough noUnderline noOverline"),
    @XmlEnumValue("lineThrough noOverline noUnderline")
    LINE_THROUGH_NO_OVERLINE_NO_UNDERLINE("lineThrough noOverline noUnderline"),
    @XmlEnumValue("noOverline noUnderline lineThrough")
    NO_OVERLINE_NO_UNDERLINE_LINE_THROUGH("noOverline noUnderline lineThrough"),
    @XmlEnumValue("noOverline lineThrough noUnderline")
    NO_OVERLINE_LINE_THROUGH_NO_UNDERLINE("noOverline lineThrough noUnderline"),
    @XmlEnumValue("noUnderline lineThrough overline")
    NO_UNDERLINE_LINE_THROUGH_OVERLINE("noUnderline lineThrough overline"),
    @XmlEnumValue("noUnderline overline lineThrough")
    NO_UNDERLINE_OVERLINE_LINE_THROUGH("noUnderline overline lineThrough"),
    @XmlEnumValue("lineThrough noUnderline overline")
    LINE_THROUGH_NO_UNDERLINE_OVERLINE("lineThrough noUnderline overline"),
    @XmlEnumValue("lineThrough overline noUnderline")
    LINE_THROUGH_OVERLINE_NO_UNDERLINE("lineThrough overline noUnderline"),
    @XmlEnumValue("overline noUnderline lineThrough")
    OVERLINE_NO_UNDERLINE_LINE_THROUGH("overline noUnderline lineThrough"),
    @XmlEnumValue("overline lineThrough noUnderline")
    OVERLINE_LINE_THROUGH_NO_UNDERLINE("overline lineThrough noUnderline"),
    @XmlEnumValue("underline noLineThrough noOverline")
    UNDERLINE_NO_LINE_THROUGH_NO_OVERLINE("underline noLineThrough noOverline"),
    @XmlEnumValue("underline noOverline noLineThrough")
    UNDERLINE_NO_OVERLINE_NO_LINE_THROUGH("underline noOverline noLineThrough"),
    @XmlEnumValue("noLineThrough underline noOverline")
    NO_LINE_THROUGH_UNDERLINE_NO_OVERLINE("noLineThrough underline noOverline"),
    @XmlEnumValue("noLineThrough noOverline underline")
    NO_LINE_THROUGH_NO_OVERLINE_UNDERLINE("noLineThrough noOverline underline"),
    @XmlEnumValue("noOverline underline noLineThrough")
    NO_OVERLINE_UNDERLINE_NO_LINE_THROUGH("noOverline underline noLineThrough"),
    @XmlEnumValue("noOverline noLineThrough underline")
    NO_OVERLINE_NO_LINE_THROUGH_UNDERLINE("noOverline noLineThrough underline"),
    @XmlEnumValue("underline noLineThrough overline")
    UNDERLINE_NO_LINE_THROUGH_OVERLINE("underline noLineThrough overline"),
    @XmlEnumValue("underline overline noLineThrough")
    UNDERLINE_OVERLINE_NO_LINE_THROUGH("underline overline noLineThrough"),
    @XmlEnumValue("noLineThrough underline overline")
    NO_LINE_THROUGH_UNDERLINE_OVERLINE("noLineThrough underline overline"),
    @XmlEnumValue("noLineThrough overline underline")
    NO_LINE_THROUGH_OVERLINE_UNDERLINE("noLineThrough overline underline"),
    @XmlEnumValue("overline underline noLineThrough")
    OVERLINE_UNDERLINE_NO_LINE_THROUGH("overline underline noLineThrough"),
    @XmlEnumValue("overline noLineThrough underline")
    OVERLINE_NO_LINE_THROUGH_UNDERLINE("overline noLineThrough underline"),
    @XmlEnumValue("underline lineThrough noOverline")
    UNDERLINE_LINE_THROUGH_NO_OVERLINE("underline lineThrough noOverline"),
    @XmlEnumValue("underline noOverline lineThrough")
    UNDERLINE_NO_OVERLINE_LINE_THROUGH("underline noOverline lineThrough"),
    @XmlEnumValue("lineThrough underline noOverline")
    LINE_THROUGH_UNDERLINE_NO_OVERLINE("lineThrough underline noOverline"),
    @XmlEnumValue("lineThrough noOverline underline")
    LINE_THROUGH_NO_OVERLINE_UNDERLINE("lineThrough noOverline underline"),
    @XmlEnumValue("noOverline underline lineThrough")
    NO_OVERLINE_UNDERLINE_LINE_THROUGH("noOverline underline lineThrough"),
    @XmlEnumValue("noOverline lineThrough underline")
    NO_OVERLINE_LINE_THROUGH_UNDERLINE("noOverline lineThrough underline"),
    @XmlEnumValue("underline lineThrough overline")
    UNDERLINE_LINE_THROUGH_OVERLINE("underline lineThrough overline"),
    @XmlEnumValue("underline overline lineThrough")
    UNDERLINE_OVERLINE_LINE_THROUGH("underline overline lineThrough"),
    @XmlEnumValue("lineThrough underline overline")
    LINE_THROUGH_UNDERLINE_OVERLINE("lineThrough underline overline"),
    @XmlEnumValue("lineThrough overline underline")
    LINE_THROUGH_OVERLINE_UNDERLINE("lineThrough overline underline"),
    @XmlEnumValue("overline underline lineThrough")
    OVERLINE_UNDERLINE_LINE_THROUGH("overline underline lineThrough"),
    @XmlEnumValue("overline lineThrough underline")
    OVERLINE_LINE_THROUGH_UNDERLINE("overline lineThrough underline");
    private final String value;

    TextDecoration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextDecoration fromValue(String v) {
        for (TextDecoration c: TextDecoration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}