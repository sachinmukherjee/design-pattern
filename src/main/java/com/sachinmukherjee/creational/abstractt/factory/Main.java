package com.sachinmukherjee.creational.abstractt.factory;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your OS Type");
		final String osType = scan.nextLine();
		
		IFactory fact = GUIAbstractFactory.createFactory(osType);
		IButton button = fact.createButton();
		button.press();
		
		ITextBox textBox = fact.createTextBox();
		textBox.showText();
		
		scan.close();
	}
}
