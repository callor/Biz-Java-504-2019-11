package com.biz.ifelse;

public class If_01 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		
		boolean bYes = true;
		
		bYes = num1 == num2; // true
		
		num1 = 30;
		num2 = 40;
		bYes = num1 == num2; // false
		
		// num1에 저장된 값이 num2에 저장된 값보다 크냐?
		bYes = num1 > num2; // false
		// num1에 저장된 값이 num2에 저장된 값보다 작냐?
		bYes = num1 < num2; // true
		
		// num1에 저장된 값이 num2에 저장된 
		//	값보다 크거나 같냐?
		bYes = num1 >= num2; // false
		
		num1 = 40;
		bYes = num1 >= num2;
		System.out.println(bYes);
		/*
		 * num2에 저장된 값이 40이거나 40보다 작다
		 */
		if( num1 >= num2 ) 
			System.out.println("num1 >= num2이다");
		
		if(num1 <= num2 ) 
			System.out.println("num2 >= num1 이다");
		
		if(num1 == num2)
			System.out.println("num1 == num2 이다");
		
		if(num1 > num2)
			System.out.println("num1 > num2");

		if(num1 < num2)
			System.out.println("num1 < num2");

		
	}

}
