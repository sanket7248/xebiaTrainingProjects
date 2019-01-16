
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

    private final static QName _GetPerson_QNAME = new QName("http://server.com/", "getPerson");
	private final static QName _GetPersonResponse_QNAME = new QName("http://server.com/", "getPersonResponse");
	private final static QName _UpdatePerson_QNAME = new QName("http://server.com/", "updatePerson");
	private final static QName _UpdatePersonResponse_QNAME = new QName("http://server.com/", "updatePersonResponse");
	private final static QName _GetStockPrice_QNAME = new QName("http://server.com/", "getStockPrice");
    private final static QName _GetStockPriceResponse_QNAME = new QName("http://server.com/", "getStockPriceResponse");
    private final static QName _RemoveStock_QNAME = new QName("http://server.com/", "removeStock");
    private final static QName _RemoveStockResponse_QNAME = new QName("http://server.com/", "removeStockResponse");
    private final static QName _UpdateStock_QNAME = new QName("http://server.com/", "updateStock");
    private final static QName _UpdateStockResponse_QNAME = new QName("http://server.com/", "updateStockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

	/**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

	/**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

	/**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

	/**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

	/**
     * Create an instance of {@link GetStockPrice }
     * 
     */
    public GetStockPrice createGetStockPrice() {
        return new GetStockPrice();
    }

    /**
     * Create an instance of {@link GetStockPriceResponse }
     * 
     */
    public GetStockPriceResponse createGetStockPriceResponse() {
        return new GetStockPriceResponse();
    }

    /**
     * Create an instance of {@link RemoveStock }
     * 
     */
    public RemoveStock createRemoveStock() {
        return new RemoveStock();
    }

    /**
     * Create an instance of {@link RemoveStockResponse }
     * 
     */
    public RemoveStockResponse createRemoveStockResponse() {
        return new RemoveStockResponse();
    }

    /**
     * Create an instance of {@link UpdateStock }
     * 
     */
    public UpdateStock createUpdateStock() {
        return new UpdateStock();
    }

    /**
     * Create an instance of {@link UpdateStockResponse }
     * 
     */
    public UpdateStockResponse createUpdateStockResponse() {
        return new UpdateStockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPrice }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "getStockPrice")
    public JAXBElement<GetStockPrice> createGetStockPrice(GetStockPrice value) {
        return new JAXBElement<GetStockPrice>(_GetStockPrice_QNAME, GetStockPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockPriceResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "getStockPriceResponse")
    public JAXBElement<GetStockPriceResponse> createGetStockPriceResponse(GetStockPriceResponse value) {
        return new JAXBElement<GetStockPriceResponse>(_GetStockPriceResponse_QNAME, GetStockPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStock }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "removeStock")
    public JAXBElement<RemoveStock> createRemoveStock(RemoveStock value) {
        return new JAXBElement<RemoveStock>(_RemoveStock_QNAME, RemoveStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStockResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "removeStockResponse")
    public JAXBElement<RemoveStockResponse> createRemoveStockResponse(RemoveStockResponse value) {
        return new JAXBElement<RemoveStockResponse>(_RemoveStockResponse_QNAME, RemoveStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStock }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "updateStock")
    public JAXBElement<UpdateStock> createUpdateStock(UpdateStock value) {
        return new JAXBElement<UpdateStock>(_UpdateStock_QNAME, UpdateStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStockResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://server.com/", name = "updateStockResponse")
    public JAXBElement<UpdateStockResponse> createUpdateStockResponse(UpdateStockResponse value) {
        return new JAXBElement<UpdateStockResponse>(_UpdateStockResponse_QNAME, UpdateStockResponse.class, null, value);
    }

}
