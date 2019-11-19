package com.biz.method.exec;

import com.biz.method.domain.BookVO;
import com.biz.method.service.BookServiceV2;

public class BookEx_22 {

	public static void main(String[] args) {

		BookServiceV2 bs = new BookServiceV2();
		
		BookVO book1 = new BookVO();
		book1.num = 1;
		book1.title = "자바입문";
		book1.comp = "이지";
		book1.auther = "박은종";
		book1.price = 3000;
		
		BookVO book2 = new BookVO();
		book2.num = 2;
		book2.title = "데이터베이스";
		book2.comp = "생능";
		book2.price = 15000;
		book2.auther ="송은철";
		
		BookVO book3 = new BookVO();
		book2.num = 3;
		book3.title = "HTML";
		book3.comp = "영진";
		book3.price = 30000;
		book3.auther = "박진철";
		
		bs.viewBook(book1);
		bs.viewBook(book2);
		bs.viewBook(book3);
		
	}

}
