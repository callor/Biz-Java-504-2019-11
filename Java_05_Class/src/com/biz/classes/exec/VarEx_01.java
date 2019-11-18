package com.biz.classes.exec;

public class VarEx_01 {

	public static void main(String[] args) {
		
		/*
		 * 1번학생인 홍길동의 3과목의 점수를
		 * 변수에 저장
		 */
		int st_num = 1;
		String st_name = "홍길동";
		
		int st_kor = 88;
		int st_eng = 77;
		int st_math = 98;
		
		/*
		 * 1번학생의 3과목의 총점과 평균을 계산
		 */
		int sum = st_kor + st_eng + st_math;
		int avg = sum / 3;
		
		System.out.println("=======================");
		// printf("%d") : 숫자값, 숫자형변수를 대치하는 기호
		System.out.printf("학번 : %d\n",st_num);
		
		// printf("%s") : 문자열, 문자열형변수를 대치하는 기호
		System.out.printf("이름 : %s\n",st_name);
		System.out.printf("국어 : %d\n",st_kor);
		System.out.printf("영어 : %d\n",st_eng);
		System.out.printf("수학 : %d\n",st_math);
		System.out.println("------------------------");
		System.out.printf("총점 : %d\n",sum);
		System.out.printf("평균 : %d\n",avg);
		System.out.println("=======================");
		
	}
	
	

}


