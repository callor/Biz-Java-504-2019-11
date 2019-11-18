package com.biz.classes.exec;

import com.biz.classes.ScoreV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		ScoreV1 scoreV1 = new ScoreV1();
		
		scoreV1.st_num = 2;
		scoreV1.st_name = "이몽룡";
		scoreV1.intKor = 88;
		scoreV1.intEng = 77;
		scoreV1.intMath =87;
		
		scoreV1.viewScore();

		ScoreV1 scoreV2 = new ScoreV1();
		scoreV2.st_num = 3;
		scoreV2.st_name = "성춘향";
		scoreV2.intKor = 98;
		scoreV2.intEng = 78;
		scoreV2.intMath =77;
		scoreV2.viewScore();
		
		ScoreV1 scoreV3 = new ScoreV1();
		scoreV3.st_num = 3;
		scoreV3.st_name = "성춘향";
		scoreV3.intKor = 98;
		scoreV3.intEng = 78;
		scoreV3.intMath =77;
		scoreV3.viewScore();
		
	}
}
