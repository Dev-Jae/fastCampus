package ch3;

public class FunctionTest {

		public static int addNum(int num1, int num2) {
			int result;
			result = num1 + num2;
			
			return result;
		}
		
		// 반환값이 없는 경우에는 void 사용
		public static void sayHello(String greeting) {
			System.out.println(greeting);
		}
		
		public static int calcSum() {
			int sum = 0;
			int i;
			
			for(i = 0; i <=100; i++) {
				sum += i;
			}
			
			return sum;
		}
		
		public static void main(String[] args) {
			int n1 = 10;
			int n2 = 20;
			
			System.out.println("addNum 함수 호출 : " + addNum(n1, n2));
			
			sayHello("함수 테스트 호출");
			
			System.out.println("calcSum 함수 호출 : " + calcSum());
		}
}
