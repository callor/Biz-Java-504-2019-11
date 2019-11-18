package com.biz.classes;

/*
 * 클래스
 * 다양한 데이터를 보관하는 
 * 		데이터 묶음을 미리 선언하는 것
 * 데이터 묶음에 대한 처리방법(method)을 선언하는 것
 */
public class ScoreV1 {
	
	/*
	 * class 선언문 아래에 선언한 변수들
	 * 필드변수, 맴버변수라고 한다. 
	 */
	public int st_num;
	public String st_name;
	
	public int intKor;
	public int intEng;
	public int intMath;
	
	/*
	 * main()이 아닌 method
	 * 임의의 이름을 붙여서 선언한 method
	 * (맴버) 메서드
	 * 
	 * 필드변수를 대상으로 총점과 평균을 계산항 후
	 * console에 보여주는 기능을 하는 method
	 */
	public void viewScore() {
	
		int sum = intKor + intEng + intMath;
		int avg = sum / 3;
		
		System.out.println("========================");
		System.out.printf("학번:%d\n",st_num);
		System.out.printf("이름:%s\n",st_name);
		System.out.printf("국어:%d\n",intKor);
		System.out.printf("영어:%d\n",intEng);
		System.out.printf("수학:%d\n",intMath);
		System.out.println("-------------------------");
		System.out.printf("총점:%d\n",sum);
		System.out.printf("평균:%d\n",avg);
		System.out.println("=========================");
		
	}

}
