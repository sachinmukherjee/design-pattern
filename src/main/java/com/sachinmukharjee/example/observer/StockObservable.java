package com.sachinmukharjee.example.observer;

public interface StockObservable {
	
	void add(NotificationObserver observer);
	
	void remove(NotificationObserver observer);
	
	void notifySubscriber();
	
	void setStockCount(int newStock);
}
