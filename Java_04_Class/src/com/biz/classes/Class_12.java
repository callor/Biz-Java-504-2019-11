package com.biz.classes;

public class Class_12 {

	public static void main(String[] args) {

		int num = 50;
		for(int prime = 2 ; prime < num ; prime++) {
			int dev = 0;
			for(dev = 2 ; dev < prime ; dev++) {
				if(prime % dev == 0) break;
			}
			if(prime > dev) {
				System.out.println(prime + "은 소수가 아님");
			} else {
				System.out.println(prime +"은 소수");
			}
		}
	}

}
