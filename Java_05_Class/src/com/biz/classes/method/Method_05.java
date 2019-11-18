package com.biz.classes.method;

public class Method_05 {

	/*
	 * 매개변수, parameter, argument
	 * method의 () 선언된 변수
	 * 
	 * parameter 변수라는 의미로도 사용되고
	 * 호출하는곳에서 주입하는 
	 * 	값을 가리키는 의미로도 사용된다.
	 */
	public void view() {
		System.out.println("나는 매개변수가 없는 method 이다.");
	}
	public void view(int num) {
		System.out.println(num + "를 전달받은 method이다");
	}
	public void view(int num1, int num2) {
		System.out.printf("%d 와 %d를 전달받은 method",
						num1,num2);
	}
	public void view(String s1, String s2) {
		System.out.printf("%s 와 %s를 전달받은 method",
						s1,s2);
	}
}
