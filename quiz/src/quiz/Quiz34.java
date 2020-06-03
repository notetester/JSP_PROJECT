package quiz;

import java.util.Scanner;

public class Quiz34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("금액을 투입해 주세요>");
		int mon=sc.nextInt();
		end:while(true) {
			System.out.println("남은 금액: "+mon+"원");
			System.out.println("[1]뎀이소다: 400원, [2]밀킥스: 500원, [3]코가골라: 600원, [4]잔돈 받기");
			System.out.print("음료수 선택>");
			switch (sc.nextInt()) {
			case 1:
				if(mon<400) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					break;
				}
				mon-=400;
				System.out.println("뎀이소다를 받았습니다.");
				break;
			case 2:
				if(mon<500) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					break;
				}
				mon-=500;
				System.out.println("밀킥스를 받았습니다.");
				break;
			case 3:
				if(mon<600) {
					System.out.println("금액이 부족합니다. 돈을 넣어 주세요!");
					break;
				}
				mon-=600;
				System.out.println("코가골라를 받았습니다.");
				break;
			case 4:
				System.out.println("남은 금액 "+mon+"원을 반환합니다.");
				break end;
			default:
				break;
			}
		}
		sc.close();
	}
}
