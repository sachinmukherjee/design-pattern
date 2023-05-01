package com.sachinmukharjee.design.pattern.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	
	private String name;
	private List<Object> objectList;
	
	public Directory(String name) {
		this.name=name;
		this.objectList=new ArrayList<>();
	}
	
	public void add(Object obj) {
		objectList.add(obj);
	}
	
	/*
	 * Problem
	 * We have to use if else statement and cast the obj
	 */
	public void ls() {
		System.out.println("Directory name "+name);
		for(Object obj : objectList) {
			
			if(obj instanceof File) {
				((File) obj).ls();
			}else if(obj instanceof Directory) {
				((Directory) obj).ls();
			}
		}
	}
	
}
