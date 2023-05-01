package com.sachinmukharjee.design.pattern.state;

public class OrderedState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	@Override
	public void printStatus() {
		System.out.println("Package Ordered................");
	}

}
