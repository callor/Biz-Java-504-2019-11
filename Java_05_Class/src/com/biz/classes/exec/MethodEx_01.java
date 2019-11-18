package com.biz.classes.exec;

import com.biz.classes.method.MethodStatic_01;
import com.biz.classes.method.Method_01;

public class MethodEx_01 {

	public static void main(String[] args) {

		Method_01 m1 = new Method_01();
		m1.add();
	
		System.out.println("===================");
		MethodStatic_01.add();
	
	}
}
