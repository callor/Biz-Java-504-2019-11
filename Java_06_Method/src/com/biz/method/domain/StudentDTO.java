package com.biz.method.domain;

/*
 * VO, DTO 클래스들을 만들기
 * 데이터를 처리하는 주체가 무엇인가를 잘 분석해서
 * 최소한의 변수종류를 설정하고
 * 그 변수만으로 주체를 잘 설명할수 있도록 작성
 * 
 * 추상화
 * 학생정보를 관리하는 프로젝트를 만들텐데
 * 학생정보의 어떠한 항목들이 필요로한가를 분석하는 것
 * 학번, 이름, 학과, 학년, 전화번호, 주소, 담임교수
 */
public class StudentDTO {
	
	public int num;
	public String name;
	public String dept;
	public int grade;
	public String tel;
	public String addr;
	public String pro;

}





