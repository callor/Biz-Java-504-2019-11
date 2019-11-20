package com.biz.method;

import com.biz.method.service.MethodService;

public class MethodEx_01 {

	public static void main(String[] args) {

		MethodService ms = new MethodService();
		
		/*
		 * MethodService클래스의 
		 * 		add() method를 호출하면서
		 * 1과 100의 숫자를 주입하고(전달하고)
		 * 1 ~ 100까지 덧셈을 수행하여
		 * console 보여주도록 작성
		 */
		ms.add(1,100);
		ms.add(200, 500);
		
		/*
		 * MethodService클래스의 
		 * 		prime() method를 호출하면서
		 * 숫자 1개를 전달하고
		 * 그 수가 소수인가를 console에 보여주도록 작성
		 */
		ms.prime(113);
		
		
		/*
		 * MethodService 클래스의 
		 * 		even() method호출하면서
		 * 숫자 1개를 전달하고
		 * 그 숫자가 짝수인가를 검사하여
		 * console에 보여주도록 작성 
		 */
		ms.even(111);
		
		
		
		
		
		
		
		
		
		
	}

}
