package com.sachinmukharjee.design.pattern.nulll;

public class Coder extends Employee {

	public Coder(final String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
