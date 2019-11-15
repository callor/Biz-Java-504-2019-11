package com.biz.classes;

public class Class_05 {

	/*
	 * 1. num 변수에 10의 값을 담고
	 * 2. 1 ~ num(10)까지의 숫자를 console에 표시
	 * 3. for() 사용하기
	 */
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		/*
		 * 변수 i 값이 1부터 시작하여
		 * i <= 10 이라는 조건이 true 일 동안
		 * i++ 명령을 실행하면서
		 * System.out.println() 명령을 수행하라
		 */
		for(int i = 1; i <= 10 ;i++) {
			System.out.println(i);
		}
		
		/*
		 * 변수 i값이 0부터 시작하여
		 * i < 10 이라는 조건이 true 일 동안
		 * i++ 명령을 실행하면서
		 * System.out.println(i)  명령을 수행하라
		 */
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		
		int num = 10;
		/*
		 * 변수 num에 담긴 값만큼 반복
		 * 
		 * 변수 i값이 1부터 i <= num까지 1씩 증가하는 동안
		 * System.out.println(i)을 수행하라
		 * 
		 * 변수 i값이 1부터 시작하여
		 * i <= num 조건이 true 일동안
		 * i++ 명령을 실행하면서
		 * System.out.println(i); 수행하라
		 */
		
		for(int i = 1 ; i <= num ; i++) {
			System.out.println(i);
		}
		
	}

}
