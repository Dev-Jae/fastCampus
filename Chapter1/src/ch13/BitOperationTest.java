package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		/*
		 * 비트 연산자 : 대입연산자와 다른 연산자가 함께 쓰임
		 * 마스크 : 특정 비트를 가리고 몇 개의 값만 사용할 때
		 * 비트켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때
		 * 비트끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때
		 * 비트 토글 : 모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 때
		 */
		
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		
		/*
		 * 연산자 우선순위
		 */
	}

}
