package com.sachinmukherjee.behavioral.chain.of.responsibility;

import java.util.logging.Logger;

public class TeamLeader extends LeaveHandler {

	private static final Logger LOG = Logger.getLogger(TeamLeader.class.getName());
	
	@Override
	public boolean applyLeave(Leave leave) {
		//If Number of days is smaller or equal to 7
		if(leave.getNumberOfDays() <= 7) {
			LOG.info("Team Leader is Handling Leave Request");
			return true;
		}else {
			return superVisor.applyLeave(leave);
		}
	}


}
