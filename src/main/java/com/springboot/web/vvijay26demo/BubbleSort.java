package com.springboot.web.vvijay26demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return numbers;
	}

}
