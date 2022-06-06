package com.sachinmukherjee.creational.abstractt.factory;

public class WindowsButton implements IButton {

	@Override
	public void press() {
		System.out.println("Windows button is pressed");
	}

}
