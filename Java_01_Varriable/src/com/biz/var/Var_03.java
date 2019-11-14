package com.biz.var;

public class Var_03 {

	public static void main(String[] args) {

		int num1 = 0;
		
		num1 = 30;
		num1 = 30 + 40;
		num1 = 30 + 40 + 50;
		num1 = 30 + 40 + 50 + 60;
		
		int num2 = num1 + 100;
		
		// boolean 형 변수 선언
		// boolean 형 변수는 true(참), false(거짓)이라는
		//	2가지 중의 1가지 값만을 저장할수 있다.
		boolean bYes = true;
		bYes = false;
		
		// 논리연산
		bYes = 1 == 1; // 1이 1과 같냐? 
					// 그 결과를 bYes에 저장 : true
		bYes = 3 == 4; // 3이 4와 같냐? : false
		// bYes = 3; 오류
		
		System.out.println(bYes);
		
		
		
		
		
		
		
		
	}

}
