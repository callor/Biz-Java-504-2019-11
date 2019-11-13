
public class Hello_14 {

	public static void main(String[] args) {

		// num1의 변수 값을 사용하는 시점
		// console에 보이는 코드가 실행되는 시점
		// 바로 직전에 num1에 저장된 값이 console에 보인다.
		int num1 = 0;
		num1 = 40;
		num1 = 50;
		System.out.println(num1); // 50
		num1 = 0;
		num1 = 100;
		System.out.println(num1); // 100
		num1 = 200;
		num1 = 0;
		System.out.println(num1); // 0
	
	}

}
