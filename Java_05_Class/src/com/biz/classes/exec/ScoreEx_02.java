package com.biz.classes.exec;

import com.biz.classes.ScoreV1;

public class ScoreEx_02 {

	public static void main(String[] args) {

		/*
		 * 3명 학생의 성적을 처리하기 위해서
		 * ScoreV1 클래스를 사용하여
		 * sV1 ~ sV3까지 변수(객체)를 선언했다.
		 * sV1 ~ sV3까지는
		 * 		각자 성적처리를 수행할 변수를 포함하고
		 * 		각자 포함한 변수를 사용하여
		 * 		총점과 평균을 계산한는 viewScore() method를
		 * 		가지고 있게 된다.
		 */
		ScoreV1 s1 = new ScoreV1();
		ScoreV1 s2 = new ScoreV1();
		ScoreV1 s3 = new ScoreV1();
		
		// 각각 객체에 변수 값을 할당
		s1.st_num = 1;
		s2.st_num = 2;
		s3.st_num = 3;
		
		s1.st_name = "홍길동";
		s2.st_name = "이몽롱";
		s3.st_name = "성춘향";
		
		s1.intKor = 90;
		s2.intKor = 88;
		s3.intKor = 77;
		
		s1.intEng = 90;
		s2.intEng = 88;
		s3.intEng = 66;
		
		s1.intMath = 90;
		s2.intMath = 70;
		s3.intMath = 88;
		
		s1.viewScore();
		s2.viewScore();
		s3.viewScore();
		
	}

}
