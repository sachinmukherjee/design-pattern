package com.sachinmukharjee.design.pattern.bridge;

public class Tree extends LivingThings {
	
	private BreatheImplementor breatheImplementor;
	
	public Tree(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
		this.breatheImplementor=breatheImplementor;
	}

	@Override
	public void breatheProcess() {
		breatheImplementor.brethe();
	}

}
