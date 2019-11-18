package com.biz.classes.exec;

import com.biz.classes.method.MethodStatic_02;
import com.biz.classes.method.Method_02;

public class MethodEx_02 {

	public static void main(String[] args) {

		Method_02 m2 = new Method_02();
		m2.num = 20;
		m2.add();
		
		m2.num = 100;
		m2.add();
		
		Method_02 m3 = new Method_02();
		m3.num = 1000;
		
		System.out.println("=====================");
		m2.add();
		m3.add();
		
		/*
		 * static으로 선언된 필드변수, method는
		 * 프로젝트에서 1개밖에 존재하지 않아서
		 * 객체를 선언, 생성하는 복제 코드를 만들 수 없다.
		 */
		System.out.println("======================");
		MethodStatic_02.num = 100;
		MethodStatic_02.add();
		MethodStatic_02.num = 1000;
		MethodStatic_02.add();
		MethodStatic_02.num = 100;
		MethodStatic_02.add();
		MethodStatic_02.num = 1000;
		MethodStatic_02.add();

		
		
	}
}
