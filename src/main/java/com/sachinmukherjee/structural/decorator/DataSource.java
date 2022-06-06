package com.sachinmukherjee.structural.decorator;

public interface DataSource {
	
	void writeData(String data);
	
	String readData();
}
