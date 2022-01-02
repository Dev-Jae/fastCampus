package ch06;

public class DataTest {

	public static void main(String[] args) {
		// 자료형(data type)
		// 변수를 선언하면 해당되는 자료형의 크기 만큼 메모리가 할당
		// 변수는 할당된 메모리를 가리키는 이름
		
		// 기본 자료형의 종류(괄호 안은 바이트)
		// 정수형 : byte(1), short(2), int(4), long(8)
		// 문자형 : char(2)
		// 실수형 : float(4), double(8)
		// 논리형 : boolean(1)
		
		// 정수 자료형 : 맨 앞 비트는 부호비트
		// byte : 1바이트 단위의 자료형 동영상, 음악 파일, 실행 파일의 자료를 처리할 때 사용
		// short : 2바이트 단위의 자료형 C/C++ 언어와 호환 시 사용
		
		// int : 자바에서 사용하는 정수에 대한 기본 자료 형
		// 4바이트 단위의 자료형
		// 프로그램에서 사용하는 모든 숫자(리터럴)은 int로 저장됨
		// 32 비트를 초과하는 숫자는 long 자료형의로 처리
		
		// long : 8바이트 자료형
		// 숫자의 뒤에 알파벳 L 또는 l을 써서 long 형임을 표시
		// int num = 12345678900; : 오류 남
		// long lnum = 12345678900; : 오류 남(4바이트로 잡혀서 오류가 남)
		long number = 12345678900L; // OK
		
		System.out.println(number);
		
		// 실수형은 기본 double형(8)로 잡히기 때문에 float형(4)으로 잡으려면 뒤에 3.14f처럼 f를 붙여줘야 함
		byte bnum = 127;
		int num = 123456789;
		long lnum = 12345678900L;
		
		System.out.println(bnum);
		System.out.println(num);
		System.out.println(lnum);
	}

}
