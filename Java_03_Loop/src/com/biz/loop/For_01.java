package com.biz.loop;

public class For_01 {

	public static void main(String[] args) {

		int num1 = 0;
		int sum = 0;
		
		// num1을 1씩 증가시키면서
		// 증가된 num1을 sum에 누적하는 코드를 반복작성
		
		sum += ++num1;
				
		++num1;
		sum += num1;
		
		num1 += 1;
		sum += num1;
		
		num1++;
		sum += num1;
		
		
	}

}
