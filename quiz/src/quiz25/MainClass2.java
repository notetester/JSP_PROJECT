package quiz25;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int in=0,count=0,num=(int)(Math.random()*100+1);
		while(true) {
			count++;
			System.out.print("1과 100사이의 정수 값을 입력하세요.>");
			try {
				in=sc.nextInt();
				if(num==in) {
					break;
				}else if(in<1||in>100) {
					System.out.println("잘 못 입력했습니다. 1과 100사이의 정수 값을 입력하세요.");
				}else if(num<in) {
					System.out.println("더 작은 수를 입력하세요.");
				}else {
					System.out.println("더 큰 수를 입력하세요.");
				}
			}catch(Exception e) {
				System.out.println("잘 못 입력했습니다. 1과 100사이의 정수 값을 입력하세요.");
				sc.next();
			}
		}
		System.out.println("정답입니다.");
		System.out.println("시도 횟수 : "+count+"회");
		sc.close();
	}

}
