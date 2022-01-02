package ch05;

public class VaiableTest {

	public static void main(String[] args) {
		// 변수는 변하는 수
		// 표현하려는 수에 맞는 데이타 타입(자료형)을 이용하여 변수 선언
		// 숫자, 문자, 문자열 등 다양함 -> 그에 맞는 자료형을 사용
		int age, count;	// 변수 선언
		age = 10;	// = 대입연산자
		
		int level = 10000;	// 선언과 동시에 초기화
		System.out.println(age);
		System.out.println(level);
		
		// 변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수도 있고, 특수문자 중에는 $와 _만 사용(ex. count100, _master)
		// 변수 이름의 시작은 숫자로 할 수 없음 (ex. 27days(x), 1abc(x))
		// 자바에서 이미 사용하고 있는 예약어는 사용할 수 없음 (while, break 등)
		// 용도에 맞고 가독성이 좋게 만드는것이 중요
		// 카멜방식 : 소문자시작 중간에 바뀔때마다 대문자 (ex. numberOfStudet)
	}

}
