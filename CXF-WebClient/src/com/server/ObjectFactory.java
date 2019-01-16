
package com.server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.server package. 
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

    private final static QName _GetName_QNAME = new QName("http://server.com/", "getName");
    private final static QName _GetNameResponse_QNAME = new QName("http://server.com/", "getNameResponse");
    private final static QName _ReadBalance_QNAME = new QName("http://server.com/", "readBalance");
    private final static QName _ReadBalanceResponse_QNAME = new QName("http://server.com/", "readBalanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link ReadBalance }
     * 
     */
    public ReadBalance createReadBalance() {
        return new ReadBalance();
    }

    /**
     * Create an instance of {@link ReadBalanceResponse }
     * 
     */
    public ReadBalanceResponse createReadBalanceResponse() {
        return new ReadBalanceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "readBalance")
    public JAXBElement<ReadBalance> createReadBalance(ReadBalance value) {
        return new JAXBElement<ReadBalance>(_ReadBalance_QNAME, ReadBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "readBalanceResponse")
    public JAXBElement<ReadBalanceResponse> createReadBalanceResponse(ReadBalanceResponse value) {
        return new JAXBElement<ReadBalanceResponse>(_ReadBalanceResponse_QNAME, ReadBalanceResponse.class, null, value);
    }

}
