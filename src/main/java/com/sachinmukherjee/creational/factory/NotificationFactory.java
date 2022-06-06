package com.sachinmukherjee.creational.factory;

public class NotificationFactory {
	
	public Notification createNotification(final String channel) {
		switch(channel) {
		case "SMS":
			return new SMSNotification();
		case "EMAIL":
			return new EmailNotification();
		case "PUSH":
			return new PushNotification();
		default:
			throw new IllegalArgumentException();
		}
	}
}
