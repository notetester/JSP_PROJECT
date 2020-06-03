package quiz;

import java.util.Scanner;

public class Quiz23 {
	public static void main(String[] args) {
		//1. 7~100까지 정수 중 7의 배수를 가로로 출력
//		for(int i=7;i<=100;i++) {
//			if(i%7==0) {
//				System.out.print(i+" ");
//			}
//		}
		for(int i=7;i<=100;i+=7) {
			System.out.print(i+" ");
		}
		System.out.println();
		//2. 1~100까지 정수 중 12의 배수를 가로로 출력
		for(int i=1;i<=100;i++) {
			if(i%12==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		//3. 1~200까지 정수 중 9의 배수의 갯수를 출력
		int count=0;
		for(int i=1;i<=200;i++) {
			if(i%9==0) {
				count++;
			}
		}
		System.out.println(count);
		//4. 50~100까지 두 수 사이의 합.
		int sum=0;
		for(int i=50;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		//5. A~Z까지 출력.
//		for(int i=65;i<=90;i++) {
//			System.out.print(Character.toChars(i)+" ");
//		}
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//6. 입력받은 정수까지 펙토리얼 값을 구하세요. 펙토리얼) 5! = 5 x 4 x 3 x 2 x 1
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력>");
		int num=sc.nextInt();
		for(int i=num-1;i>0;i--) {
			num*=i;
		}
		System.out.println(num);
		sc.close();
	}
}
