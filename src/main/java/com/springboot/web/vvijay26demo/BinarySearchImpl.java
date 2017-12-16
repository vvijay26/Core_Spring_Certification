package com.springboot.web.vvijay26demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private sortAlgorithm bubbleSort;

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		int[] sortedNumbers = bubbleSort.sort(numbers);
		System.out.println("The algo is ==> " + bubbleSort);
		// Search
		// Return
		return 3;
	}

}
