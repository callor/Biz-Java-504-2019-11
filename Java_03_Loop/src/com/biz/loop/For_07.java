package com.biz.loop;

public class For_07 {

	public static void main(String[] args) {

		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("* * * * *");
		}
		System.out.println("=======================");
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(i);
		}
		System.out.println("======================");
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println("* * * * *");
		}
		System.out.println("======================");
		for(int i = 1; i <= 5 ; i++) {
			System.out.println(i);
		}
		System.out.println("======================");
		System.out.print("Korea");
		System.out.print("Korea");
		System.out.println("Korea");
		System.out.println();
		System.out.println("대한민국");
		System.out.println("======================");
		for(int line = 1; line <= 5 ; line++) {
			for(int count = 0 ; count < 5 ; count++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("======================");
		for(int line = 1; line <= 5 ; line++) {
			for(int count = 0 ; count < line ; count++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
