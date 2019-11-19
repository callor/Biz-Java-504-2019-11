package com.biz.method.domain;

/*
 * 클래스 이름의 접미사 VO
 * VO : Value Object
 * 	필드변수를 사용하기 위해서 작성하는 클래스
 * == DTO(Data Transfer Object)
 * method에 값을 주입하고, 공급받는 용도로 사용하는
 * 클래스로
 * 
 * 매개변수로 설정하여 사용하면
 * 각 항목(item)별로 값을 전달해야하는 경우
 * 묶음으로 한번에 전달 할수 있어서
 * 매우 편리하게 사용할수 있다.
 *  
 */
public class BookVO {
	
	/*
	 * 
	 * 도서정보 추상화
	 * 도서정보를 관리하는 프로젝트를 시작하는데
	 * 도서의 어떤정보를 관리해야
	 * 효율적인 도서관리 될까 라는 고민을 하고
	 * 그로부터 도서명, 저자, 출판사, 가격 이라는
	 * 데이터가 필요함을 알게 되었고
	 * 필요한 데이터를 클래스의 
	 * 		필드변수로 설정을 하였다.
	 * 
	 */
	public int num;
	public String title;
	public String auther;
	public String comp;
	public int price;

}
