package com.sachinmukharjee.example.decorator;

public class DecoratorExample {

	public static void main(String[] args) {
		BasePizza pizza = new ExtraCheese(new VegPizza());
		System.out.println("Price "+pizza.cost());

	}

}
