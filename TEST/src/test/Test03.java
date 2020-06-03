package test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 스캐너를 통해 2개의 정수를 입력받습니다.
		 * 입력한 정수값이 단순히 정수면 2개를 출력하고 종료.
		 * 
		 * 입력받은 값이 예외를 발생시키는 값이라면 "정수로만 입력하세요"를 출력후에 다시 처음부터
		 * 정수를 입력받게 하면 됩니다.
		 * 
		 * 정상 종료가 되면 "프로그램 정상종료" 구문 출력되면 됩니다.
		 */
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
//		while(true) {
//			if(sc.hasNextInt()) {
//				a=sc.nextInt();
//			}else {
//				System.out.println("정수로만 입력하세요.");
//				sc.next();
//				continue;
//			}
//			if(sc.hasNextInt()) {
//				b=sc.nextInt();
//				break;
//			}else {
//				System.out.println("정수로만 입력하세요.");
//				sc.next();
//				continue;
//			}
//		}
		sc.close();
		System.out.println(a);
		System.out.println(b);
	}
}
