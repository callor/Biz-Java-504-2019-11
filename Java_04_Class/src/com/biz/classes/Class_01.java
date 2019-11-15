package com.biz.classes;

public class Class_01 {

	/*
	 * 1. 정수형변수 num1과 num2를 선언
	 * 2. 각각을 clear
	 * 3. num1에 40을 저장
	 * 4. num2에 50을 저장
	 * 5. 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지연산을 수행
	 * 7. 결과를 console에 표시
	 */
	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		num1 = 40;
		num2 = 50;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

}
