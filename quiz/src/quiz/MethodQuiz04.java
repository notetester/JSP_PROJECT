package quiz;

public class MethodQuiz04 {
	public static void main(String[] args) {
		//자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수를 완성하세요.
		System.out.println(sum(6));
		//1부터 입력받은 숫자 a 사이에 있는 소수의 갯수를 반환하는 함수 primeNum을 완성하세요.
		//소수는 1과 자기 자신으로만 나누어지는 수
		//(1은 소수가 아닙니다.)
		System.out.println("3의 소수의 갯수 : "+primeNum(3));
		//sumNum은 매개변수 2개를 받습니다.
		//두 매개변수 사이에 속한 모든 정수의 합을 구하는 sumNum을 완성하세요.
		//두 매개변수의 크기는 정해지지 않았습니다.
		System.out.println("7~9의 사이의 수의 합 : "+sumNum(7,9));
		System.out.println("9~7의 사이의 수의 합 : "+sumNum(9,7));
		System.out.println("5~5의 사이의 수의 합 : "+sumNum(5,5));
	}
	static int sum(int a) {
		int result=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				result+=i;
			}
		}
		return result;
	}
	static int primeNum(int a) {
		int count=0,result=0;
		for(int i=2;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count>2) {
					break;
				}
			}
			if(count==2) {
				result++;
			}
			count=0;
		}
		return result;
	}
	static int sumNum(int a,int b) {
		int sum=0;
		for(int i=(a<b?a:b);i<=(a>b?a:b);i++) {
			sum+=i;
		}
		return sum;
	}
}
