package com.biz.ifelse;

public class If_04 {

	public static void main(String[] args) {

		int num1 = 12345;
		
		boolean bYes = (num1 % 2) == 0;
		
		if(bYes) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		num1 = 7;
		if(num1 % 2 == 0) System.out.println();
		if(num1 % 3 == 0) 
			System.out.println(num1 + "는(은) 소수가 아님" );
		if(num1 % 4 == 0) System.out.println();
		if(num1 % 5 == 0) System.out.println();
		if(num1 % 6 == 0) System.out.println();
		if(num1 % 7 == 0) System.out.println();
		if(num1 % 8 == 0) System.out.println();
		
	}

}
