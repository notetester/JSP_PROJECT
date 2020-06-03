package quiz;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		//1~부터 입력받은 수 까지의 약수들의 합.
		int num=0,count=1,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력");
		num=sc.nextInt();
		while(count<=num) {
			if(num%count==0) {
				result+=count;
			}
			count++;
		}
		System.out.println("1~부터 입력받은 수 까지의 약수들의 합 : "+result);
		sc.close();
	}
}
