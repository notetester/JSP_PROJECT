package quiz34;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MenuManager {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//맵을 이용하는데 key : 메뉴이름 value : 가격
		HashMap<String,String> menuBoard=new HashMap<String,String>();
		String name="",price="";
		while(true) {
			System.out.println("------음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료
			System.out.print("메뉴 입력>");
			try {
				int menu=scan.nextInt();
				if(menu==1) {
					System.out.print("신규 등록할 메뉴를 입력하세요. >");
					name=scan.next();
					if(menuBoard.containsKey(name)) {
						System.out.println("이미 등록된 메뉴입니다.");
					}else {
						System.out.print("신규 등록할 메뉴의 가격을 입력하세요. >");
						price=scan.next();
						menuBoard.put(name, price);
						System.out.println("정상 등록되었습니다.");
					}
				}else if(menu==2) {
					if(menuBoard.isEmpty()) {
						System.out.println("등록된 메뉴가 없습니다.");
					}else {
						System.out.println("==========================");
						System.out.println("메뉴\t||가격");
						System.out.println("==========================");
						Set<Entry<String,String>>menuViewer=menuBoard.entrySet();
						for(Entry<String,String>menuView:menuViewer) {
							System.out.println(menuView.getKey()+"\t||"+menuView.getValue());
						}
						System.out.println("==========================");
					}
				}else if(menu==3) {
					System.out.print("가격을 변경할 메뉴를 입력하세요. >");
					name=scan.next();
					if(menuBoard.containsKey(name)) {
						System.out.print("변경할 가격을 입력하세요. >");
						price=scan.next();
						menuBoard.put(name, price);
						System.out.println("정상 수정되었습니다.");
					}else {
						System.out.println("없는 메뉴입니다.");
					}
				}else if(menu==4) {
					System.out.print("삭제할 메뉴를 입력하세요. >");
					name=scan.next();
					if(menuBoard.containsKey(name)) {
						menuBoard.remove(name);
						System.out.println("정상 삭제되었습니다.");
					}else {
						System.out.println("없는 메뉴입니다.");
					}
				}else if(menu==5) {
					break;
				}else {
					System.out.println("범위내의 수를 입력해주세요.");
				}
			}catch(Exception e) {
				scan.next();
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
		scan.close();
		System.out.println("프로그램을 종료합니다.");
	}

}
