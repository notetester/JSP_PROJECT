package quiz;

import java.util.Scanner;

public class Quiz33 {
	public static void main(String[] args) {
		/*
		 * up down 게임
		 * 
		 * 1~100까지의 임의의 숫자를 생성.
		 * 스캐너를 통해서 값을 입력 받습니다.
		 * 램덤 수가 입력 받은 값보다 작으면 "더 작은 수를 입력하세요."
		 * 랜덤 수가 입력 받은 값보다 크면 "더 큰 수를 입력하세요."
		 * 
		 * 정답이면 시도 횟수 : x회를 출력하고 종료.
		 */
		Scanner sc=new Scanner(System.in);
		int in=0,count=0,num=(int)(Math.random()*100+1);
		while(true) {
			count++;
			System.out.print("정수 입력>");
			in=sc.nextInt();
			if(num==in) {
				break;
			}else if(num<in) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("더 큰 수를 입력하세요.");
			}
		}
		System.out.println("시도 횟수 : "+count+"회");
		sc.close();
	}
}
