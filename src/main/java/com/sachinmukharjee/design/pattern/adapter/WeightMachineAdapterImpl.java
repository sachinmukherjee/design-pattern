package com.sachinmukharjee.design.pattern.adapter;

/*
 * Adapter
 */
public class WeightMachineAdapterImpl implements WeightMachineAdapter {
	
	//Has-a relationship
	private WeightMachine weightMachine;
	
	public WeightMachineAdapterImpl(WeightMachine weightMachine) {
		this.weightMachine=weightMachine;
	}
	
	@Override
	public double getWeightInKg() {
		final double weightInPounds = weightMachine.getWeightInPound();
		//Convert it to kgs
		final double weightInKgs = weightInPounds * 0.45;
		return weightInKgs;
	}

}
