package day04;

import java.util.Scanner;

public class ContinueEx02 {
	public static void main(String[] args) {
		//Quiz14
		int num=0;
		int count=0;
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		num=sc.nextInt();
		for(int a=2;a<=num;a++) {
			for(int b=1;b<=a;b++) {
				if(a%b==0) {
					count++;
				}
				if(count>2) {
					break;
				}
			}
			if(count==2) {
				result+=a;
			}
			count=0;
		}
		sc.close();
		System.out.println(num+"까지 소수의 합은: "+result);
	}
}
