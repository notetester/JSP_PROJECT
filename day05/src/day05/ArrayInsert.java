package day05;

//import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		//입력받는 순서대로 값을 저장
		Scanner scan=new Scanner(System.in);
		String [] arr=new String[100];
		int count=0;
		System.out.println("# 먹고 싶은 음식을 선택하세요!!");
		System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
		while(true) {
			System.out.print(">");
			String menu=scan.nextLine();
			if(menu.equals("그만")) {
				System.out.println("입력종료");
				break;
			}
			arr[count]=menu;
			count++;
		}
		//입력종료 후, 출력 조건
		System.out.println("--------------입력 받은 메뉴--------------");
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]+" ");
		}
		scan.close();
	}
}
