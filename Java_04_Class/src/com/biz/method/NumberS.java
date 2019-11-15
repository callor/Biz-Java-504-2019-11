package com.biz.method;

/*
 * class 에 method를 정의(선언)해 둠으로써
 * 다른 class에서 method를 호출하여
 * 복잡한 일들을 한줄의 코드만으로 처리할수 있도록
 * 한다.
 * 
 *  method의 코드가 어떻게 작동되는지 몰라도
 *  method가 하는일만 알면
 *  쉽게 method를 조합하여
 *  다른 기능을 구현할 수 있다.
 */

public class NumberS {
	/*
	 * method의 선언
	 * method의 정의
	 * prototype 선언
	 * prototype 정의
	 */
	public static void add() {
		int count = 100;
		int sum = 0;
		for(int num = 1 ; num <= count ; num++) {
			sum += num;
		}
		System.out.printf("1 ~ %d 까지 덧셈 : %d\n",count,sum);
	} // end add()
	
	public static void prime() {
		
		int count = 100;
		for(int prime = 2; prime < count ; prime++) {
			
			int dev = 0;
			for(dev = 2; dev < prime ; dev++) {
				if(prime % dev == 0) break;
			}
			if(dev >= prime) {
				System.out.printf("%d 는 소수\n",prime );
			}
		}
	} // end prime()
	
	public static void even() {
		
		int count = 20;
		for(int e = 1 ; e <= count ; e++) {
			if(e % 2 == 0) { 
				System.out.printf("%d 는 짝수\n",e);
			}
		}
	
	} // end even()
	
}
