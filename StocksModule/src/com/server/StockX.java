package com.server;

import javax.jws.WebService;

@WebService(name = "StockX", targetNamespace = "http://server.com/")
public interface StockX {

	Boolean updateStock(String stockName, double price);

	double getStockPrice(String stockName);

	boolean removeStock(String stockName);

}