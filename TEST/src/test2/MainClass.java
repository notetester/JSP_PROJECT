package test2;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
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
