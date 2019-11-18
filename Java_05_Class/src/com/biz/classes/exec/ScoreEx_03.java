package com.biz.classes.exec;

/*
 * package가 다른곳에 저장된 클래스를 사용하고자 할때는
 * 해당 클래스를 import 해주어야 한다.
 * 
 * 클래스가 있음에도 불구하고
 * resolve type 오류가 발생을 하면
 * Ctrl + Shift + O를 눌러서 import를 실행하자.
 * 
 * Ctrl + s : 저장하기
 * Ctrl + z : 되돌기 undo, oops
 * Ctrl + Shift + O : import 수행
 * Ctrl + space : 자동완성
 * Ctrl + F : 소스코드 자동 정렬
 * 
 * End : 코드 라인의 우측 끝으로 이동
 * Home : 코드 라인의 좌측 끝으로 이동
 * Shift + 방향키, Home, End : 키보드로 블럭 설정
 * Ctrl + D : 한줄 삭제
 * 
 */
import com.biz.classes.ScoreV2;

public class ScoreEx_03 {

	public static void main(String[] args) {

		/*
		 * ScoreV2 클래스를 사용해서
		 * 학생정보와 과목점수를 저장하고
		 * 총점과 평균을 계산
		 */
		ScoreV2 s1 = new ScoreV2();
		s1.num = 1;
		s1.name = "홍길동";
		s1.kor = 90;
		s1.eng = 100;
		s1.math = 88;
		
		int sum = s1.kor + s1.eng + s1.math;
		
		s1.total = s1.kor + s1.eng + s1.math;
		s1.avg = s1.total / 3;
		
		System.out.println("==================================");
		System.out.printf("%d 번 %s 학생 성적표\n",
								s1.num,s1.name);
		System.out.println("----------------------------------");
		System.out.printf("국어:%3d\n",s1.kor);
		System.out.printf("영어:%3d\n",s1.eng);
		System.out.printf("수학:%3d\n",s1.math);
		System.out.println("----------------------------------");
		System.out.printf("총점:%3d\n",s1.total);
		System.out.printf("평균:%3d\n",s1.avg);
		System.out.println("==================================");
	}
}
