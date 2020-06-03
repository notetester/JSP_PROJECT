package quiz10;

public class Calculator {
	int result=0;
	double pi=Math.PI;
	int add(int a) {
		return result+=a;
	}
	int sub(int a) {
		return result-=a;
	}
	int multi(int a) {
		return result*=a;
	}
	int div(int a) {
		return result/=a;
	}
	double circle(int a) {
		return a*a*pi;
	}
}
