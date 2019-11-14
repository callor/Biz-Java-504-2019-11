package com.biz.loop;

public class For_03 {

	public static void main(String[] args) {

		int num1 = 0;
		int sum = 0;
		
		for( ;; ) {
			num1++;
			if( num1 > 10 ) {
				break;
			}
			sum += num1;
			System.out.println(sum);
		}
		
		
	}

}
