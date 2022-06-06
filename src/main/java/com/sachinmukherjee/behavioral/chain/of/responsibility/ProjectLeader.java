package com.sachinmukherjee.behavioral.chain.of.responsibility;

import java.util.logging.Logger;

public class ProjectLeader extends LeaveHandler {
	
	private static final Logger LOG = Logger.getLogger(TeamLeader.class.getName());
	
	@Override
	public boolean applyLeave(Leave leave) {
		
		if(leave.getNumberOfDays() <= 14) {
			LOG.info("Project Leader is handling leave request");
			return true;
		}else {
			return superVisor.applyLeave(leave);
		}
	}

}
