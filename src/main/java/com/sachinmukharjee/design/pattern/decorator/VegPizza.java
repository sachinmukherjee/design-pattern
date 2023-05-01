package com.sachinmukharjee.design.pattern.decorator;

public class VegPizza extends BasePizza {
	
	private final int price = 15;
	
	@Override
	public int cost() {
		return price;
	}

}
