//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.23 at 12:03:45 AM MST 
//


package com.skynav.ttv.model.ttml2.ttm;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.skynav.ttv.model.ttml2.ttm package. 
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

    private final static QName _Item_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "item");
    private final static QName _Agent_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "agent");
    private final static QName _Copyright_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "copyright");
    private final static QName _Name_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "name");
    private final static QName _Title_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "title");
    private final static QName _Actor_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "actor");
    private final static QName _Desc_QNAME = new QName("http://www.w3.org/ns/ttml#metadata", "desc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.skynav.ttv.model.ttml2.ttm
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link Copyright }
     * 
     */
    public Copyright createCopyright() {
        return new Copyright();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "agent")
    public JAXBElement<Agent> createAgent(Agent value) {
        return new JAXBElement<Agent>(_Agent_QNAME, Agent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Copyright }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "copyright")
    public JAXBElement<Copyright> createCopyright(Copyright value) {
        return new JAXBElement<Copyright>(_Copyright_QNAME, Copyright.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Name }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "name")
    public JAXBElement<Name> createName(Name value) {
        return new JAXBElement<Name>(_Name_QNAME, Name.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Title }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "title")
    public JAXBElement<Title> createTitle(Title value) {
        return new JAXBElement<Title>(_Title_QNAME, Title.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Actor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "actor")
    public JAXBElement<Actor> createActor(Actor value) {
        return new JAXBElement<Actor>(_Actor_QNAME, Actor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Description }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/ttml#metadata", name = "desc")
    public JAXBElement<Description> createDesc(Description value) {
        return new JAXBElement<Description>(_Desc_QNAME, Description.class, null, value);
    }

}
