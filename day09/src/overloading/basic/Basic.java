package overloading.basic;

public class Basic {
	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것
	 * 규칙:
	 * 1. 이름이 똑같음
	 * 2. 반환유형은 오버로딩에 영향을 미치지 않음.
	 * 3. 매개변수 타입이 달라야 함
	 * 4. 매개변수 종류가 달라야 함
	 * 5. 매개변수 순서가 달라야 함
	 * 즉-> 완전히 동일하지 않으면 됨
	 */
	Basic(){
		System.out.println("배이직 생성자 호출!");
	}
	void input(int a) {
		System.out.println("정수 1개가 입력됨");
	}
//	int input(int a) {
//		return 0;
//	}
	void input(String s) {
		System.out.println("문자열 1개가 입력됨");
	}
	void input(int a,String s) {
		System.out.println("정수 1개, 문자열 1개가 입력됨");
	}
	void input(String s,int a) {
		System.out.println("문자열 1개, 정수 1개가 입력됨");
	}
	void input(int a,double b) {
		System.out.println("정수 1개, 실수 1개가 입력됨");
	}
	void input(double b,int a) {
		System.out.println("실수 1개, 정수 1개가 입력됨");
	}
	void input(int a,int b) {
		System.out.println("정수 2개가 입력됨");
	}
	void input(String a,String b) {
		System.out.println("문자열 2개가 입력됨");
	}
	void input(int a,int b,double c) {
		System.out.println("문자 1개,정수 1개, 실수 1개가 입력됨");
	}
	int input(int a,int b,int c) {
		return a+b+c;
	}
}
