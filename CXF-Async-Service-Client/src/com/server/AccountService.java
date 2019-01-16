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
 * 2019-01-16T11:42:04.636+05:30
 * Generated source version: 3.2.7
 *
 */
@WebServiceClient(name = "AccountService",
                  wsdlLocation = "http://localhost:8090/CXF_AsyncService/services/AccountPort?wsdl",
                  targetNamespace = "http://server.com/")
public class AccountService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.com/", "AccountService");
    public final static QName AccountPort = new QName("http://server.com/", "AccountPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8090/CXF_AsyncService/services/AccountPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AccountService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8090/CXF_AsyncService/services/AccountPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AccountService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AccountService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public AccountService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AccountService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AccountService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IAccount
     */
    @WebEndpoint(name = "AccountPort")
    public IAccount getAccountPort() {
        return super.getPort(AccountPort, IAccount.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAccount
     */
    @WebEndpoint(name = "AccountPort")
    public IAccount getAccountPort(WebServiceFeature... features) {
        return super.getPort(AccountPort, IAccount.class, features);
    }

}
