
public class Hello_02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 30+40 >> 30 40 +
		 * 2. 숫자 30을 기억장치 
		 * 		어딘가에(A주소) 보관
		 * 3. 숫자 40을 기억장치 
		 * 		어딘가에(B주소)
		 * 4. A주소에 보관중인 30을 CPU로 복사
		 * 5. B주소에 보관중인 40을 CPU로 복사
		 * 6. 숫30과 숫자 40을 덧셈하여
		 * 7. 또다른 어딘가(C주소)에 보관
		 * 8. C주소를 println() method에게 알려준다
		 * 9. out 거처서 System 클래스에게 전달
		 * 10. System 클래스는 C주소에 저장된 값을
		 * 11. console에 표시
		 */
		System.out.println(30+40);
	
	}
}
