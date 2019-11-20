package com.biz.method.service;

public class MethodService {

	public void add(int num1, int num2) {
		
		int sum = 0;
		for(int i = num1 ; i <= num2 ; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d 까지 덧셈 : %d\n",
				num1,num2,sum);
	}

	/*
	 * 매개변수로 전달받은 
	 * 		num 숫자가 소수인가를 검사하여
	 * 콘솔에 결과를 표시하는 코드
	 */
	public void prime(int num) {
		
		// p1 : 2 ~ (num - 1)
		int p1 = 0;
		for(p1 = 2 ; p1 < num ; p1++) {
			if(num % p1 == 0) {
				break;
				// System.out.println("소수가 아님");
			} else {
				// System.out.println("소수임");
			}
		}
		
		if(p1 < num) {
			System.out.println("소수가 아님");
		} else {
			System.out.println("소수다");
		}
		
	}

	/*
	 * 매개변수로 전달받은
	 * 		num 숫자가 짝수인가를 검사하여
	 * 콘솔에 결과를 표시하는 코드
	 */
	public void even(int num) {
		
		if(num % 2 == 0) {
			System.out.println("짝수임");
		} else {
			System.out.println("짝수가 아님");
		}
	}
}
