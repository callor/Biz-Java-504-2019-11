package com.biz.arrays;

public class Array_03 {

	public static void main(String[] args) {

		// int 형 nums 배열을 10개 생성하라
		
		// int 형 변수가 10개 담겨있는 배열 1개 생성하라
		// 	그리고 이름을 nums로 하겠다
		
		// 변수 10개를 한번에 선언하고 초기화(clear)
		int[] nums = new int[10];
		System.out.println(nums[0]);

		/*
		 *  배열을 사용하면
		 *  요소를 가리키는 값으로 변수를 사용할수 있다.
		 *  배열의 첨자 : 요소를 가리키는 값 
		 */
		int index = 0;
		nums[index++] = 40; // nums[0] = 40
		nums[index++] = 50;
		nums[index++] = 20;
		nums[index++] = 30;
		nums[index++] = 70;
		nums[index++] = 60;
		nums[index++] = 30;
		nums[index++] = 20;
		nums[index++] = 90;
		nums[index++] = 10;
		
		index = 0;
		int sum = nums[0];
		sum += nums[++index]; // += nums[1]
		sum += nums[++index]; // += nums[2]
		sum += nums[++index];
		sum += nums[++index];
		sum += nums[++index];
		sum += nums[++index];
		sum += nums[++index]; // += nums[7]
		sum += nums[++index]; // += nums[8]
		sum += nums[++index]; // += nums[9]
		//sum += nums[++index]; // += nums[10]

		System.out.println(sum);
		
		
		
	}

}
