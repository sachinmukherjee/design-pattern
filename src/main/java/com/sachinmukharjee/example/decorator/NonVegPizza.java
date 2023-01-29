package com.sachinmukharjee.example.decorator;

public class NonVegPizza extends BasePizza {
	
	private final int price = 20;
	
	@Override
	public int cost() {
		return price;
	}

}
