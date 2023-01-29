package com.sachinmukharjee.example.decorator;

public class VegPizza extends BasePizza {
	
	private final int prise = 15;
	
	@Override
	public int cost() {
		return prise;
	}

}
