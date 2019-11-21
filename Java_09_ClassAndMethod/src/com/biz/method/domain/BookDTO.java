package com.biz.method.domain;
/*
 *  정보처리 : 컴퓨터를 사용해서 
 * 		(많은)데이터(Data)를 용도에 맞게 처리해서
 *  	정보(information)를 제공하도록 하는 일
 */

/*
 * 도서 정보처리
 * 도서를 관리하는 목적으로 사용할 데이터를
 * 저장할 묶음 변수를 만드는 것
 * ==> DTO 클래스 선언
 * 도서번호, 도서명, 출판사, 저자, 가격
 * bNum,	 bName,	 bComp,  bWriter, bPrice 
 */
/*
 * DTO 클래스는
 * 주로 (필드)변수로 이루어진 클래스
 */
public class BookDTO {
	
	public String bNum; // 문자열
	public String bName; // 문자열
	public String bComp; // 문자열
	public String bWriter; // 문자열
	public int bPrice; // 정수
}
