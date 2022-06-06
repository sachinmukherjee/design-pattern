package com.sachinmukherjee.creational.prototype;

public class MainApp {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Sachin", null, "Mukherjee", 28);
		Student s2 = s1.clone();
		System.out.println("Student 1 "+s1);
		System.out.println("Student 2 "+s2);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Hello");
		
	}
}
