package com.biz.method;

import java.util.List;

import com.biz.method.domain.StudentVO;
import com.biz.method.service.StudentServiceV3;

public class StdEx_04 {

	public static void main(String[] args) {

		StudentServiceV3 ss = new StudentServiceV3();
		
		// List<StudentVO> 리턴타입인 method
		List<StudentVO> stdList = ss.makeStdList(10);
		
		System.out.println("=====================");
		System.out.println("학생정보");
		System.out.println("=====================");
		System.out.println("학번\t이름");
		System.out.println("---------------------");
		
		// List.size() method의 리턴값을 확하여
		//		현재 몇개의 요소가 있는지를
		// 알수있다.
		// 요소의 개수를 size 변수에 저장
		int size = stdList.size();
		for(int i = 0 ; i < size ; i++) {

			System.out.print(stdList.get(i).stNum + "\t");
			System.out.println(stdList.get(i).stName);
		
		}
	}

}
