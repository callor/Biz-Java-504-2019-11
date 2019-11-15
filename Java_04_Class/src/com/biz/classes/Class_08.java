package com.biz.classes;

public class Class_08 {

	public static void main(String[] args) {
		
		int num = 30;
		System.out.println(num);

		/*
		 * {} 안에서 선언된 변수는
		 * {} 밖에서는 변수를 참조(접근,읽기, 쓰기)가 불가능
		 * 변수의 scope 라고 하는데
		 * 참조범위, 가시범위
		 */
		{
			int num1 = 40;
			System.out.println(num1);
			System.out.println(num);
		}
		// System.out.println(num1);
		System.out.println(num);
		
		
	}

}
