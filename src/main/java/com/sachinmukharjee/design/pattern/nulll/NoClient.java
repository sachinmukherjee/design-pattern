package com.sachinmukharjee.design.pattern.nulll;

public class NoClient extends Employee {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available";
	}

}
