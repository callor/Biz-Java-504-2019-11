package com.biz.method.service;

public class 홍궁반점 {

	/*
	 * 재료1, 재료2를 매개변수로 공급받아서
	 * 해물비빔밥을 만들고
	 * 주문한곳에 해물비빔밥을 
	 * return(배달, 되돌리기)한다.
	 */
	public String 비빔밥(String 재료1,String 재료2) {
		
		String 해물비빔밥 = "꽃게," ;
		해물비빔밥 += "오징어,";
		해물비빔밥 += "왕새우,";
		해물비빔밥 += 재료1 + 재료2;
		return 해물비빔밥;
	}
	
}
