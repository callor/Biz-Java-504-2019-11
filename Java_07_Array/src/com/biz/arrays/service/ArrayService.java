package com.biz.arrays.service;

public class ArrayService {

	public void viewArray(int[] nums) {
		// 배열.length : 
		// 배열의 크기(개수)가 몇개인가 알수 있는 요소
		int size = nums.length;
		for(int i = 0 ; i < size ; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public void sumArray(int[] nums) {
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			sum += nums[i];
		}
		System.out.println("합계 : " + sum);
	}
}
