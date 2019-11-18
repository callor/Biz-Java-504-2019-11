package com.biz.classes.method;

/*
 * 각 method에 매개변수를 선언해 두고
 * 호출하는 곳에서 값을 주입한 후
 * method에게 주입한 매개변수에 따라 
 * 명령수행을 하도록 하는 방법
 */
public class Method_03 {
	
	/*
	 * num 변수에 정수값을 공급받아서
	 * 내부의 코드를 실행하겠다 라는 선언
	 * 
	 * 호출하는 곳에서는 객체.add(값) 형식으로
	 * 반드시 정수값을 주입해 주어야 한다.
	 */
	public void add(int num) {
		int sum = 0;
		for(int index = 1 ; index <= num ; index++) {
			sum += index;
		}
		System.out.printf("1 ~ %d까지 덧셈 : %d\n",
							num,sum);
	}
	
	public void add() {
		int num = 100;
		int sum = 0;
		for(int index = 1 ; index <= num ; index++) {
			sum += index;
		}
		System.out.printf("1 ~ %d까지 덧셈 : %d\n",
							num,sum);
	}

	
}
