package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		/*
		 * 조건문 : 주어진 조건에 따라 다른 실행이 이루어 지도록 구현
		 * if문, if ~ else 문, if ~ else if ~ else문
		 * if문은 조건식이 '참'인 경우에(조건에 맞는 경우) 수행문이 수행됨
		 * 
		 */
				
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age >= 8) {
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
		
		System.out.println("노는게 제일 좋아");
	}

}
