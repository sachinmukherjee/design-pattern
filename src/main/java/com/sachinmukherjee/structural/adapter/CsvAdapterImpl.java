package com.sachinmukherjee.structural.adapter;
//Adapter Class
public class CsvAdapterImpl implements TextFormattable {
	
	final CsvFormattable csvFormattable;
	
	public CsvAdapterImpl(final CsvFormattable csvFormattable) {
		this.csvFormattable=csvFormattable;
	}
	
	@Override
	public String formatText(String text) {
		//Calling the Adaptee
		String formattedText=csvFormattable.formatCsvText(text);
		return formattedText;
	}

}
