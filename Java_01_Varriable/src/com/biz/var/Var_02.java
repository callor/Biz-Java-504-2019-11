package com.biz.var;

public class Var_02 {

	public static void main(String[] args) {

		int num1 = 0;
		num1 = 20; // 새로운 20을 num1 변수에 저장
		
		// num1에 이미 저장되어 있는 값과
		// 숫자 10을 덧셈하여 다시 num1에 저장
		// num1 변수의 값을 10만큼 증가시켜라
		num1 = num1 + 10;
		num1 += 10;
		
		num1 = num1 + 1; // 1만큼 증가시켜라
		num1 += 1;
		num1++;
		++num1;

		num1 += 2; // num1 = num1 + 2
		num1 *= 2; // num1 = num1 * 2
		num1 -= 2; // num1 = num1 - 1
		num1 /= 2; // num1 = num1 / 2
		num1 %= 2; // num1 = num1 % 2
		
	}
}



