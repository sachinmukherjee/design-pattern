package com.sachinmukharjee.design.pattern.state;

public interface PackageState {
	
	void next(Package pkg);
	
	void printStatus();
}
