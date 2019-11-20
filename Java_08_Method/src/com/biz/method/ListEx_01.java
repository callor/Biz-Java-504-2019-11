package com.biz.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_01 {

	public static void main(String[] args) {

		// String형 데이터를 요소로 포함할 List
		List<String> stList;
		stList = new ArrayList<String>();
		
		// 정수형 데이터를 요소로 포함할 List
		List<Integer> intList;
		intList = new ArrayList<Integer>();
		
		stList.add("홍길동");
		stList.add("이몽룡");
		stList.add("성춘향");
		
		stList.add("대한민국");
		stList.add("Republic of Korea");
		// stList 에는 5개의 요소가 저장되어 있다.
		
		stList.add("임꺽정");
		
		System.out.printf("stList의 개수 : %d\n"
				,stList.size());
		
		Random rnd = new Random();
		for(int i = 0 ; i < 15 ; i++) {
			int num = rnd.nextInt(100);
			intList.add(num);
		}
		System.out.printf("intList의 개수 : %d\n"
				,intList.size());
		
		int intSize = intList.size();
		for(int i = 0 ; i < intSize ; i++) {
			System.out.println( intList.get(i) );
		}
	}

}
