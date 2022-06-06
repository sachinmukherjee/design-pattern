package com.sachinmukherjee.creational.singleton.lazy.instantiation;

public class AppThreads implements Runnable {

	public void run(){
		printThreadName();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Principal p = Principal.getInstance();
		System.out.println(p);
		printThreadName();
	}
	
	private static void printThreadName() {
		System.out.println("Thread: "+Thread.currentThread().getName());
	}

}
