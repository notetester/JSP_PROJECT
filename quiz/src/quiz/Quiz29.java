package quiz;

import java.util.Scanner;

public class Quiz29 {
	public static void main(String[] args) {
		//가로, 세로를 입력 받습니다.
		//가로 길이, 세로 길이의 사각형을 출력하면 됩니다.
		//단, 윤곽만 나타나도록 처리를 합니다.
		Scanner sc=new Scanner(System.in);
		System.out.print("가로>");
		int garo=sc.nextInt();
		System.out.print("세로>");
		int sero=sc.nextInt();
		for(int i=0;i<sero;i++) {
			for(int j=0;j<garo;j++) {
				if(i==0||i==sero-1||j==0||j==garo-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
