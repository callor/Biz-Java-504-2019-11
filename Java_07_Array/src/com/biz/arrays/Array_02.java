package com.biz.arrays;

public class Array_02 {

	public static void main(String[] args) {

		// nums라는 int형 배열을 선언
		int[] num1s ;
		int num2s[] ;
		
		String str = new String();
		
		// num1s(int 형)변수를 10개 복제하라
		// num1s(int 형)변수를 10개의 
		// 집이 있는 아파트로 지어라
		num1s = new int[10];

		// num1s = 50 과 같은 방식으로 값 저장 불가
		num1s[0] = 30;
		num1s[2] = 40;
		num1s[3] = 50;
		num1s[4] = 20;
		num1s[5] = 40;
		num1s[6] = 33;
		num1s[7] = 55;
		num1s[8] = 12;
		num1s[9] = 32;
		
		// num1s[0] : num1s 배열의 0번 요소를 가리키는 것
		//  int sum = num1s[0] 
		//		num1s 배열의 0번 요소에 저장된 값을 
		//		sum 변수에 복사
		int sum = num1s[0];
		
		// sum = sum + num1s[1]
		//	num1s 배열의 1번 요소에 저장된 값을
		//  sum 변수에 누적하라
		sum += num1s[1];
		sum += num1s[2];
		sum += num1s[3];
		sum += num1s[4];
		sum += num1s[5];
		sum += num1s[6];
		sum += num1s[7];
		sum += num1s[8];
		
	}

}
