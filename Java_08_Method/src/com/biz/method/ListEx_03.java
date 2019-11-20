package com.biz.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_03 {

	public static void main(String[] args) {

		// Integer : int형과 같은 클래스
		// 리스트에 정수형 값들을 담겠다.
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			/*
			 * rnd.nextInt()에게 난수를 만들어서
			 * return 해 달라고 요청을 하고
			 * return된 난수를 직접 add() 에 주입
			 */
			intList.add( rnd.nextInt(100) );
		}
		
		System.out.printf("intList의 개수 : %d\n"
				,intList.size());
		
		int nSize = intList.size();
		for(int i = 0 ; i < nSize ; i++) {
			
			System.out.print(intList.get(i));
			if( (i+1) % 5 == 0 ) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		
		}
	}
}





