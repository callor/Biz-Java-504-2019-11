package com.biz.loop;

public class For_08 {

	public static void main(String[] args) {

		/*
		 * Prime number(소수)
		 * 1과 자신 이외의 숫자로 나누어지지 않는 수
		 * 1과 자신이외의 숫자 % 연산을 했을때
		 * 		나머지가 0이 아닌 수
		 */
		
		int num1 = 134;
		for(int p1 = 2; p1 < num1 ; p1++) {
			if(num1 % p1 == 0) {
				System.out.println(num1 + "은 소수가 아님");
				System.out.println(p1);
			}
		}
	}
}
