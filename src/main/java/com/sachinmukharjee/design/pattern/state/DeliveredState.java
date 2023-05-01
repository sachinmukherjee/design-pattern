package com.sachinmukharjee.design.pattern.state;

public class DeliveredState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new ReceivedState());
	}

	@Override
	public void printStatus() {
		System.out.println("Package Delivered....................");
	}

}
