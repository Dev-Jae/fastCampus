package ch10;

public class ContTest {
	public static void main(String[] args) {
		/*
		 * 변하지 않는 상수와 리터럴, 병수의 형 변환
		 * 상수는 변하지 않는 수
		 * final 예약어를 사용하여 선언
		 * 
		 */
		
		final int MAX_NUM = 100; // 나중에 바꿀수 없음
		final int MIN_NUM;		 // 상수는 대문자로 표현
		
		MIN_NUM = 10;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		/*
		 * 리터럴(Literal) : 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
		 * 리터럴은 상수 풀(constant pool)에 있음
		 * 정수 리터럴은 int, 실수 리터럴은 double로 저장됨
		 */
		
		/*
		 * 형 변환(type conversion)
		 * 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
		 * 묵시적 형 변환(자동 형 변환), 명시적 형 변환(강제 형 변환)이 있음
		 * 바이트 크기가 작은 자료형에서 큰 자료형 : 자동
		 * 덜 정밀한 자료형에서 더 정밀한 자료형 : 자동
		 */
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int test = 255;
		byte bTest = (byte) test;
		
		System.out.println(bTest);
		
		double dNum = 3.14;
		int iTest = (int) dNum;
		
		System.out.println(iTest);
		
		/*
		 * 교재 TEST
		 */
		
		double dTest = 1.2;
		float fTest = 0.9F;
		
		int iNum1 = (int)dTest + (int)fTest;
		int iNum2 = (int)(dTest + fTest);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
