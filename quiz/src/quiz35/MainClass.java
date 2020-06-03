package quiz35;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 1. List, Set, Map을 이용해서 간단한 관리 프로그램을 정합니다.
		 * (도서관리, 회원관리, 예약관리, 물품관리 등등)
		 * 2. 인터페이스를 반드시 하나 이상 사용합니다.
		 * 3. 기능은 3개 이상 생성.
		 * 4. 클래스를 사용하면 됩니다.
		 */
		Admin admin=Admin.getInstance();
		Scanner scanner=new Scanner(System.in);
		String key="";
		end:while(true) {
			Member.menu();
			key=scanner.next();
			switch (key) {
			case "1":
				admin.register();
				break;
			case "2":
				admin.view();
				break;
			case "3":
				admin.search();
				break;
			case "4":
				admin.modify();
				break;
			case "5":
				admin.delete();
				break;
			case "6":
				admin.test();
				break;
			case "7":
				System.out.println("프로그램을 종료합니다.");
				break end;
			default:
				System.out.println("잘 못 입력하였습니다. 다시 입력하세요.");
				break;
			}
		}
		scanner.close();
		System.out.println("프로그램이 정상 종료되었습니다.");
	}

}
