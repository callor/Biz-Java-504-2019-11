package com.biz.classes.method;

/*
 * method의 다형성(多形姓), polymorphism
 * 클래스에 선언되는 method는
 * ()에 선언된 변수의 개수, type이 다르면
 * 같은 이름의 method를 중복하여 선언할수 있다.
 * 
 * 호출하는 곳에서 변수의 개수, type을 알맞게 주입하면
 * java는 자동으로 해당 method와 연결을 수행한다.
 */
public class Method_04 {
	/*
	 * 1부터 100까지 덧셈
	 */
	public void add() {
		int num = 100;
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.printf("1 ~ 100까지 덧셈 : %d",sum);
	}
	
	/*
	 * 1부터 공급받은 num 변수 값만큼 덧셈 수행
	 */
	public void add(int num) {
		int sum = 0;
		for(int i = 1 ; i <= num ; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d까지 덧셈 : %d",
						num,sum);
	}

	/*
	 * 2개의 숫자를 num1변수와 num2 변수에 공급받아서
	 * num1부터 num2까지의 덧셈 수행
	 * 
	 */
	public void add(int num1, int num2) {
		int sum = 0;
		for(int i = num1 ; i <= num2 ; i++) {
			sum += i;
		}
		System.out.printf("%d ~ %d까지 덧셈 : %d",
						num1,num2,sum);
	}

	/*
	 * 2개의 문자열을 공급받아서
	 * 문자열을 결합하여 보여주기
	 */
	public void add(String name1, String name2) {
		System.out.println(name1 + name2);
	}

	
}





