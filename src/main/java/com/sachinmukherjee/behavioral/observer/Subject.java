package com.sachinmukherjee.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer>  observer = new ArrayList<>();
	private int state;
	
	public void add(Observer o) {
		observer.add(o);
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int value) {
		this.state=value;
		execute();
	}
	
	private void execute() {
		for(Observer o: observer) {
			o.update();
		}
	}
}
