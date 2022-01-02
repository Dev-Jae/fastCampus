package ch08;

public class CharTest {
	public static void main(String[] args) {
		/*
		 * 문자도 정수로 표현
		 * A는 65 
		 * 문자세트 : 각 문자를 영어로 표현할 것인지 코드 값을 모아둔 것을 문자세트라고 함
		 * UNICODE : utf-8, utf-16
		 * 자바는 문자를 나타내기 위해 UNICODE를 사용
		 * utf-16 인코딩을 사용(모든 문자를 2바이트로 표시)
		 * 문자를 위한 데이터 타입 char ch = 'A';
		 * 내부적으로 숫자로 표현되므로 숫자를 넣어도 문자가 출력될 수 있음
		 */
		
		char ch1 = 66;
		char ch2 = 'B';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '한';
		char han2 = '\uD55C';	// 유니코드 값으로 한
		
		System.out.println(han);
		System.out.println(han2);
	}
}
