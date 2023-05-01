package com.sachinmukharjee.design.pattern.factory;

public enum Country {
	INDIA,
	SINGAPORE,
	US;
	
	public static Country getByName(final String name) {
		try {
		return Country.valueOf(name.toUpperCase());
		}catch(IllegalArgumentException e) {
			System.err.println("Country value not found");
			return null;
		}
	}
}
