package com.sachinmukherjee.structural.decorator;

import java.util.Base64;

//Decorator
public class EncryptionDecorator extends DataSourceDecorator {

	public EncryptionDecorator(DataSource source) {
		super(source);
	}

	@Override
	public void writeData(String data) {
		super.writeData(encryptData(data));
	}

	@Override
	public String readData() {
		return decryptData(super.readData());
	}
	
	public String encryptData(String data) {
		System.out.println("Encryption the data");
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
	
	public String decryptData(String data) {
		System.out.println("Decoding the data");
		return new String(Base64.getDecoder().decode(data));
	}

}
