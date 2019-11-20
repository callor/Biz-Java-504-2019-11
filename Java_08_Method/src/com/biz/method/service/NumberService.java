package com.biz.method.service;

public class NumberService {

	// 매개변수가 없는 method
	public void add() {
		System.out.println("덧셈을 수행하려면 "
				+ "매개변수를 전달해주어야 함");
	}
	
	// 매개변수가 1개 있는 method
	public void add(int num) {
		System.out.println("덧셈을 수행하려면 "
				+ "매개변수를 2개 전달해주어야 함");
	}
	
	// 매개변수가 2개 있는 method
	public void add(int num1, int num2) {
		System.out.printf("%d + %d = %d",
				num1, num2, num1 + num2);
	}
	
}
