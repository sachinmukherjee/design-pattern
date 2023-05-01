package com.sachinmukharjee.design.pattern.nulll;

public class EmployeeData {

	public static final String[] names = { "Lokesh", "Kushagra", "Vikram" };

	public static Employee getClient(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new Coder(name);
			}
		}
		return new NoClient();

	}
}
