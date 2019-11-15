package com.biz.classes;

public class Class_07 {

	public static void main(String[] args) {

		int num = 7;
		for(int i = 2; i < 10 ; i++) {
			int mux = num * i;
			System.out.printf("%d x %d = %d\n",num,i,mux);
		}
		System.out.println("=======================");
		for(int i = 2; i < 10 ; i++) {
			int mux = num * i;
		}
		// System.out.println(mux);
		/*
		 * mux 변수는 for() {} 내에서 선언된 변수이기 때문에
		 * {} 밖에서는 mux 변수에 접근이 불가능 하다
		 * 또한 변수 i도 for()에서 선언되어 있지만
		 * {} 내에서 선언된 변수와 똑같이 scope가 적용된다.
		 * 따라서 변수 i도 for() {} 끝난 이후
		 * 접근이 불가능하다.
		 */
		
	}
}
