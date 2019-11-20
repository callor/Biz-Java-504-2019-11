package com.biz.method;

import com.biz.method.domain.StudentVO;

public class StEx_02 {

	public static void main(String[] args) {

		StudentVO[] stList = new StudentVO[100];
		
		stList[0] = new StudentVO();
		stList[1] = new StudentVO();
		stList[2] = new StudentVO();
		stList[3] = new StudentVO();
		stList[4] = new StudentVO();
		stList[5] = new StudentVO();
		stList[99] = new StudentVO();
		
		for(int i = 0 ; i < 100 ; i++) {
			stList[i] = new StudentVO();
		}
		
		// stList 배열의 모든 요소를
		// 사용가능하도록 생성(초기화)하는 코드
		for(int i = 0 ; i < stList.length ; i++) {
			stList[i] = new StudentVO();
		}
	}

}
