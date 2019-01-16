import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.server.StockExchangeServiceLocator;
import com.server.StockX;

public class ClientRunner {
	public static void main(String args[]) throws ServiceException, RemoteException, MalformedURLException {
		StockExchangeServiceLocator exchangeServiceLocator=new StockExchangeServiceLocator();
		StockX stockExchangePort = exchangeServiceLocator.getStockExchangePort(new URL("http://localhost:1991/StocksModule/services/StockExchangePort"));
		//StockX stockExchangePort = exchangeServiceLocator.getStockExchangePort();
		Boolean updateStock = stockExchangePort.updateStock("helloStock", 2474d);
		System.out.println("Result of update stock - "+updateStock);
		double stockPrice = stockExchangePort.getStockPrice("helloStock");
		System.out.println("Price of stock - "+stockPrice);
		
	}
}
