package com.sachinmukharjee.design.pattern.bridge;

public class Fish extends LivingThings {

	private BreatheImplementor breatheImplementor;
	
	public Fish(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
		this.breatheImplementor=breatheImplementor;
	}

	@Override
	public void breatheProcess() {
		breatheImplementor.brethe();
	}

}
