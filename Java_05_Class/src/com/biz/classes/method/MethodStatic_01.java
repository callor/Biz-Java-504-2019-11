package com.biz.classes.method;

public class MethodStatic_01 {
	
	/*
	 * method에 static 키워드가 추가된 경우
	 * 클래스를 객체로 선언, 초기화 하는 과정이 필요 없이
	 * 클래스.method() 형식으로 직접 호출할수 있다.
	 */
	public static void add() {
		int num = 100;
		int sum = 0 ;
		for(int index = 1 ; index <= num ; index++) {
			sum += index;
		}
		System.out.println("1 ~ 100까지 덧셈 결과" + sum);
	}
	
}
