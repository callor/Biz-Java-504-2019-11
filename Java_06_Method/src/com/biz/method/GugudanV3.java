package com.biz.method;

/*
 * for() 반복명령문을 사용해서
 * 구구단 표시
 */
public class GugudanV3 {
	
	public static void main(String[] args) {
		int dan = 5;
		int start = 2;
		/*
		 * for() 반복문이 2부터 10까지 1씩 증가하는 동안
		 * start 변수값을 1씩 증가시키면서
		 * 구구단을 표시
		 */
		for(int item = 2 ; item <= 10; item++) {
			
			System.out.printf("%d x %d = %d\n",
					dan,start,dan * start++);
			
		}
		System.out.println("======================");
		/*
		 * for() 반복문내에서 item변수가
		 * 2~10까지 1씩 증가하는 값을 만들어내고 있으므로
		 * start++ 라는 명령문 대신에 
		 * item 변수값을 활용하여 구구단 표시
		 */
		for(int item = 2 ; item <= 10; item++) {
			System.out.printf("%d x %d = %d\n",
					dan,item,dan * item);
		}
	}

}



