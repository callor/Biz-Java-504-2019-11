package com.biz.classes;

public class Class_09 {

	public static void main(String[] args) {

		int num =9;
		int p = 0;
		/*
		 * 
		 */
		for(p = 2; p < num ; p++) {
			if(num % p == 0) {
				break;
			}
		}
		System.out.println(p);

		// for() 수행중에 if(num % p == ) 의 
		//		결과가 true가되어
		// break가 실행되고 for() 반복문이 중단된 경우
		if(num > p) {
			System.out.println("소수가 아님");
		} else {
			System.out.println("소수임");
		}
		
	}
}





