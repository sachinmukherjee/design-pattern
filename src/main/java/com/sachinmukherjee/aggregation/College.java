package com.sachinmukherjee.aggregation;

import java.util.List;

/*
 * Has-A relationship with student
 * without student college can exists
 * One way relationship
 */
public class College {

	private String name;
	private List<Student> studentList;

	public College(String name, List<Student> studentList) {
		super();
		this.name = name;
		this.studentList = studentList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
