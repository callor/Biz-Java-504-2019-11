package com.biz.method.service;

import com.biz.method.domain.StudentVO;

public class StudentServiceV1 {

	/*
	 * count변수에 정수값을 공급받아서
	 * 공급받은 정수 개수만큼 StudentVO를 만들고
	 * 즉 공급받은 개수의 배열을 선언하고
	 * 배열의 각 요소를 사용할수 있도록 선언, 초기화하여
	 * 다시 호출한 곳으로 return을 수행한다.
	 */
	public StudentVO[] makeStudentVO(int count) {
		
		StudentVO[] stList = new StudentVO[count];
		for(int i = 0 ; i < stList.length ;i++) {
			stList[i] = new StudentVO();
		}
		return stList;
	}
	
	
}
