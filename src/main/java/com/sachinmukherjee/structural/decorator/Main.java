package com.sachinmukherjee.structural.decorator;

public class Main {
	
	public static void main(String[] args) {
		String text = "Hello Decorator Desing Pattern";
		DataSource encoder = new EncryptionDecorator(new FileDataSource());
		encoder.writeData(text);
		encoder.readData();
	}
}
