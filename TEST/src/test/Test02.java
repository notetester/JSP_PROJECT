package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//정수를 입력받아서 해당 숫자까지 모든 소수들의 합 
		//ex)5를 받으면 10이 나오면 됩니다
		int num=0;
		int count=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		num=sc.nextInt();
		for(int a=2;a<=num;a++) {
			for(int b=1;b<=a;b++) {
				if(a%b==0) {
					count++;
				}else if(count>2) {
					break;
				}
			}
			if(count==2) {
				result=result+a;
			}
			count=0;
		}
		sc.close();
		System.out.println("소수들의 합은 "+result+"입니다");
	}
}
