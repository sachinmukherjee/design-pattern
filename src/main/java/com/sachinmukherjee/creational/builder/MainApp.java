package com.sachinmukherjee.creational.builder;

public class MainApp {
	
	public static void main(String[] args) {
		Student student = new Student.Builder().firstName("Sachin").lastName("Mukherjee").age(28).build();
		System.out.println("Student "+student);
	}
}
