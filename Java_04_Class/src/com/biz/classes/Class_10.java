package com.biz.classes;

public class Class_10 {

	public static void main(String[] args) {

		int num = 12345;
		
		/*
		 * 2 ~ num까지의 숫자중에 소수가 아닌 것은?
		 */
		for(int i = 2 ; i < num ; i++) {
			for(int p = 2 ; p < i ; p++) {
				if(i % p == 0) {
					System.out.println(i + "는 소수가 아님");
					break;
				}
			}
		}
		
		/*
		 * 2 ~ num까지의 숫자중에 소수인 것은?
		 */
		for(int i = 2 ; i <num ; i++) {

			int p = 0;
			for(p = 2; p < i ; p++) {
				if(i % p == 0) {
					break;
				}
			}
			if(i > p) {
				
			} else {
				System.out.println(i + "는 소수");
			}
		}
		
	}

}
