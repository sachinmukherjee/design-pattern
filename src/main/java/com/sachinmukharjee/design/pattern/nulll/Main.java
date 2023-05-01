package com.sachinmukharjee.design.pattern.nulll;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = EmployeeData.getClient("Lokesh");
		Employee emp2 = EmployeeData.getClient("Kushagra");
		Employee emp3 = EmployeeData.getClient("Vikram");
		Employee emp4 = EmployeeData.getClient("Rishabh");

		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		System.out.println(emp3.getName());
		System.out.println(emp4.getName());
	}
}
