package com.biz.method;

import java.util.ArrayList;
import java.util.List;

import com.biz.method.domain.StudentVO;

public class ListEx_02 {

	public static void main(String[] args) {

		List<StudentVO> stdList;
		stdList = new ArrayList<StudentVO>();
		
		StudentVO sVO = new StudentVO();
		sVO.stNum = 1;
		sVO.stName = "홍길동";
		stdList.add(sVO);
		
		// 위 홍길동 정보가 저장된 sVO는 
		// 이미 List에 추가가 되어 있으므로
		// 성춘향 정보를 저장할 StudentVO를 새로 생성하고
		// 그 주소를 sVO에 담아서
		// 각 필드변수를 세팅한 후 sVO에 담긴 주소를
		// List에 추가해야 한다.
		sVO = new StudentVO();
		sVO.stNum = 2;
		sVO.stName = "성춘향";
		stdList.add(sVO);

		sVO = new StudentVO();
		sVO.stNum = 3;
		sVO.stName = "이몽룡";
		stdList.add(sVO);

		System.out.printf("stdList의 개수 : %d\n",
				stdList.size());
		
		int nSize = stdList.size();
		for(int i = 0 ; i < nSize ;i++ ) {
			System.out.print( stdList.get(i).stNum + "\t" );
			System.out.println(stdList.get(i).stName);
		}
		
	}

}
