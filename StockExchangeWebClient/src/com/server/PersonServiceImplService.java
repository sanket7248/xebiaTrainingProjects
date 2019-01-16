package com.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-15T16:30:23.204+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "PersonServiceImplService",
                  wsdlLocation = "http://localhost:8080/StocksModule/services/personservice?wsdl",
                  targetNamespace = "http://server.com/")
public class PersonServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.com/", "PersonServiceImplService");
    public final static QName PersonServiceImplPort = new QName("http://server.com/", "PersonServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/StocksModule/services/personservice?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(PersonServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/StocksModule/services/personservice?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public PersonServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PersonServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PersonServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PersonServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PersonServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PersonSEI
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonSEI getPersonServiceImplPort() {
        return super.getPort(PersonServiceImplPort, PersonSEI.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonSEI
     */
    @WebEndpoint(name = "PersonServiceImplPort")
    public PersonSEI getPersonServiceImplPort(WebServiceFeature... features) {
        return super.getPort(PersonServiceImplPort, PersonSEI.class, features);
    }

}