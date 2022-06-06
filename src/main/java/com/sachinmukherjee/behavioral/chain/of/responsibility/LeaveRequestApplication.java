package com.sachinmukherjee.behavioral.chain.of.responsibility;

public class LeaveRequestApplication {

	public static void main(String[] args) {
		
		TeamLeader teamLeader = new TeamLeader();
		ProjectLeader projectLeader = new ProjectLeader();
		HR hr =  new HR();
		Manager manager = new Manager();
		
		teamLeader.setSuperVisor(projectLeader);
		projectLeader.setSuperVisor(hr);
		hr.setSuperVisor(manager);
		
		Leave leave1 = new Leave(3, 1, ReasonType.REGULAR);
		teamLeader.applyLeave(leave1);
		
		Leave leave2 = new Leave(9,2,ReasonType.SPECIAL);
		teamLeader.applyLeave(leave2);
	}

}
