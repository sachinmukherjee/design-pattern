package com.sachinmukherjee.behavioral.strategy;

import java.util.logging.Logger;

public class HeapSort implements SortingStrategy {
	
	private static final Logger LOG = Logger.getLogger(HeapSort.class.getName());
	
	@Override
	public int[] sort(int[] elements) {
		LOG.info("HeapSort Algorightm");
		return new int[elements.length];
	}

}
