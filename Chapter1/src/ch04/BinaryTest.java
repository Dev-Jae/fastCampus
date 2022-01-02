package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		// 컴퓨터에서 자료 표현 : 2진수
		// 0과 1로만 데이터를 저장
		// bit : 컴퓨터가 표현하는 데이터의 초쇠 단위는 2진수 하나의 값을 저장할 수 있는 메모리의 크기
		// byte : 1byte = 8bit
		// 2진수, 8진수, 16진수 -> 따로 공부하기(노트에 필기)
		// 한 개의 비트로 나타낼 수 있는 수 : 0, 1 (2개)
		// 두 개의 비트로 나타낼 수 있는 수 : 00, 01, 10, 11 (4개)
		// 세 개의 비트로 나타낼 수 있는 수 : 000, 001, 010, 011, 100, 101, 110, 111 (8개)
		// 정수 표현하는 자료형 : int(integer)
		int num = 10;			// 10진수
		int bNum = 0B1010;		// 2진수(0B를 앞에 쓰면 뒤에 나오는 숫자는 2진수)
		int oNum = 012;			// 8진수(0을 앞에 쓰면 8진수)
		int xNum = 0XA;			// 16진수(OX를 앞에 쓰면 16진수)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
