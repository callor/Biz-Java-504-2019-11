package com.biz.method.service;

import com.biz.method.domain.BookVO;

/*
 * 클래스 접미사 Service
 * 주로 method들을 모아놓은 클래스로
 * 어떤 명령들의 수행을 종류별로 모아서 사용하기 편하도록
 * 관리하는 용도로 주로 사용한다.
 */
public class BookServiceV2 {
	
	/*
	 * 도서정보를 매개변수로 공급받아서
	 * 콘솔에 표시하는 method
	 */
	public void viewBook() {
	
		int num = 1;
		String title = "자바프로그래밍";
		String auther = "박은종";
		String comp = "이지퍼블리싱";
		int price = 30000;
		
		System.out.println("===================");
		System.out.printf("순번 : %d\n",num);
		System.out.printf("도서명 : %s\n",title);
		System.out.printf("저자 : %s\n",auther);
		System.out.printf("출판사 : %s\n",comp);
		System.out.printf("가격 : %d\n",price);
		System.out.println("===================");
	}
	
	/*
	 * 매개변수로 도서정보를 공급받아서
	 * 도서정보를 console에 표시
	 */
	public void viewBook(int num,String title,
			String auther,String comp,int price	) {
		
		System.out.println("===================");
		System.out.printf("순번 : %d\n",num);
		System.out.printf("도서명 : %s\n",title);
		System.out.printf("저자 : %s\n",auther);
		System.out.printf("출판사 : %s\n",comp);
		System.out.printf("가격 : %d\n",price);
		System.out.println("===================");
	
	}
	
	public void viewBook(BookVO book) {
		System.out.println("===================");
		System.out.printf("순번 : %d\n",book.num);
		System.out.printf("도서명 : %s\n",book.title);
		System.out.printf("저자 : %s\n",book.auther);
		System.out.printf("출판사 : %s\n",book.comp);
		System.out.printf("가격 : %d\n",book.price);
		System.out.println("===================");
	}
	

}
