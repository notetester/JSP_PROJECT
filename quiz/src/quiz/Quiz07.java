package quiz;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		//quiz05
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		a=sc.nextInt();
		System.out.print(">");
		b=sc.nextInt();
		if(a==b) {
			System.out.println("같은 수 입니다.");
		}else if(a>b) {
			System.out.println(a+"이 큰 수 입니다.");
		}else {
			System.out.println(b+"이 큰 수 입니다");
		}
		sc.close();
	}
}
