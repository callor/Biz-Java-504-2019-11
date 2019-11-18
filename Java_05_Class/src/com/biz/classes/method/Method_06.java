package com.biz.classes.method;

public class Method_06 {

	public void add() {
		System.out.println("매개변수가 없어서 덧셈수행 불가");
	}
	public void add(int num) {
		System.out.println("매개변수는 2개가 있어야함");
	}
	public void add(int num1, int num2) {
		System.out.printf("%d + %d = %d",
					num1,num2,num1+num2);
	}

}
