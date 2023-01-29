package com.sachinmukharjee.example.decorator;

public class ExtraCheese extends ToppingDecorator {
	
	private BasePizza pizza;
	
	private final int price = 30;
	
	
	public ExtraCheese(final BasePizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public int cost() {
		return this.pizza.cost() + price;
	}

}
