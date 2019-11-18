package com.biz.classes.method;

public class MethodStatic_02 {
	
	public static int num;
	public static void add() {
		
		int sum = 0;
		for(int index = 1 ; index <= num ; index++) {
			sum += index;
		}
		System.out.printf("1 ~ %d까지 덧셈 : %d\n",
							num,sum);
				
	}
}
