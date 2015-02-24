//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.23 at 12:03:45 AM MST 
//


package com.skynav.ttv.model.ttml2.ttp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.skynav.ttv.model.ttml2.ttp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Extensions_QNAME = new QName("http://www.w3.org/ns/ttml#parameter", "extensions");
    private final static QName _Profile_QNAME = new QName("http://www.w3.org/ns/ttml#parameter", "profile");
    private final static QName _Features_QNAME = new QName("http://www.w3.org/ns/ttml#parameter", "features");
    private final static QName _Feature_QNAME = new QName("http://www.w3.org/ns/ttml#parameter", "feature");
    private final static QName _Extension_QNAME = new QName("http://www.w3.org/ns/ttml#parameter", "extension");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.skynav.ttv.model.ttml2.ttp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Profile }
     * 
     */
    public Profile createProfile() {
        return new Profile();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link Extension }
     * 
     */
    public Extension createExtension() {
        return new Extension();
    }

    /**
     * Create an instance of {@link Extensions }
     * 
     */
    public Extensions createExtensions() {
        return new Extensions();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extensions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#parameter", name = "extensions")
    public JAXBElement<Extensions> createExtensions(Extensions value) {
        return new JAXBElement<Extensions>(_Extensions_QNAME, Extensions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Profile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#parameter", name = "profile")
    public JAXBElement<Profile> createProfile(Profile value) {
        return new JAXBElement<Profile>(_Profile_QNAME, Profile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Features }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#parameter", name = "features")
    public JAXBElement<Features> createFeatures(Features value) {
        return new JAXBElement<Features>(_Features_QNAME, Features.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Feature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#parameter", name = "feature")
    public JAXBElement<Feature> createFeature(Feature value) {
        return new JAXBElement<Feature>(_Feature_QNAME, Feature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extension }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#parameter", name = "extension")
    public JAXBElement<Extension> createExtension(Extension value) {
        return new JAXBElement<Extension>(_Extension_QNAME, Extension.class, null, value);
    }

}
