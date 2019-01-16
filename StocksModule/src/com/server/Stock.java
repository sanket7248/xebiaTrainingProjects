package com.server;

public interface Stock {
	public Boolean updateStock (String stockName, double price);
	public double getStockPrice (String stockName);
	public boolean removeStock(String stockName);
}
