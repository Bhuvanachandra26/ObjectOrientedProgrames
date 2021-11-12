package com.Bridgelabz.ObjectOrientedprogrames;

import com.Bridgelabz.Objectorientedprograms.StockAccountManagement;

public class StockReport {
	private String shareName;
	private double noOfStocks;
	private static double noOfShares;
	private static double sharePrice;
	public double getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(double noOfShares) {
		this.noOfShares = noOfShares;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

public static void main(String[] args) {
	StockAccountManagement name = new StockAccountManagement();
	name.setShareName("bhuvana");
	name.setNoOfShares(4000);
	name.setNoOfStocks(5);
	name.setSharePrice(10);
	System.out.println(name.getShareName());
	System.out.println(name.getNoOfShares());
	System.out.println(name.getNoOfStocks());
	System.out.println(name.getSharePrice());
	@SuppressWarnings("unused")
	double totalvalue = noOfShares * sharePrice;
	System.out.println("totalvalue" + totalvalue);
	
	

	}
	public double getNoOfStocks() {
		return noOfStocks;
	}
	public void setNoOfStocks(double noOfStocks) {
		this.noOfStocks = noOfStocks;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
}
