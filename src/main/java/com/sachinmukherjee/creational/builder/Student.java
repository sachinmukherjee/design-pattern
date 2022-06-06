package com.sachinmukherjee.creational.builder;

public class Student {

	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int standard;

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

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age="
				+ age + ", standard=" + standard + "]";
	}

	public static class Builder {

		private String firstName;
		private String middleName;
		private String lastName;
		private int age;
		private int standard;

		public Builder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(final String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder middleName(final String middleName) {
			this.middleName = middleName;
			return this;
		}

		public Builder age(final int age) {
			this.age = age;
			return this;
		}

		public Builder standard(final int standard) {
			this.standard = standard;
			return this;
		}

		public Student build() {
			Student student = new Student();
			student.firstName = this.firstName;
			student.middleName = this.middleName;
			student.lastName = this.lastName;
			student.age = this.age;
			student.standard = this.standard;
			return student;
		}
	}
}
