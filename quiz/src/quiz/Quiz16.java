package quiz;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		int num=0,count=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		num=sc.nextInt();
		System.out.println("구구단:"+num+"단");
		while(count<=9) {
			System.out.println(num+" x "+count+" = "+(num*count));
			count++;
		}
		sc.close();
	}
}
