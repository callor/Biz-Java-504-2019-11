package com.biz.classes;

public class Class_06 {

	public static void main(String[] args) {

		int num = 2;
		int mux = 0;
		// i : 2 ~ 9까지 변하는 동안 반복
		for(int i = 2; i < 10 ; i++) {
			mux = num * i;
		}
		System.out.println(mux);
		System.out.println("======================");
		
		for(int i = 2; i < 10 ; i++) {
			mux = num * i;
			System.out.println(mux);
		}
		System.out.println("======================");
		for(int i = 2; i < 10 ; i++) {
			mux = num * i;
			System.out.printf("%d x %d = %d\n",num,i,mux);
		}
		
		
	}

}
