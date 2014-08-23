//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.23 at 04:51:17 PM MDT 
//


package com.skynav.ttv.model.smpte.tt.rel2010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.skynav.ttv.model.smpte.tt.rel2010 package. 
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

    private final static QName _Image_QNAME = new QName("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", "image");
    private final static QName _Data_QNAME = new QName("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", "data");
    private final static QName _Information_QNAME = new QName("http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", "information");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.skynav.ttv.model.smpte.tt.rel2010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Image }
     * 
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Information }
     * 
     */
    public Information createInformation() {
        return new Information();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Image }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", name = "image")
    public JAXBElement<Image> createImage(Image value) {
        return new JAXBElement<Image>(_Image_QNAME, Image.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Data }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", name = "data")
    public JAXBElement<Data> createData(Data value) {
        return new JAXBElement<Data>(_Data_QNAME, Data.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Information }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt", name = "information")
    public JAXBElement<Information> createInformation(Information value) {
        return new JAXBElement<Information>(_Information_QNAME, Information.class, null, value);
    }

}
