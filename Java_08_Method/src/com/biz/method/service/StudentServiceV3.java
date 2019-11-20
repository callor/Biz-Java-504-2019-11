package com.biz.method.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.method.domain.StudentVO;

public class StudentServiceV3 {

	
	public List<StudentVO> makeStdList(int count) {
		
		/*
		 * List<>
		 * java에서 배열을 쉽게 사용할수 있도록
		 * 만들어둔 JDK 클래스 키트
		 * 
		 * <> : 제네릭
		 * 
		 * List<StudentVO> stdList
		 * 		StudentVO를 요소로 포함하는 
		 * 		List를 만들겠다 라는 선언
		 * 		그 List 이름을 stdList로 하겠다.
		 * 
		 * stdList = new ArrayList<StudentVO>()
		 * 		선언된 stdList를 사용할수 있도록 생성하라
		 */
		List<StudentVO> stdList ;
		stdList = new ArrayList<StudentVO>();
		
		StudentVO stdVO = new StudentVO();
		stdVO.stNum = 1;
		stdVO.stName = "홍길동";
		stdList.add(stdVO);
		
		stdVO = new StudentVO();
		stdVO.stNum = 2;
		stdVO.stName = "이몽룡";
		stdList.add(stdVO);
		
		return stdList;
		
		/*
		 * 배열만들기
		 * 1. 몇개의 배열을 만들것인가 결정
		 * 2. 몇개의 배열을 만들겠다라고 선언
		 * 		= new int[10]
		 * 		= new StudentVO[10]
		 * 3. 일반변수로 선언한 배열은 그대로 사용
		 * 4. 클래스로 선언한 배열은 다시 요소를 초기화 한다.
		 * 5. 각 요소에 값을 저장, 읽기등을 수행
		 * 6. 배열은 한번 개수가 정해지면 개수를 더 추가하할수 없다.
		 */
		
		/*
		 * 리스트(List<>)만들기
		 * 1. 리스트 선언 : List<클래스> 클래스List
		 * 2. 리스트 생성 : = new ArrayList<클래스>()
		 * 3. 리스트에 추가할 요소 객체 생성
		 * 		VO vo = new VO()
		 * 4. 요소에 값을 저장
		 * 		vo.val1 = ???
		 * 		vo.val2 = ??/
		 * 5. 요소를 리스트에 추가
		 * 		클래스List.add(vo)
		 */
		
		
		
		
		
	}
}
