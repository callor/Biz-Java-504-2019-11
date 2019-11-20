package com.biz.method.service;

public class ReturnServiceV1 {
	
	// void 리턴 타입(type) method
	// 또는 void method
	// return 명령문이 필요없는 method
	//		있을 수도 있다.
	public void add() {
		// System.out.println("나는 void 리턴 타입 method");
	}
	/*
	 * void 키워드를 int 키워드로 바꾸었더니
	 * method에 오류가 발생을 한다.
	 * 
	 * This method must return a result of type int
	 * 메서드 코드 끝부분에(어딘가에) 
	 * 		return 키워드가 있어야 한다.
	 * 그런데 return 키워드와 함께 
	 * 		int형 값(변수)를 포함해야 한다
	 */
	// int 리턴타입(return type) method라고 한다.
	// 반드시 코드에 
	//		return 정수값 형식의 명령문이 있어야한다
	public int add(int num) {
		return 0;
	}
	
	// 문자열 리턴타입(String return type) method라고 한다.
	// 반드시 코드에
	//		return 문자열 형식의 명령문이 있어야 한다.
	public String add(String num) {
		return "";
	}
	
	// 실수형 리턴타입 method라고 한다
	// 반드시 코드에
	//		return 실수 형식의 명령문이 있어야 한다.
	public double add(double num) {
		return 0.0;
	}
	
	// 반드시 코드에
	//		return true 또는 return false 형식의 명령문이
	//		있어야 한다.
	public boolean add(boolean bYes) {
		return true;
	}

	
	// Duplicate method add() 
	// in type ReturnServiceV1
	
	// 이미 add() method가 선언되어 있는데
	// 같은이름의 method를 또 선언하니 발생하는 오류
	
	// public int add() {
	// 	
	// }

}
