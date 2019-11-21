package com.biz.method.exec;

import com.biz.method.domain.ScoreDTO;
import com.biz.method.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreDTO sDTO = new ScoreDTO();
		
		// 1번코드
		sDTO.sNum = "001";
		sDTO.sKor = 88;
		sDTO.sEng = 77;
		sDTO.sMath = 67;
		
		ScoreServiceV1 ss = new ScoreServiceV1();
		ss.viewScore(sDTO);
		//---------------------
		
		// 2번코드
		// ss.viewScore("001", 88, 77, 67);
		
		String 학번 = "002";
		int 국어  = 88;
		int 영어 = 77;
		int 수학 = 90;
		// ss.viewScore(학번, 국어, 영어, 수학);
		
		// ss.viewScore(학번, 영어, 수학, 수학);
		
		
		
	}

}
