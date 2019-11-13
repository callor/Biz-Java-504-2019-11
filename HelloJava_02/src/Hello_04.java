
public class Hello_04 {

	public static void main(String[] args) {

		/*
		 * 변수의 선언문
		 * 정수형 숫자 22와 정수형 숫자55를
		 * 기억장소에 보관하라
		 * 숫자 22가 보관된 기억장소에 num1 이라는 이름을 붙여라
		 * 숫자 55가 보관된 기억장소에 num2 라는 이름을 붙여라
		 * 그리고,
		 * 이 클래스 코드가 끝날때까지 값을 유지하라
		 * 그리고,
		 * 다음 라인에 나타나는 코드에서
		 * 이 값들을 읽어서 연산을 수행하는 코드에 사용하라
		 */
		int num1 = 22;
		int num2 = 55;
		
		/*
		 * 변수를 선언하여 코드를 작성하므로 해서
		 * 이후에 다른 숫자의 연산을 수행하고자 할때
		 * 코드의 변경을 최소한으로 하여
		 * 오류 발생 확율을 낮출수 있다.
		 */
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num2 - num1);
		System.out.println(num2 / num1);
		System.out.println(num1 % num2);
		
	}

}
