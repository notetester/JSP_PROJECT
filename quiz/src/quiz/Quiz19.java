package quiz;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		int num=1,sum=0;
		Scanner sc=new Scanner(System.in);
		while(num!=0) {
			System.out.print("정수입력>");
			num=sc.nextInt();
			sum+=num;
		}
		System.out.println("입력한 정수의 합 : "+sum);
		sc.close();
	}
}
