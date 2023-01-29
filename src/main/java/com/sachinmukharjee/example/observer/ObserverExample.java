package com.sachinmukharjee.example.observer;

public class ObserverExample {
	
	public static void main(String[] args) {
		StockObservable observable = new IPhoneObservableImpl();
		
		observable.add(new EmailNotification("xyz@gmail.com"));
		observable.add(new EmailNotification("abc@gmail.com"));
		
		System.out.println("Adding new Stock");
		observable.setStockCount(25);
		
		observable.setStockCount(0);
		
		System.out.println("Updated the stock");
	}
}
