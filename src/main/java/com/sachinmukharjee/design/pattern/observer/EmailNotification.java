package com.sachinmukharjee.design.pattern.observer;

public class EmailNotification implements NotificationObserver {
	
	private String emailId;
	
	public EmailNotification(final String emailId) {
		this.emailId=emailId;
	}
	
	@Override
	public void update() {
		sendEmail(emailId);
	}
	
	public void sendEmail(final String emailId) {
		System.out.println("Email notification send to "+emailId);
	}

}
