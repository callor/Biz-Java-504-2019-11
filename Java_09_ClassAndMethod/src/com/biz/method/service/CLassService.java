package com.biz.method.service;

/*
 * main() method가 없는 클래스는
 * 혼자는 아무런 일도 수행하지 못한다.
 * 다른  클래스에서 이 클래스의 method를 호출하거나
 * 이 클래스의 필드변수에 값을 저장, 읽기만 수행할수 있다.
 */
public class CLassService {

	/*
	 * 문자열을 매개변수로 받아라
	 * 누군가 나에게 일을 시키려면
	 * 반드시 strNation 변수에 값을 담아놓고 호출하라
	 * 
	 * 호출할때
	 * viewNation(문자열값, 문자열변수)
	 */
	public void viewNation( String strNation ) {
		System.out.println(strNation);
	}

}
