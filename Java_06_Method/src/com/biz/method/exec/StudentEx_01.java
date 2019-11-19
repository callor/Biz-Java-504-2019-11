package com.biz.method.exec;

import com.biz.method.domain.StudentDTO;
import com.biz.method.service.StudentService;

public class StudentEx_01 {

	public static void main(String[] args) {

		StudentService ss = new StudentService();
		
		StudentDTO stDTO = new StudentDTO();
		stDTO.num = 2019001;
		stDTO.name = "홍길동";
		stDTO.dept = "컴공과";
		stDTO.grade = 3;
		stDTO.tel = "010-111-1111";
		stDTO.addr = "서울특별시";
		stDTO.pro = "조용필";
		
		ss.viewStudent(stDTO);
		
		StudentDTO stDTO1 = new StudentDTO();
		stDTO1.num = 2019002;
		stDTO1.name = "이몽룡";
		stDTO1.dept = "법학과";
		stDTO1.grade = 4;
		stDTO1.tel = "010-222-2222";
		stDTO1.addr = "전북익산시";
		stDTO1.pro = "조용필";
		ss.viewStudent(stDTO1);
		
	}
}
