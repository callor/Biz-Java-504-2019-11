package com.biz.classes.method;

public class Method_01 {

	/*
	 * 1~100까지 덧셈을 수행할 method
	 * 
	 * static 키워드가 없는 method는 method를 호출(사용)하기 전에
	 * 반드시 객체를 선언,초기화 한 후에 호출할수 있다.
	 * 
	 * Method_01 m1 = new Method_01()
	 * m1.add() 
	 * 방식으로 호출해야 한다.
	 */
	public void add() {
		int num = 100;
		int sum = 0 ;
		for(int index = 1 ; index <= num ; index++) {
			sum += index;
		}
		System.out.println("1 ~ 100까지 덧셈 결과" + sum);
	}
}





