package com.biz.ifelse;

public class If_02 {

	public static void main(String[] args) {

		int num1 = 32341;
		
		boolean bYes = true;
		
		bYes = (num1 % 2) == 0;
		
		// (num1 % 2) == 0 의 연산을 수행하여
		// 결과인 true나 false가 bYes에 담겨 있다.
		// bYes에 담긴 값이 true 이면
		// 짝수라고 출력하고
		if(bYes)
			System.out.println("짝수입니다");
		
		// bYes에 담긴 값이 false이면
		// 홀수라고 출력하라
		if(bYes == false)
			System.out.println("홀수입니다");
		
		// bYes에 담긴 값이 true이면
		// 짝수라고 출력하고
		if(bYes)
			System.out.println("짝수");
		// 아니면
		// 홀수라고 출력하라
		else
			System.out.println("홀수");
		
		bYes = (num1 % 3) == 0;
		// num1 % 3의 결과는 0,1,2 중의 한가지 값일 것이다
		// 이 결과가 0인 경우는 당연히 3의 배수가 이다.
		// 하지만 결과가 1,2인 경우는
		// 어떤 값의 배수인지 명확히 정의할수 없다.
		// 이런경우 bYes가 true이면
		// 3의 배수라고 출력하고
		// 그렇지 않은경우는
		// 3의 배수가 아니라고 출력해야 한다.
		if(bYes)
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수가 아님");
		
		
	}

}
