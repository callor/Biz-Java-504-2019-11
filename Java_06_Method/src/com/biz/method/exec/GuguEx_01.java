package com.biz.method.exec;

import com.biz.method.classes.GugudanClassV1;

public class GuguEx_01 {

	public static void main(String[] args) {
		/*
		 * gugudan 표시하는 코드 실행을 
		 * GugudanClassV1 클래스의
		 * viewGugudan() method에게 대신 시키기
		 */
		GugudanClassV1 gc = new GugudanClassV1();
		
		// 5 x 2 ~ 5 x 9까지 구구단을 표시하는
		// method를 호출하는 코드
		
		// main()에서 실행했던 구구단 표시코드를
		// GugudanClassV1에 있는  viewGuguDan() method에게
		// 대신 시키기
		gc.viewGuguDan();
		System.out.println("=======================");
		
		// viewGugudan() method를 
		//		호출하면서 숫자 9를 주입하기
		// viewGugudan() method에게 
		//		정수9를 파라메터로 전달하기
		
		// viewGuguDan() method내에서
		// int dan = 9 라는 코드가 실행되는 것과 같은 효과
		gc.viewGuguDan(9);
		System.out.println("=========================");
		
		// viwGuguDan() method내에서
		// int dan = 7이라는 코드가 실행되는 것과 같은 효과
		gc.viewGuguDan(7);
		System.out.println("=========================");
		
		/*
		 * 두개의 정수를 공급받아서
		 * 5 x 처음숫자 ~ 5 x 두번째숫자의 곱셈리스트를
		 * 보여주는 method인것 같다.
		 * 
		 * int start = 10
		 * int end = 20
		 * 이라는 코드사 생성되고
		 * 5 x 10 ~ 5 x 20까지의 곱셈리스트를 
		 * 보여주는 코드가 실행되고 있다라고 짐작할수 있다.
		 */
		gc.viewGuguDan(10, 20);
		System.out.println("========================");
		
		/*
		 * 3개의 숫자를 주입해서
		 * 원하는 단의 원하는 범위 구구단을 표시하는
		 * method를 호출하는 코드
		 */
		gc.viewGuguDan(6, 3, 22);
		System.out.println("=======================");
		gc.viewGuguDan(8, 5, 99);
		
		gc.viewGuguDan(12,2,9);
		
	}
}




