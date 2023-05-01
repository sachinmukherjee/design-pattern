package com.sachinmukharjee.design.pattern.bridge;

public abstract class LivingThings {
	
	private BreatheImplementor breatheImplementor;
	
	public LivingThings(BreatheImplementor breatheImplementor) {
		this.breatheImplementor=breatheImplementor;
	}
	
	abstract public void breatheProcess();
}
