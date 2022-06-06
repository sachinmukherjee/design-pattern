package com.sachinmukherjee.creational.abstractt.factory;

public class GUIAbstractFactory {
	
	
	
	public static final IFactory createFactory(final String osType) {
		if(osType.equalsIgnoreCase("windows")) {
			return new WindowsFactory();
		}else if(osType.equalsIgnoreCase("mac")) {
			return new MacFactory();
		}else {
			throw new UnsupportedOperationException("OS type is not supported");
		}
			
	}
}
