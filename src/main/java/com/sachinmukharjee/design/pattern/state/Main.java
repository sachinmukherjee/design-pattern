package com.sachinmukharjee.design.pattern.state;

public class Main {

	public static void main(String[] args) {
		Package pkg = new Package();
		pkg.printStatus();
		pkg.next();
		pkg.printStatus();
		pkg.next();
		pkg.printStatus();
	}

}
