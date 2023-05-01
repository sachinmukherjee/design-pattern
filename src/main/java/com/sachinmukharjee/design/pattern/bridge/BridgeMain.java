package com.sachinmukharjee.design.pattern.bridge;

public class BridgeMain {

	public static void main(String[] args) {
		LivingThings fish = new Fish(new LandBreatheImplementation());
		LivingThings tree = new Tree(new WaterBreatheImplementation());
		fish.breatheProcess();
		tree.breatheProcess();
	}

}
