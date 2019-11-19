package com.biz.method.exec;

import com.biz.method.domain.BookVO;
import com.biz.method.service.BookServiceV2;

public class BookEx_02 {

	public static void main(String[] args) {

		BookServiceV2 bs = new BookServiceV2();
		
		/*
		 * 3권의 도서정보를 보관할 객체를
		 * Book 클래스를 사용하여
		 * 	book1, book2, book3로 선언 및 생성
		 */
		BookVO book1 = new BookVO();		
		BookVO book2 = new BookVO();
		BookVO book3 = new BookVO();
		
		/*
		 * 3권 도서정보를 book1 ~ book3 객체
		 * 각각 세팅
		 */
		book1.num = 1;
		book2.num = 2;
		book3.num = 3;
		
		book1.title = "자바입문";
		book2.title = "데이터베이스";
		book3.title = "HTML";
		
		book1.comp = "이지퍼블리싱";
		book2.comp = "생능출판사";
		book3.comp = "영진출판사";
		
		book1.auther = "박은종";
		book2.auther = "송영철";
		book3.auther = "박진철";
		
		book1.price = 30000;
		book2.price = 15000;
		book3.price = 35000;
		
		/*
		 * 3권 도서의 정보를 
		 * BookService 클래스의 viewBook() method에
		 * 주입하여
		 * console 표시
		 */
		bs.viewBook(book1);
		bs.viewBook(book2);
		bs.viewBook(book3);
		
	}
}
