
public class Hello_13 {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = num1; // num1에 저장된 값을 num2로 복제
		System.out.println(num2); // 40
		
		// int num2 = num1 명령문이 위에서 실행 되었지만
		// num1과 num2변수는 아무런 관계 없다.
		// num2의 값을 변경해도
		// num1의 값은 변동이 없다.
		num2 = 50;
		System.out.println(num1); // 40
		
	}
}
