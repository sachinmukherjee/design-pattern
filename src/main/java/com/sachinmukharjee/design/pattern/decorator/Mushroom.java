package com.sachinmukharjee.design.pattern.decorator;

public class Mushroom extends ToppingDecorator {
	
	private BasePizza pizza;
	
	private final int price = 45;
	
	public Mushroom(final BasePizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public int cost() {
		return this.pizza.cost() + price;
	}

}
