package quiz23;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 인터페이스형으로 선언하고 무한반복문 안에서,
		 * 음악을 추가하는 기능,
		 * 재생기능,
		 * 종료기능
		 */
		Scanner sc=new Scanner(System.in);
		SongList song=new MelonMusic();
		int button=0;
		while(true) {
			System.out.println("================");
			System.out.println("메뉴");
			System.out.println("1. 음악추가");
			System.out.println("2. 재생");
			System.out.println("3. 종료");
			System.out.println("================");
			if(sc.hasNextInt()) {
				button=sc.nextInt();
				if(button<1||button>3) {
					System.out.println("1,2,3중 하나만을 입력해주세요.");
				}else if(button==1) {
					System.out.println("추가할 음악 제목을 입력해주세요.");
					System.out.print("제목>");
					song.insertList(sc.next());
					System.out.println("정상적으로 추가되었습니다.");
				}else if(button==2) {
					song.playList();
				}else if(button==3) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}else {
				System.out.println("1,2,3중 하나만을 입력해주세요.");
				sc.next();
			}
		}
		sc.close();
	}

}
