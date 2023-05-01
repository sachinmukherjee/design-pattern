package com.sachinmukharjee.design.pattern.adapter;

public class Main {

	public static void main(String[] args) {
			WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
			System.out.println("Weight "+weightMachineAdapter.getWeightInKg());
	}

}
