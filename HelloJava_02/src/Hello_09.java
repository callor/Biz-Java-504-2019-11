
public class Hello_09 {

	public static void main(String[] args) {

		int num1 = 40;
		int num2 = 50;
		System.out.println(num1 + num2);
		
		// 코드는 위에서 아랫방향으로 흐르면서 실행된다.
		// num1변수에 새로운 값을 저장을 해도
		// 위에 있는 Sys...(num1 + num2)코드는 이미
		// 실행이 된 상태이므로
		// console에 출력되는 값은 90이 된다.
		num1 = 60;
		num2 = 50;
		// 아래의 System.(num1 + num2)코드는
		// 위에서 저장된 60+50의 결과가 출력된다.
		System.out.println(num1 + num2);
	}
}
