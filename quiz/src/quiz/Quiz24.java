package quiz;

import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {
		//두 정수를 입력받습니다.
		//두 수의 크기는 정해지지 않았습니다.
		//두 수 사이의 합을 구하는 코드를 최대한 간략하게 작성해보세요.
		int result=0;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt(),num2=sc.nextInt();
		for(int i=num1==num2?0:(num1>=num2?num2:num1); i<=(num1==num2?-1:(num1>=num2?num1:num2));i++)
			result+=i;
		System.out.println("두 수 사이의 합 : "+result);
		sc.close();
	}
}
