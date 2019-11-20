package com.biz.method;

import com.biz.method.service.NumberService;

public class NumberEx_01 {

	public static void main(String[] args) {

		NumberService ns = new NumberService();
		
		ns.add(); // 매개변수가없는 add() method 호출
		ns.add(100); // 매개변수가 1개 있는 add() method 호출
		ns.add(100,200);
		
	}

}
