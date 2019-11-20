package com.biz.method;

import com.biz.method.service.홍궁반점;

public class 인재개발원504_01 {

	public static void main(String[] args) {

		홍궁반점 주문 = new 홍궁반점();
		
		String 택배상자 
			= 주문.비빔밥("매운고추장", "중국산참기름");
		
		System.out.println(택배상자);
		
		주문.비빔밥("순창고추장","순 국산참기름");
		/*
		 * return type(이 있는)의 method는
		 * 실행후에 결과를 다시 돌려주므로
		 * 결과를 변수에 받아서 처리를 수행하는 코드가
		 * 필요하다.
		 * 
		 * 하지만,
		 * 결과를 받지 않아도 오류가 나거나 하지는 않는다.
		 */
		
	}
}
