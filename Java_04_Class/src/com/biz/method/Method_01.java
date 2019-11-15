package com.biz.method;

public class Method_01 {
	
	public static void main(String[] args) {
		
		// add() method
		add();
	
	}
	
	/*
	 * 1 ~ 100까지 덧셈을 수행하는
	 * 코드 작성 
	 */
	public static void add() {
		
		int count = 100;
		int sum = 0;
		for(int num = 1 ; num <= count ; num++) {
			sum += num;
		}
		System.out.printf("1 ~ %d 까지 덧셈 : %d",count,sum);
		
	}

}
