package com.sachinmukharjee.example.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable {
	
	private List<NotificationObserver> observerList = new ArrayList<>();
	private int stockCount = 0;
	
	@Override
	public void add(NotificationObserver observer) {
		observerList.add(observer);

	}

	@Override
	public void remove(NotificationObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscriber() {
		for(NotificationObserver observer: observerList) {
			observer.update();
		}

	}
	
	@Override
	public void setStockCount(int newStock) {
		if(newStock == 0) {
			notifySubscriber();
		}
		this.stockCount = newStock;
	}

}
