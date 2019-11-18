package com.biz.classes;

/*
 * 성적처리를 수행할때 사용할
 * 성적데이터를 담을 클래스 선언
 * 
 * 클래스는 
 * 자연계의 데이터를 모아서
 * 정보처리를 수행할때 데이터를 
 * 그룹으로 묶어 보관하는 용도
 * 
 * 그룹으로 묶인 데이터를 다양한 메서드에 전달할때
 * 쉽게 이동할수 있는 수단
 */
public class ScoreV3 {
	
	public int num;
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public int total;
	public int avg;
	
	public int rank;
	
	public void viewScore() {
		// this.
		// 현재(ScoreV3) 클래스의 맴버변수이다 라는 표시
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total / 3;
		
		System.out.println("==================================");
		System.out.printf("%d 번 %s 학생 성적표\n",
								this.num,this.name);
		System.out.println("----------------------------------");
		System.out.printf("국어:%3d\n",this.kor);
		System.out.printf("영어:%3d\n",this.eng);
		System.out.printf("수학:%3d\n",this.math);
		System.out.println("----------------------------------");
		System.out.printf("총점:%3d\n",this.total);
		System.out.printf("평균:%3d\n",this.avg);
		System.out.println("==================================");
	}
	

}
