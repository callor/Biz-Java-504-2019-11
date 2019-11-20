package com.biz.method;

import com.biz.method.domain.StudentVO;
import com.biz.method.service.StudentServiceV1;
import com.biz.method.service.StudentServiceV2;

public class StEx_03 {

	public static void main(String[] args) {

		StudentServiceV1 ss = new StudentServiceV1();
		
		// StudentServiceV1의 
		//		makeStudentVO() method를 호출하여
		// 100개의 StudentVO 배열을 얻어오기
		StudentVO[] stdList = ss.makeStudentVO(10);
		StudentVO[] stdList1 = ss.makeStudentVO(200);
		StudentVO[] stdList2 = ss.makeStudentVO(150);
		
		StudentServiceV2 ss2 = new StudentServiceV2();
		ss2.viewStudentVO(stdList);
		
	}
}
