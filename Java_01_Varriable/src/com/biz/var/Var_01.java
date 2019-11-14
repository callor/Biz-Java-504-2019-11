/*
 * package
 * 자바의 클래스 파일들을 관리하기 쉽도록 
 * 파일들을 모아두는 폴더를 가리키며
 * 윈도우의 폴더와 같은 의미로 보면 된다.
 * 
 * package이름은
 * 그 회사의 인터넷 도메인 네임(Domain name)을
 * 역순으로 시작하여 작성한다.
 * 
 * 예) biz.com 도메인 네임을 사용하는 회사는
 * 	com.biz.프로젝트이름 형식으로 작성
 * 
 * naver.com의 경우
 * com.naver.hello 와 같은 방식으로 사용을 할 것이다
 * package com.naver.hello
 */
package com.biz.var;

public class Var_01 {
	public static void main(String[] args) {

		// 정수형 값을 저장할 메모리 장소를 예약하고
		// 이름을 num1으로 설정
		// 0을 저장하여 메모리 내용을 clear 하라
		int num1 = 0; // 정수형 변수 선언, clear
		double num2 = 0.0; // 실수형 변수 선언, clear
		String name1 = "" ; // 문자열형 변수 선언, clear
		
		// 위에서 선언된 변수에 값들을 저장하라
		// 이미 선언된 변수에 값들을 할당하라
		// 변수에 값을 할당하면
		//		기존에 어떤 값이 저장되어 있던지 관계없이
		//		기존값은 모두 사라지고
		//		새로운 값이 저장된다.
		num1 = 30;
		num2 = 23.3;
		name1 = "홍길동";
		
		// 이코드가 실행되기 전에
		// num3 변수가 선언된적이 없다
		// cannot be resolved : 선언되지 않은 변수이다
		// num3 = 40;
		
		int num4; // 예약만된변수
		// initialize : 변수가 선언은 되었지만
		// 사용할수 있도록 초기화 되지 않았다
		// System.out.println(num4);
		
		/*
		 * 1.변수는 사용(읽기, 저장, 할당)하기 전에
		 * 	 반드시 최소한 선언이 되어 있어야 한다.
		 * 	 int num4 ; // 예약(선언)만 되었다라고 한다.
		 * 
		 * 2.선언(예약)만 된 변수는
		 * 	 저장, 할당만 할수 있다.
		 * 	 변수에 어떤 값이 저장되어있는지 확인할 수 없으므로
		 * 	 절대 읽기를 수행할수 없다.
		 * 
		 * 3.변수는 선언과 초기화를 해주는 것이 좋다.
		 * 	 int num1 = 0;
		 *   double num2 = 0;
		 *   String name1 = "";
		 *   
		 * 4.한번 선언된 변수는 다시 선언할수 없다.
		 */
		
		
		
		
	}
}




