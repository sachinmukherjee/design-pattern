package com.sachinmukherjee.behavioral.chain.of.responsibility;

import java.util.logging.Logger;

public class Manager extends LeaveHandler {

	private static final Logger LOG = Logger.getLogger(TeamLeader.class.getName());
	
	@Override
	public boolean applyLeave(Leave leave) {
		if(leave.getNumberOfDays() > 21) {
			LOG.info("Manager is handling leave request");
			return true;
		}else {
			return false;
		}
	}

}
