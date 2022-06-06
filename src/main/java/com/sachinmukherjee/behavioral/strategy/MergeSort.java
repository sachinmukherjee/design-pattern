package com.sachinmukherjee.behavioral.strategy;

import java.util.logging.Logger;

public class MergeSort implements SortingStrategy {
	
	private static final Logger LOG = Logger.getLogger(MergeSort.class.getName());
	
	@Override
	public int[] sort(int[] elements) {
		LOG.info("MergeSort Algorithm");
		return new int[elements.length];
	}

}
