package com.biz.method;

import com.biz.method.domain.StudentVO;

public class StEx_01 {

	public static void main(String[] args) {

		// 정수형 변수 5개를 포함하는 
		//		배열을 선언하고 생성
		// 정수형 배열은 선언을 하면
		// 각 요소가 모두 clear 되어서 사용할 준비가 된다.
		int[] nums = new int[10];
		System.out.println(nums[0]);

		// StudentVO 클래스를
		// student 객체로 선언하고 생성,초기화 수행
		StudentVO student = new StudentVO();
		student.stNum = 1;
		student.stName = "홍길동";
		System.out.println("학생이름 : " + student.stName);
		
		// StudentVO 클래스를 
		//		객체로 5개를 만들어라 라는 선언
		// 클래스는 배열로 선언을 해도
		//		자동으로 사용할 준비가 되지 않는다.
		StudentVO[] stList = new StudentVO[5];
		/*
		 * 클래스를 배열로 생성할 경우는
		 * 배열만 만들어 지고, 
		 * 		각 요소는 사용할 준비가 되지 않는다
		 * 배열을 생성한[] 후에는
		 * 	반드시 각요소들을 객체로 생성(초기화)해 주어야 한다
		 *  
		 */
		stList[0] = new StudentVO(); // stList의 0번요소를 생성
		stList[0].stNum = 2;
		stList[0].stName = "이몽룡";
		
		stList[1] = new StudentVO(); // stList의 1번요소를 생성
		
		
		System.out.println("0번 요소의 학생이름 : " 
					+ stList[0].stName);
		
	
		
	}

}
