package com.biz.classes.method;

/*
 * 필드변수 num를 선언해 두고
 * num 변수에 값을 할당하여
 * 1 ~ num변수 값만큼 덧셈을 수행한다.
 */
public class Method_02 {

	public int num;
	
	public void add() {
		int sum = 0;
		for(int index = 1 ; index <= this.num ; index++) {
			sum += index;
		}
		System.out.printf("1 ~ %d까지 덧셈 : %d\n",
							this.num,sum);
				
	}
}
