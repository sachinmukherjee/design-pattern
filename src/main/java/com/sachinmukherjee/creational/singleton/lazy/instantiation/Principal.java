package com.sachinmukherjee.creational.singleton.lazy.instantiation;

public class Principal {
	
	private static Principal principal;
	
	private Principal() {
		if(null != principal) 
			throw new UnsupportedOperationException("This Operation is not supported");
	}
	
	public static Principal getInstance() {
		if(null == principal) {
			synchronized (Principal.class) {
				if(null==principal) {
					principal=new Principal();
				}
			}
		}
		return principal;
	}
}
