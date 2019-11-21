package com.biz.method.service;

import com.biz.method.domain.ScoreDTO;

public class ScoreServiceV1 {
	
	// viewScore("001",88,87,88)
	public void viewScore(String 학번, 
			int 국어, int 영어, int 수학) {
		int sum = 국어 + 영어 + 수학;
		int avg = sum / 3;
		
		System.out.printf("국어:%d\n",국어);
		System.out.printf("영어:%d\n",영어);
		System.out.printf("수학:%d\n",수학);
		System.out.printf("총점:%d\n",sum);
		System.out.printf("평균:%d\n",avg);
	}
	
	
	/*
	 * 
	 * 호출할때
	 * viewScore(ScoreDTO타입의 객체 또는 변수)
	 */
	public void viewScore(ScoreDTO sDTO) {
		
		// 80, 77, 67
		int sum = sDTO.sKor + sDTO.sEng + sDTO.sMath;
		double avg = sum / 3;
		System.out.println("평균 :" + avg);
		
		System.out.printf("국어:%d\n",sDTO.sKor);
		System.out.printf("영어:%d\n",sDTO.sEng);
		System.out.printf("수학:%d\n",sDTO.sMath);
		System.out.printf("총점:%d\n",sum);
		// System.out.printf("평균:%f\n",avg);
		
	}
}
