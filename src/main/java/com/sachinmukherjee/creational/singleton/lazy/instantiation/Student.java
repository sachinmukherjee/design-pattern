package com.sachinmukherjee.creational.singleton.lazy.instantiation;

public class Student {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new AppThreads());
		Thread t2 = new Thread(new AppThreads());
		t1.start();
		t2.start();
	}
}
