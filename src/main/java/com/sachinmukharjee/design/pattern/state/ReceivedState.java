package com.sachinmukharjee.design.pattern.state;

public class ReceivedState implements PackageState {

	@Override
	public void next(Package pkg) {
		System.out.println("Package is received by client");
	}

	@Override
	public void printStatus() {
		System.out.println("Package is received by client");
	}

}
