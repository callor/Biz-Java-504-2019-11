package com.biz.classes.exec;

import com.biz.classes.ScoreV3;

public class ScoreEx_04 {

	public static void main(String[] args) {

		ScoreV3 s1 = new ScoreV3();
		s1.num = 1;
		s1.name = "이몽룡";
		s1.kor = 90;
		s1.eng = 99;
		s1.math = 77;
		
		/*
		 * s1 객체박스에 담겨진 각 변수를 가지고
		 * 총점과 평균을 계산한 후 성적표를 보여달라
		 */
		s1.viewScore();
		
		ScoreV3 s2 = new ScoreV3();
		s2.viewScore();
		
	}

}
