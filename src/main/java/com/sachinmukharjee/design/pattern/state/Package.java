package com.sachinmukharjee.design.pattern.state;

public class Package {

	private PackageState state;

	public Package() {
		state = new OrderedState();
	}

	public void next() {
		state.next(this);
	}

	public void printStatus() {
		state.printStatus();
	}

	/**
	 * @return the state
	 */
	public PackageState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(PackageState state) {
		this.state = state;
	}

}
