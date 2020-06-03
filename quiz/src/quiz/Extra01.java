package quiz;

import java.util.Scanner;

public class Extra01 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수입력>");
		int num=sc.nextInt();
		while(num!=50) {
			while(num>50) {
				num--;
			}
			while(num<50) {
				num++;
			}
		}
		System.out.println(num);
		sc.close();
	}
	
	
	
	
	
}
