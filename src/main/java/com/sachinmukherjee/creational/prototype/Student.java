package com.sachinmukherjee.creational.prototype;

public class Student implements Cloneable {

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;

	public Student() {
		System.out.println("Student Description");
		System.out.println("-------------------");
	}

	public Student(String firstName, String middleName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		showStudent();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age="
				+ age + "]";
	}
	
	private void showStudent() {
		System.out.println("First Name :"+firstName+" Middle Name :"+middleName+" Last Name: "+lastName);
	}

	public Student clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
}
