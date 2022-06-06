package com.sachinmukherjee.behavioral.chain.of.responsibility;

public abstract class LeaveHandler {
	
	protected LeaveHandler superVisor;

	public void setSuperVisor(LeaveHandler superVisor) {
		this.superVisor = superVisor;
	}
	
	public abstract boolean applyLeave(Leave leave);
}
