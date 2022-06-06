package com.sachinmukherjee.behavioral.strategy;

import java.util.logging.Logger;

public class LinearSearch implements SortingStrategy {
	
	private static final Logger LOG = Logger.getLogger(LinearSearch.class.getName());
	
	@Override
	public int[] sort(int[] elements) {
		LOG.info("LinearSearch Algorightm");
		return new int[elements.length];
	}

}
