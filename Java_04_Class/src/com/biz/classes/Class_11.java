package com.biz.classes;

public class Class_11 {

	public static void main(String[] args) {

		int num = 50;
		// 2 ~ 49까지 index 값을 1씩 증가하면서 반복 수행
		for(int prime = 2 ; prime < num ; prime++) {
			
			/*
			 * dev 변수를 for() 시작되기전에 선언, 초기화
			 * for() 시작되기전에 변수를 선언하는 이유?
			 * for() 종료된 후에 변수를 참조하기 위해서
			 */
			int dev = 0;
			// 이미 선언된 dev변수의 값을 2로 설정하여
			// for()반복문의 시작값을 2로 설정한다.
			for(dev = 2 ; dev < prime ; dev++) {
				
				// 내부 for()가 반복수행되는 동안에
				// prime수와 dev수를 % 연산수행하여
				// 나머지를 검사
				// 나머지가 0이 한번이라도 나오면
				// 내부 for()의 반복을 중단한다.
				if(prime % dev == 0) break;
			}
			/*
			 * for(dev)가 모두 정상종료되었거나
			 * 중간에 break를 만나서 중단되었을경우
			 * 실행될 부분
			 * 
			 * 여기에서 for(dev)가 모두 정상종료되었는지
			 * 아니면 break를 만나서 중단되었는지를 검사하여
			 * 
			 * 정상종료되었으면
			 * => 중간에 한번도 
			 * 		prime % dev == 0이 true경우가 없다면
			 * prime <= dev 일 것이고
			 * 
			 * 도중에 break를 만나서 중단되었다면
			 * prime > dev인 상태가 될것이다
			 * 
			 * prime <= dev 인 경우는 prime이 소수이고
			 * prime > dev 인경우는 prime이 소수가 아니다
			 */
			if(prime > dev) {
				System.out.println(prime + "은 소수가 아님");
			} else {
				System.out.println(prime +"은 소수");
			}
		}
		
		
	}

}
