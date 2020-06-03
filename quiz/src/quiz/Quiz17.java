package quiz;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		int num=0,count=1,result=0;
		Scanner sc=new Scanner(System.in);
		//1. 1~입력받은 정수에서 3의 배수이거나, 4의 배수일 경우만 출력
		System.out.println("1. 정수입력");
		num=sc.nextInt();
		System.out.println("==1~입력받은 정수에서 3의 배수이거나, 4의 배수일 경우만 출력==");
		while(count<=num) {
			if(count%3==0||count%4==0) {
				System.out.println(count);
			}
			count++;
		}
		System.out.println("==============================");
		//2. 1~입력받은 정수까지 6의 배수의 합
		System.out.println("2. 정수입력");
		num=sc.nextInt();
		count=1;
		while(count<=num) {
			if(count%6==0) {
				result+=count;
			}
			count++;
		}
		System.out.println("1~입력받은 정수까지 6의 배수의 합 : "+result);
		System.out.println("==============================");
		//3. 1~100까지 정수중의 4의 배수이면서 8의 배수가 아닌 수의 갯수
		count=1;
		result=0;
		while(count<=100) {
			if(count%4==0&&count%8!=0) {
				result++;
			}
			count++;
		}
		System.out.println("1~100까지 정수중의 4의 배수이면서 8의 배수가 아닌 수의 갯수 : "+result);
		System.out.println("==============================");
		//4. 1000의 약수의 갯수를 구하세요.
		count=1;
		result=0;
		while(count<=1000) {
			if(1000%count==0) {
				result++;
			}
			count++;
		}
		System.out.println("1000의 약수의 갯수 : "+result);
		sc.close();
	}
}
