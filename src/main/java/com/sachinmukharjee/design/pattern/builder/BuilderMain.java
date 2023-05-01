package com.sachinmukharjee.design.pattern.builder;

public class BuilderMain {

	public static void main(String[] args) {
		Cake cake = new Cake.Builder().addSugar(5).addEggs(10).addButter(5).addMilk(3).addVanila(3).build();
		System.out.println("Prepared Cake "+cake);

	}

}
