package com.sachinmukharjee.example.factory;

public class CurrencyFactory {
	
	private CurrencyFactory() {
		throw new UnsupportedOperationException();
	}
	
	public static ICurrency createCurrency(final String countryName) {
		Country country = Country.getByName(countryName);
		
		if(Country.INDIA.equals(country)) {
			return new Rupee();
		}else if(Country.SINGAPORE.equals(country)) {
			return new SGDDollar();
		}else if(Country.US.equals(country)) {
			return new USDollar();
		}else {
			throw new RuntimeException("Currency Not available");
		}
	}
}
