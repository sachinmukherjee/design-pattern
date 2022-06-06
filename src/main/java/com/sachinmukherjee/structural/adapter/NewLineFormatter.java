package com.sachinmukherjee.structural.adapter;

public class NewLineFormatter implements TextFormattable {

	@Override
	public String formatText(String text) {
		final String formattedText = text.replace(".", "\n");
		return formattedText;
	}

}
