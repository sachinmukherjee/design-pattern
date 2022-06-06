package com.sachinmukherjee.creational.singleton.early.instantiation;

public class Principal {
	
	private static Principal principal = new Principal();
	
	private Principal() {
		
	}
	
	public static Principal getInstance() {
		return principal;
	}
}
