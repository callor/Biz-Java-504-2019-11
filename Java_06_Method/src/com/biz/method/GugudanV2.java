package com.biz.method;

public class GugudanV2 {

	public static void main(String[] args) {

		/*
		 * 2단 구구단을 콘솔에 표시하는 코드
		 */
		int start = 2;
		int dan = 5;
		System.out.printf("%d x %d = %d\n",
					dan,start,dan * (start++));
		// start++;
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		System.out.printf("%d x %d = %d\n",
				dan,start,dan * start++);
		
	}
}
