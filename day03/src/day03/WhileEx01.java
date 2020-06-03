package day03;

public class WhileEx01 {
	public static void main(String[] args) {
		int a=1;//제어변수 : 반복문의 횟수를 제어할 변수
		int sum=0;
		while(a<=10) {
			sum+=a;
			a++; //제어변수 조작을 통해 반복의 조건식이 언젠가는 false가 되도록 처리
		}
		System.out.println("결과 : "+sum);
	}
}
