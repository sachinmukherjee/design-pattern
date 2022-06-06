package com.sachinmukherjee.behavioral.strategy;

public class SortingProgram {
	
	private int[] elements;
	
	public SortingProgram() {
		elements = new int[10];
	}
	
	public int[] runSort(SortingStrategy sortingStrategy) {
		return sortingStrategy.sort(elements);
	}
	
	public static void main(String[] args) {
		
		SortingProgram sortingProgram = new SortingProgram();
		sortingProgram.runSort(new LinearSearch());
		sortingProgram.runSort(new HeapSort());
		
	}
}
