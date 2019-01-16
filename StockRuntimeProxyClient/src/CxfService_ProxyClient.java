import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

 

//No cxf libraries are needed here..only the interface Account 
//The Java 6 runtime supports theses jaxws runtime features
public class CxfService_ProxyClient {
    public static void main (String [] args)  throws MalformedURLException {
    	System.out.println("CxfService_ProxyClient.main()");

         // Create a Service instance based on
         // the location of the WSDL
         URL wsdlLocation = new URL ("http://localhost:8080/StocksModule/services/StockExchangePort?wsdl");
         QName serviceName = new QName ("http://server.com/","StockExchangeService");
         Service service = Service.create (wsdlLocation, serviceName);

         // Return a list of QNames from service endpoints
         System.out.println ("List of QNames of service endpoints:");
         Iterator it = service.getPorts();
         while (it.hasNext ()) {
        	 QName port = (QName) it.next();
             System.out.println (" Name  " +port.getLocalPart() + " Namespace  "+port.getNamespaceURI());
         }

         // Generate the 'Account' implementation proxy
         StockX proxy = service.getPort (StockX.class);
         System.out.println("The proxy is  "+proxy);
         Boolean result = proxy.updateStock("firstStock", 111133d);
         
         System.out.println ("\nResponse from web service: ");
         System.out.println (" " + result);
         System.out.println("Price: "+proxy.getStockPrice("firstStock"));
         
         
     }
}