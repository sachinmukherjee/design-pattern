package com.sachinmukherjee.behavioral.observer;

public class HexObserver extends Observer {

	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" " + Integer.toHexString(subject.getState()));

	}

}
