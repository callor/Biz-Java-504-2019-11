package com.biz.loop;

public class For_09 {

	public static void main(String[] args) {

		/*
		 * 2부터 num1까지의 숫자중 
		 * 소수가 아닌숫자들만 찾아서 보여주기
		 */
		int num1 = 2000000000;
		for(int p1 = 2 ; p1 <= num1 ;p1++) {
			for(int p2 = 2 ; p2 < p1 ; p2++) {
				if(p1 % p2 == 0) {
					System.out.println(p1 +"은 소수가 아님");
					break;
				}
			}
		}
		
	}

}
