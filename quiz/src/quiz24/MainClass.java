package quiz24;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		IBag bag=new Bag();
		int button=0;
		while(true) {
			System.out.println("==================");
			System.out.println("메뉴");
			System.out.println("1. 저장");
			System.out.println("2. 출력");
			System.out.println("3. 검색");
			System.out.println("4. 삭제");
			System.out.println("5. 종료");
			System.out.println("==================");
			if(sc.hasNextInt()) {
				button=sc.nextInt();
				if(button<1||button>5) {
					System.out.println("1,2,3,4,5중 하나만을 입력해주세요.");
				}else if(button==1) {
					System.out.println("추가할 물건을 입력해주세요.");
					System.out.print("물건>");
					bag.insert(sc.next());
					System.out.println("정상적으로 추가되었습니다.");
				}else if(button==2) {
					bag.print();
				}else if(button==3) {
					System.out.println("찾는 물건을 입력해주세요.");
					System.out.print("물건>");
					button=bag.search(sc.next());
					if(button==-1) {
						System.out.println("찾는 물건이 없습니다.");
					}else {
						System.out.println(button+"번째에 찾는 물건이 있습니다.");						
					}
				}else if(button==4) {
					System.out.println("삭제할 물건을 입력해주세요.");
					System.out.print("물건>");
					if(bag.delete(sc.next())) {
						System.out.println("해당 물건을 정상적으로 삭제하였습니다.");
					}else {
						System.out.println("해당 물건이 존재하지 않습니다.");
					}
				}else if(button==5) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}else {
				System.out.println("1,2,3,4,5중 하나만을 입력해주세요.");
				sc.next();
			}
		}
		sc.close();
	}

}
