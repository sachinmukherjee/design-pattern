package com.sachinmukherjee.creational.factory;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification");
	}

}
