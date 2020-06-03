package quiz;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰 값, 가장 작은 값, 중간 값을 구해서 출력.
		 */
		int max=0;
		int mid=0;
		int min=0;
		int a=0,b=0,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c) {
			max=a;
			if(b>c) {
				mid=b;
				min=c;
			}else{
				mid=c;
				min=b;
			}
		}else if(b>a&&b>c) {
			max=b;
			if(a>c) {
				mid=a;
				min=c;
			}else{
				mid=c;
				min=a;
			}
		}else if(c>a&&c>b) {
			max=c;
			if(b>a) {
				mid=b;
				min=a;
			}else{
				mid=a;
				min=b;
			}
		}
		System.out.println("가장 큰 값 : "+max+", 가장 작은 값 : "+min+", 중간 값 : "+mid);
		sc.close();
	}
}
