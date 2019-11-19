package com.biz.method.exec;

import com.biz.method.domain.BookVO;
import com.biz.method.service.BookServiceV1;

public class BookEx_01 {

	public static void main(String[] args) {

		/*
		 * BookService 클래스를 bs 객체로 선언하고
		 * bs 객체를 생성, 초기화 하여 인스턴스로 만들어라
		 */
		BookServiceV1 bs = new BookServiceV1();
		bs.viewBook();
		
		bs.viewBook(2, 
				"데이터베이스", 
				"송영철",
				"생능출판사", 
				15000);	

		bs.viewBook(3, 
				"HTML", 
				"영진출판사",
				"박진철", 
				35000);	
		System.out.println("*************************");
		BookVO book = new BookVO();
		book.num = 3;
		book.auther = "박진철";
		book.price = 35000;
		book.title = "HTML";
		book.comp = "영진출판사";
		
		bs.viewBook(book);
		
	}

}


