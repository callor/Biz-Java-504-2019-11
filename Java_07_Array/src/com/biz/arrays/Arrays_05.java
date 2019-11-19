package com.biz.arrays;

import java.util.Random;

public class Arrays_05 {

	public static void main(String[] args) {

		/*
		 * 난수를 만들기 위한 클래스
		 */
		Random rnd = new Random();
		
		int count = 10;
		int[] nums = new int[count]; 
		
		/*
		 * 테스트용 데이터를 만드는 방법
		 * 0 ~ 99까지 임의의 정수를 생성하여
		 * nums 배열의 0번 위치부터 99번 위치까지 
		 * 채워 넣어라
		 */
		for(int i = 0 ; i < count ;i++) {
			// rnd.nextInt(값)
			// 0 ~ 99까지의 임의의 정수를 만들어라
			nums[i] = rnd.nextInt(100);
		}
		
		for(int i = 0 ; i < count ;i++) {
			System.out.println(nums[i]);
		}
		
		int sum = 0;
		for(int i = 0 ; i< count ; i++) {
			sum += nums[i];
		}
		System.out.println("==================");
		System.out.println("합계 : " +  sum);
		
	}

}
