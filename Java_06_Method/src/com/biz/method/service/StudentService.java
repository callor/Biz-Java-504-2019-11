package com.biz.method.service;

import com.biz.method.domain.StudentDTO;

public class StudentService {

	/*
	 * StudentDTO에 담긴 학생정보를
	 * 매개변수로 공급받아서
	 * console에 표시하는 method
	 */
	public void viewStudent(StudentDTO stDTO) {
		/*
		 * public int num;
		 * public String name;
		 * public String dept;
		 * public int grade;
		 * public String tel;
		 * public String addr;
		 * public String pro;
		 */
		// 001	홍길동	컴공과	3	010-111-1111	서울특별시	조용필
		System.out.printf("%d\t%s\t%s\t%d\t%s\t%s\t%s\n",
				stDTO.num,stDTO.name,stDTO.dept,
				stDTO.grade,stDTO.tel,stDTO.addr,
				stDTO.pro);
		
	}
	
}
