package ch09;

public class BoolTest {
	public static void main(String[] args) {
		/*
		 * 논리형과 자료형
		 * 논리형 : true, false 두 가지만 나타냄
		 * 1바이트를 사용 함
		 * 값이 존재하는지, 배열이 비었는지, 결과가 참인지 거짓인지등을 표현
		 * boolean test = true;
		 */
		
		boolean test = true;
		System.out.println(test);
		
		/*
		 * 지역 변수 자료형 없이 사용하기 (자바 10 부터 지원 됨)
		 * 추론 가능한 변수에 대한 자료형을 선언하지 않음
		 * 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
		 * 지역 변수만 사용 가능
		 */
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; 이건 안됨
		System.out.println(str);
		
		var str2 = str;
		
		System.out.println(str2);
		
		
	}
}
