package com.biz.method.classes;
/*
 * gugudan 표시의 반복되는 코드를 재 사용하기
 * gugudan 표시하는 method를 만들어서 
 * 다른곳에서 호출하여 사용할수 있도록 한다.
 */
public class GugudanClassV1 {

	/*
	 * 5 x 2 ~ 5 x 9까지 구구단을 표시하는 코드
	 */
	public void viewGuguDan() {
		int dan = 5;
		int start = 2;
		int end = 9;
		for(int item = start ; item <= end;item++) {
			System.out.printf("%d x %d = %d\n"
					,dan,item, dan * item);
		}
	}
	
	/*
	 * 임의의 숫자를 사용하여 구구단을 표시하고 싶다
	 * 구구단을 표시할때마다 dan 변수의 값을 변경하는
	 * 절차가 매우 불편하다
	 */
	public void viewGuguDan( int dan ) {

		// int dan = 5;
		int start = 2;
		int end = 9;
		for(int item = start ; item <= end;item++) {
			System.out.printf("%d x %d = %d\n"
					,dan,item, dan * item);
		}
	}
	/*
	 * 두개의 숫자를 공급받아서 
	 * 각각 start, end 변수에 저장을 하고
	 * 반복문을 실행할때 start ~ end 까지 실행되도록 하고
	 * 5 x start ~ 5 x end까지 곱셈 리스트를 표시
	 */
	public void viewGuguDan( int start, int end ) {
		int dan = 5;
		// int start = 2;
		// int end = 9;
		for(int item = start ; item <= end;item++) {
			System.out.printf("%d x %d = %d\n"
					,dan,item, dan * item);
		}
	}
	
	/*
	 * 위코드는 두개의 숫자를 공급받아서
	 * 무조건 5단의 곱셈리스트만 표시를 하고 있는데
	 * 
	 * 임의 단수를 공급받아서
	 * 공급받은 단의 곱셈리스트를 표시하고 싶다.
	 * 단수, 시작값, 끝값의 3개의 값을 공급받아서
	 * 명령을 수행하면 될것 같다.
	 */
	public void viewGuguDan(int dan, int start, int end) {
		
		for(int item = start ; item <= end ; item++ ) {
			System.out.printf("%d x %d = %d\n"
					,dan,item, dan * item);
		}
	}
	
}




