package quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		//quiz04
//		int num=0;
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수를 입력하세요>");
//		num=sc.nextInt();
//		String result=(num%2==0)?"짝수":"홀수";
//		System.out.println("입력받은 수는 : "+result);
//		sc.close();
		double cm=0L;
		int age=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요.");
		System.out.print("키 : ");
		cm=sc.nextDouble();
		System.out.print("나이 : ");
		age=sc.nextInt();
		System.out.println("==========================");
		if(cm>=140&&age>=8) {
			System.out.println("놀이기구 탑승이 가능합니다.");
		}else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
		sc.close();
	}
}
