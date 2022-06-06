package com.sachinmukherjee.structural.decorator;

public class FileDataSource implements DataSource {

	@Override
	public void writeData(String data) {
		System.out.println("Writing Data to a file");
	}

	@Override
	public String readData() {
		return "reading data from a file";
	}

}
