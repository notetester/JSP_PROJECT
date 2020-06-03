package quiz;

import java.util.Scanner;

public class Quiz32 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int a=0,b=0,i=0,t=0,f=0;
//		while(true) {
//			System.out.println("------------------");
//			a=(int)(Math.random()*100+1);
//			b=(int)(Math.random()*100+1);
//			System.out.println(a+" + "+b+" = ?");
//			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
//			System.out.print(">");
//			i=sc.nextInt();
//			if(i==0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}else if(i==a+b) {
//				t++;
//			}else {
//				f++;
//			}
//		}
//		System.out.println("------------------------------");
//		System.out.println("정답 횟수: "+t+"회");
//		System.out.println("틀린 횟수: "+f+"회");
//		sc.close();
		Scanner sc=new Scanner(System.in);
		int a=0,b=0,c=0,i=0,t=0,f=0;
		while(true) {
			System.out.println("------------------");
			a=(int)(Math.random()*100+1);
			b=(int)(Math.random()*100+1);
			c=(int)(Math.random()*2);
			System.out.println(a+(c==0?" + ":" - ")+b+" = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			i=sc.nextInt();
			if(i==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(c==0?i==a+b:i==a-b) {
				t++;
			}else {
				f++;
			}
		}
		System.out.println("------------------------------");
		System.out.println("정답 횟수: "+t+"회");
		System.out.println("틀린 횟수: "+f+"회");
		sc.close();
	}
}
