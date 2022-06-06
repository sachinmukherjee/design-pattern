package com.sachinmukherjee.creational.singleton.early.instantiation;

public class Student {
	
	public static void main(String[] args) {
		Principal p1 = Principal.getInstance();
		Principal p2 = Principal.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
