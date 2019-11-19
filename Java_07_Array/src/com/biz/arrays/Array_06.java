package com.biz.arrays;

import java.util.Random;

import com.biz.arrays.service.ArrayService;

public class Array_06 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		int count = 100;
		int[] numArray = new int[count];
		
		for(int i = 0 ; i < numArray.length ; i++) {
			numArray[i] = rnd.nextInt(100);
		}
		ArrayService as = new ArrayService();
		as.viewArray(numArray);
		System.out.println("===================");
		as.sumArray(numArray);
		
	}

}
