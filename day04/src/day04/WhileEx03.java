package day04;

import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=1;
		//int num=0;
		int sum=0;
		while(i<=10) {
			System.out.print("정수입력>");
			int num=scan.nextInt();
			sum+=num;
			i++;
		}
		System.out.println("입력 받은 수의 합 : "+sum);
		scan.close();
	}
}
