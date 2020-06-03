package overloading.basic;

public class Extra extends Basic{
	void Basic(){
		System.out.println("변환된 배이직 생성자 호출!");
	}
	Extra() {
		System.out.println("엑스트라 생성자 호출");
	}
	void input(int a) {
		System.out.println("변환된 정수 1개가 입력됨");
	}
	int input(int a,int b,int c) {
		return a+b+c;
	}
}
