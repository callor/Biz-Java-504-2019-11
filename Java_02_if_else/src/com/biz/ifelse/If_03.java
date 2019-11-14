package com.biz.ifelse;

public class If_03 {

	public static void main(String[] args) {

		int num1 = 12345;

		boolean bYes = (num1 % 2) == 0;

		if (bYes == false)
			System.out.println("홀수");
		else
			System.out.println("짝수입니다");
		System.out.println("짝수야");

		System.out.println("======================");
		if (bYes == false) {
			System.out.println("홀수");
			System.out.println("홀수입니다");
			System.out.println("홀수야");
		} else {
			System.out.println("짝수");
			System.out.println("짝수입니다");
			System.out.println("짝수야");
		}

	}

}
