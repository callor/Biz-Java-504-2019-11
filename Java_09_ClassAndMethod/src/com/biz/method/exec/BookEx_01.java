package com.biz.method.exec;

import com.biz.method.domain.BookDTO;

public class BookEx_01 {

	public static void main(String[] args) {

		// BookDTO 클래스에 선언된
		// 모든 필드변수를 사용할 준비를 하라
		BookDTO bDTO = new BookDTO();
		
		// 초기화가된(사용할 준비가된) 필드변수들에게
		// 데이터를 저장하기
		bDTO.bNum = "B001";
		bDTO.bName = "자바";
		bDTO.bWriter = "박은종";
		bDTO.bComp = "이지퍼";
		bDTO.bPrice = 25000;
		
		// 필드변수에 저장된 데이터를 콘솔에 출력
		System.out.println(bDTO.bNum);
		System.out.println(bDTO.bName);
		System.out.println(bDTO.bComp);
		System.out.println(bDTO.bWriter);
		System.out.println(bDTO.bPrice);
		
	}

}
