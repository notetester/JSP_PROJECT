package quiz;

public class MethodQuiz02 {
	public static void main(String[] args) {
		method1();
		System.out.println(method2("으악"));
		System.out.println("세 매개변수 합:"+method3(1,2,3.5));
		System.out.println("8은 "+method4(8));
		method5("3번 반복",3);
		System.out.println("5와 3중 큰 수는 "+maxNum(5,3));
		System.out.println("-7의 절대값은 "+abs(-7));
		System.out.println("0~12까지의 합은 "+method6(12));
		int arr[]= {1,2,3};
		System.out.println("{1,2,3}배열의 길이는 "+method7(arr));
		String[]arr2=method8("문자열1","문자열2");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
	}
	static void method1() {
		System.out.println("안녕");
	}
	static String method2(String s) {
		return s;
	}
	static double method3(int a,int b,double c) {
		return a+b+c;
	}
	static String method4(int a) {
		if(a%2==0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	static void method5(String s,int a) {
		for(int i=1;i<=a;i++) {
			System.out.println(s);
		}
	}
	static int maxNum(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	static int abs(int a) {
		if(a<0) {
			a=-a;
		}
		return a;
	}
	static int method6(int a) {
		int result=0;
		for(int i=0;i<=a;i++) {
			result+=i;
		}
		return result;
	}
	static int method7(int[]arr) {
		return arr.length;
	}
	static String[] method8(String s1,String s2) {
		String[]arr= {s1,s2};
		return arr;
	}
}
