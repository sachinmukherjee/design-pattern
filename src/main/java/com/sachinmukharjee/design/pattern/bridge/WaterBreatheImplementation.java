package com.sachinmukharjee.design.pattern.bridge;

public class WaterBreatheImplementation implements BreatheImplementor {

	@Override
	public void brethe() {
		System.out.println("Breathing process in water");
	}

}
