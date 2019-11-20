package com.biz.method;

import java.util.ArrayList;
import java.util.List;

import com.biz.method.domain.StudentVO;

public class StEx_05 {

	public static void main(String[] args) {

		List<StudentVO> stdList = new ArrayList<StudentVO>();
		
		StudentVO stdVO = new StudentVO();
		stdVO.stNum = 1;
		stdVO.stName = "홍길동";
		stdList.add(stdVO);
		
		// stdVO = new StudentVO();
		stdVO.stNum = 2;
		stdVO.stName = "이몽룡";
		stdList.add(stdVO);
		
		// stdVO = new StudentVO();
		stdVO.stNum = 3;
		stdVO.stName = "성춘향";
		stdList.add(stdVO);
		
		System.out.println("====================");
		System.out.println("학생정보");
		System.out.println("====================");
		System.out.println("학번\t이름");
		System.out.println("--------------------");
		
		int nSize = stdList.size();
		for(int i = 0 ; i < nSize ; i++) {
			System.out.print(stdList.get(i).stNum + "\t");
			System.out.println(stdList.get(i).stName);
		}
		System.out.println("======================");
	}
}
