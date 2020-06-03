package jdbc.test;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		TotalMenu totalMenu=TotalMenu.getInstance();
		Scanner scanner=new Scanner(System.in);
		String key="";
		boolean ifLogin=false;
		end:while(true) {
			if(ifLogin) {
				totalMenu.boardMenu();
				key=scanner.next();
				switch (key) {
				case "1":
					totalMenu.boardList();
					break;
				case "2":
					totalMenu.boardView();
					break;
				case "3":
					totalMenu.boardWrite();
					break;
				case "4":
					totalMenu.boardDelete();
					break;
				case "5":
					ifLogin=totalMenu.logOut();
					break;
				case "6":
					ifLogin=totalMenu.deleteMem();
					break;
				case "7":
					System.out.println("프로그램을 종료합니다.");
					break end;
				default:
					System.out.println("잘 못 입력하였습니다. 다시 입력하세요.");
					break;
				}
			}else {
				totalMenu.loginMenu();
				key=scanner.next();
				switch (key) {
				case "1":
					ifLogin=totalMenu.login();
					break;
				case "2":
					totalMenu.registMem();
					break;
				case "3":
					System.out.println("프로그램을 종료합니다.");
					break end;
				default:
					System.out.println("잘 못 입력하였습니다. 다시 입력하세요.");
					break;
				}
			}
		}
		scanner.close();
		System.out.println("프로그램이 정상 종료되었습니다.");
	}

}
