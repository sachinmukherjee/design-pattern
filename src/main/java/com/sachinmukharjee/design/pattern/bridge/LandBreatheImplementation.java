package com.sachinmukharjee.design.pattern.bridge;

public class LandBreatheImplementation implements BreatheImplementor {

	@Override
	public void brethe() {
		System.out.println("Breathing process in land");
	}

}
