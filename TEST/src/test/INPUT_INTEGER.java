package test;

import java.util.Scanner;

public class INPUT_INTEGER {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		while(true) {
			try{
				a=sc.nextInt();
				b=sc.nextInt();
			}catch(Exception e){
				System.out.println("정수로만 입력하세요.");
				sc.next();
				continue;
			}
			break;
		}
		sc.close();
		System.out.println(a);
		System.out.println(b);
	}

}
