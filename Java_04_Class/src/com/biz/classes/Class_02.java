package com.biz.classes;

public class Class_02 {

	/*
	 * 1. num1, num2, sum 으로 정수형 변수를 선언
	 * 2. 모든 변수를 clear
	 * 3. num1 = 30, num2 = 40저장
	 * 4. num1과 num2 *	+ - * / % 연산을 수행하여
	 * 		sum변수에 담고
	 * 5. sum 변수 값을 console에 표시
	 * 6. 덧셈일 경우 30 + 40 = 70 형식으로 표시
	 */
	public static void main(String[] args) {

		// 정수형 변수 num1을 선언하고
		// 변수를 clear 하라
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		// 변수 num1에 정수30을 저장하라(대입하라, 할당하라)
		num1 = 30;
		
		// 변수 num2에 정수40을 저장하라, 대입하라, 할당하라
		num2 = 40;
		
		// num1(30)과 num2(40)에 담긴 값을 계산(+-*/%)을 하여
		// sum 변수에 담아라. 저장하라. 대입하라. 할당하라
		// 계산은 5번 수행되지만
		// 1~4번까지 계산이 수행된 결과는 sum 담겨 있다가
		// 모두 지워져 버리고
		// 5번 계산 결과만 남아있다.
		sum = num1 + num2; // 1
		// 30 + 40 = 70
		System.out.println("30+40=70");
		System.out.println(num1 + "+" + num2 + "=" + sum);
		
		sum = num1 - num2; // 2
		//
		System.out.println(num1 + "-" + num2 + "=" + sum);
		
		sum = num1 * num2; // 3
		// 
		System.out.println(num1 + "*" + num2 + "=" + sum);
		
		sum = num1 / num2; // 4
		//
		System.out.println(num1 + "/" + num2 + "=" + sum);
		
		sum = num1 % num2; // 5
		System.out.println(sum); // 30 % 40 연산을 수행한 값
		System.out.println(num1 + "%" + num2 + "=" + sum);
		
		
	}

}
