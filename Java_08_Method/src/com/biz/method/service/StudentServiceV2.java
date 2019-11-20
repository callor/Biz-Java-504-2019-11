package com.biz.method.service;

import com.biz.method.domain.StudentVO;

public class StudentServiceV2 {

	public void viewStudentVO(StudentVO[] stdList) {
		
		System.out.println("=======================");
		System.out.println("학생정보");
		System.out.println("======================");
		System.out.println("학번\t이름\t학과\t학년");
		System.out.println("----------------------");
		
		for(int i = 0 ; i <stdList.length ;i++) {
			System.out.print( stdList[i].stNum + "\t");
			System.out.print( stdList[i].stName + "\t");
			System.out.print( stdList[i].stDept+ "\t");
			System.out.print( stdList[i].stGrade + "\n");
		}
		System.out.println("=========================");
		
	}
	
}
