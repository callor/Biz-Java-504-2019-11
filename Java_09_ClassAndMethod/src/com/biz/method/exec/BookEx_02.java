package com.biz.method.exec;

import com.biz.method.domain.BookDTO;
import com.biz.method.service.BookServiceV1;

public class BookEx_02 {

	public static void main(String[] args) {

		BookDTO bDTO = new BookDTO();
		bDTO.bNum = "bb1";
		bDTO.bName = "자바";
		
		BookServiceV1 bs = new BookServiceV1();
		bs.viewBook(bDTO);
		
		
	}

}
