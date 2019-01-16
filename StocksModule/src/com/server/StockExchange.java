package com.server;

import java.util.HashMap;

import javax.jws.WebService;

@WebService(targetNamespace = "http://server.com/", endpointInterface = "com.server.StockX", portName = "StockExchangePort", serviceName = "StockExchangeService")
public class StockExchange implements Stock, StockX{
	HashMap<String, Double> stocks=new HashMap<String,Double>();
	
	@Override
	public Boolean updateStock(String stockName, double price) {
		// TODO Auto-generated method stub
		stocks.put(stockName,price);
		System.out.println("Stock added and now updated - "+stockName+" - "+stocks.get(stockName));
		return true;
	}

	@Override
	public double getStockPrice(String stockName) {
		// TODO Auto-generated method stub
		if(!stocks.containsKey(stockName)) stocks.put(stockName, 333d);
		System.out.println("price for given stock - "+stockName+" - "+ stocks.get(stockName));
		return stocks.get(stockName);
	}

	@Override
	public boolean removeStock(String stockName) {
		// TODO Auto-generated method stub
		if(stocks.containsKey(stockName)) {
			stocks.remove(stockName);
			System.out.println("stock found and removed - "+stockName);
			return true;
		}
		return false;
	}

}
