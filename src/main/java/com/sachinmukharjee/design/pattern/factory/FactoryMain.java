package com.sachinmukharjee.design.pattern.factory;

public class FactoryMain {

	public static void main(String[] args) {
		final String countryName = "Africa";
		ICurrency currency = CurrencyFactory.createCurrency(countryName);
		System.out.println(currency.getSymbol());
		

	}

}
