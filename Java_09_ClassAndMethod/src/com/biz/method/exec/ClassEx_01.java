package com.biz.method.exec;

import com.biz.method.service.CLassService;

public class ClassEx_01 {

	/*
	 * main() method
	 * 1. 이름, 문법규칙이 정해져 있다.
	 * 2. 소스코드 >> 컴파일 >> 클래스파일 >> 실행
	 * 	ClassEx_01.java 
	 * 	>> javac ClassEx_01.java
	 *  >> ClassEx_01.class
	 *  >> java ClassEx_01 : 실행한다.
	 *  java 실행명령이 ClassEx_01의 
	 *  		main() method를 
	 *  		호출하도록 규칙이 정해져있다.
	 */
	public static void main(String[] args) {

		/*
		 * ClassService 클래스의 viewNation() 메서드호출
		 * ClassService 클래스에 정의된(선언된)
		 * viewNation() method에게 무언가 일을 수행하도록
		 * 지시한다.
		 * 
		 * viewNation() method는 정의할때
		 * strNation 변수를 매개변수로 선언하고 있다.
		 * 그래서
		 * viewNation() method를 호출하려면
		 * 반드시 strNation 변수에 어떤 값을 
		 * 먼저 담아두어야 한다.
		 * viewNation() method의 매개변수는
		 * String 형이다.
		 * 
		 * 호출할때 문법
		 * viewNation(문자열) 형식이 되는 규칙이 만들어졌다.
		 * 
		 * viewNation() method를 호출하기 위해
		 * viewNation()을 가지고있는 클래스를
		 * 객체로 선언을 먼저 해야 한다.
		 */
		CLassService cs = new CLassService();
		
		/*
		 * cs객체를 사용하여 viewNation() method호출
		 * 호출할 method에 ()안에 문자열을 추가하는 것
		 * => viewNation() method의 매개변수에
		 * 		값을 저장하는 것
		 */
		cs.viewNation("대한민국");
		
		
		
	}

}
