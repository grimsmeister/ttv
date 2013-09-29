//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.16 at 12:19:44 PM MDT 
//


package com.skynav.ttv.model.ttml1.tt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.skynav.ttv.model.ttml1.ttd.Direction;
import com.skynav.ttv.model.ttml1.ttd.Display;
import com.skynav.ttv.model.ttml1.ttd.DisplayAlign;
import com.skynav.ttv.model.ttml1.ttd.FontStyle;
import com.skynav.ttv.model.ttml1.ttd.FontWeight;
import com.skynav.ttv.model.ttml1.ttd.Overflow;
import com.skynav.ttv.model.ttml1.ttd.ShowBackground;
import com.skynav.ttv.model.ttml1.ttd.TextAlign;
import com.skynav.ttv.model.ttml1.ttd.TextDecoration;
import com.skynav.ttv.model.ttml1.ttd.UnicodeBidi;
import com.skynav.ttv.model.ttml1.ttd.Visibility;
import com.skynav.ttv.model.ttml1.ttd.WrapOption;
import com.skynav.ttv.model.ttml1.ttd.WritingMode;


/**
 * <p>Java class for style.eltype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style.eltype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/ns/ttml}style.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style.eltype")
public class Style {

    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String backgroundColor;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String color;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Direction direction;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Display display;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected DisplayAlign displayAlign;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String extent;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String fontFamily;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String fontSize;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontStyle fontStyle;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontWeight fontWeight;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String lineHeight;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Float opacity;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String origin;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Overflow overflow;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String padding;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected ShowBackground showBackground;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected TextAlign textAlign;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected TextDecoration textDecoration;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String textOutline;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected UnicodeBidi unicodeBidi;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Visibility visibility;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected WrapOption wrapOption;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected WritingMode writingMode;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String zIndex;
    @XmlAttribute(name = "style")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> styleAttribute;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Display }
     *     
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Display }
     *     
     */
    public void setDisplay(Display value) {
        this.display = value;
    }

    /**
     * Gets the value of the displayAlign property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAlign }
     *     
     */
    public DisplayAlign getDisplayAlign() {
        return displayAlign;
    }

    /**
     * Sets the value of the displayAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAlign }
     *     
     */
    public void setDisplayAlign(DisplayAlign value) {
        this.displayAlign = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(String value) {
        this.extent = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyle(FontStyle value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link FontWeight }
     *     
     */
    public FontWeight getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontWeight }
     *     
     */
    public void setFontWeight(FontWeight value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the lineHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeight() {
        return lineHeight;
    }

    /**
     * Sets the value of the lineHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeight(String value) {
        this.lineHeight = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOpacity(Float value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the overflow property.
     * 
     * @return
     *     possible object is
     *     {@link Overflow }
     *     
     */
    public Overflow getOverflow() {
        return overflow;
    }

    /**
     * Sets the value of the overflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overflow }
     *     
     */
    public void setOverflow(Overflow value) {
        this.overflow = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the showBackground property.
     * 
     * @return
     *     possible object is
     *     {@link ShowBackground }
     *     
     */
    public ShowBackground getShowBackground() {
        return showBackground;
    }

    /**
     * Sets the value of the showBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowBackground }
     *     
     */
    public void setShowBackground(ShowBackground value) {
        this.showBackground = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlign }
     *     
     */
    public TextAlign getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlign }
     *     
     */
    public void setTextAlign(TextAlign value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the textDecoration property.
     * 
     * @return
     *     possible object is
     *     {@link TextDecoration }
     *     
     */
    public TextDecoration getTextDecoration() {
        return textDecoration;
    }

    /**
     * Sets the value of the textDecoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDecoration }
     *     
     */
    public void setTextDecoration(TextDecoration value) {
        this.textDecoration = value;
    }

    /**
     * Gets the value of the textOutline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOutline() {
        return textOutline;
    }

    /**
     * Sets the value of the textOutline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOutline(String value) {
        this.textOutline = value;
    }

    /**
     * Gets the value of the unicodeBidi property.
     * 
     * @return
     *     possible object is
     *     {@link UnicodeBidi }
     *     
     */
    public UnicodeBidi getUnicodeBidi() {
        return unicodeBidi;
    }

    /**
     * Sets the value of the unicodeBidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnicodeBidi }
     *     
     */
    public void setUnicodeBidi(UnicodeBidi value) {
        this.unicodeBidi = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the wrapOption property.
     * 
     * @return
     *     possible object is
     *     {@link WrapOption }
     *     
     */
    public WrapOption getWrapOption() {
        return wrapOption;
    }

    /**
     * Sets the value of the wrapOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrapOption }
     *     
     */
    public void setWrapOption(WrapOption value) {
        this.wrapOption = value;
    }

    /**
     * Gets the value of the writingMode property.
     * 
     * @return
     *     possible object is
     *     {@link WritingMode }
     *     
     */
    public WritingMode getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WritingMode }
     *     
     */
    public void setWritingMode(WritingMode value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIndex() {
        return zIndex;
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIndex(String value) {
        this.zIndex = value;
    }

    /**
     * Gets the value of the styleAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStyleAttribute() {
        if (styleAttribute == null) {
            styleAttribute = new ArrayList<Object>();
        }
        return this.styleAttribute;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}