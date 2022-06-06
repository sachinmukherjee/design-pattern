package com.sachinmukherjee.behavioral.chain.of.responsibility;

public class Leave {

	private int numberOfDays;
	private int employeeTier;
	private ReasonType reasonType;

	public Leave(int numberOfDays, int employeeTier, ReasonType reasonType) {
		super();
		this.numberOfDays = numberOfDays;
		this.employeeTier = employeeTier;
		this.reasonType = reasonType;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getEmployeeTier() {
		return employeeTier;
	}

	public void setEmployeeTier(int employeeTier) {
		this.employeeTier = employeeTier;
	}

	public ReasonType getReasonType() {
		return reasonType;
	}

	public void setReasonType(ReasonType reasonType) {
		this.reasonType = reasonType;
	}

}
