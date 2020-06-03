package quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		//quiz06
		int num=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		num=sc.nextInt();
		if(num==0) {
			System.out.println("입력한 정수는 0 입니다.");
		}else if(num<0) {
			System.out.println(num+"은(는) 음의 정수 입니다.");
		}else if(num%2==0) {
			System.out.println(num+"은(는) 짝수 입니다.");
		}else {
			System.out.println(num+"은(는) 홀수 입니다.");
		}
		sc.close();
	}
}
