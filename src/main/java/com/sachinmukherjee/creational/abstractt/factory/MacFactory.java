package com.sachinmukherjee.creational.abstractt.factory;

public class MacFactory implements IFactory {

	@Override
	public IButton createButton() {
		return new MacButton();
	}

	@Override
	public ITextBox createTextBox() {
		return new MacTextBox();
	}

}
