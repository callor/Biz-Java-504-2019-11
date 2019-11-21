package com.biz.method.service;

import com.biz.method.domain.BookDTO;

public class BookServiceV1 {

	// viewBook(String strNation)
	// viewBook(int intNum)
	/*
	 * 호출할대
	 * viewBook(BookDTO타입의객체)
	 */
	public void viewBook(BookDTO bDTO) {
		System.out.println(bDTO.bNum);
		System.out.println(bDTO.bName);
	}
}
