package com.biz.method;

public class GugudanV4 {

	public static void main(String[] args) {
		/*
		 * 구구단의 시작하는 값과 끝 값을 임의로 설정하여
		 * 표시를 하고 싶다.
		 * 
		 * 5 x 2 = 10 ~ 5 x 5 = 25 이런 고정 구구단을
		 * 5 x 10 = 50 ~ 5 x 100 = 500 와 같은 식으로
		 * 임의값을 설정하여 표시하고 싶다.
		 */
		int dan = 5;
		int start = 2;
		int end = 9;
		for(int item = start ; item <= end;item++) {
			System.out.printf("%d x %d = %d\n"
					,dan,item, dan * item);
		}
	}
}
