package quiz;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		//IfEx02와 구문이 동일하게 실행되도록 switch구문으로 변경
		int point=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("점수>");
		while(true) {
			try{
				point=scan.nextInt();
			}catch(Exception e){
				System.out.println("정수로만 입력하세요.");
				scan.next();
				continue;
			}
			break;
		}
		switch (point/10) {
		case 10:
			switch(point) {
			case 100:
				System.out.println("A+학점");
				break;
			default:
				System.out.println("잘못된 점수 입니다.");
				break;
			}
		case 9:
			switch(point) {
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
				System.out.println("A+학점");
				break;
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
				System.out.println("A학점");
				break;
			default:break;
			}
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("F학점");
			break;
		case 0:
			switch(point) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("F학점");
				break;
			case -1:
			case -2:
			case -3:
			case -4:
			case -5:
			case -6:
			case -7:
			case -8:
			case -9:
				System.out.println("잘못된 점수 입니다.");
				break;
			default:break;
			}
			break;
		default:
			System.out.println("잘못된 점수 입니다.");
			break;
		}
		scan.close();
	}
}
