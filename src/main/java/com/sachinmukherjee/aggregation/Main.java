package com.sachinmukherjee.aggregation;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		College c = new College("NIT", null);
		
		Student s1 = new Student(101,"MS","Dhoni");
		Student s2 = new Student(102,"Virat","Kohli");
		
		c.setStudentList(Arrays.asList(s1,s2));
	}
}
