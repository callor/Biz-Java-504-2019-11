package com.biz.method.domain;

/*
 * VO 클래스
 * 정보처리를 수행하는데 필요한 
 * 데이터의 구조를 설정하는 클래스
 * 
 * 학생정보를 컴퓨터로 처리하는데
 * 학생정보의 어떠한 항목이 필요한가를 분석해서
 * VO 클래스로 선언을 한다.
 * 
 * 학생정보를 처리하는데 어떠한 항목들이 필요한가
 * 학번, 학생이름, 학과, 학년, 주소, 전화번호, 담임교수
 * stNum, stName, stDept, stGrade, stAddr, stTel, stPro
 * 
 */
public class StudentVO {
	public int stNum;
	public String stName;
	public String stDept;
	public int stGrade;
	public String stAddr;
	public String stTel;
	public String stPro;
}



