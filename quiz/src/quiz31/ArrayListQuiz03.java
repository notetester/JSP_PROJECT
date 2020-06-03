package quiz31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<User> list=new ArrayList<User>();
		while(true) {
			System.out.println("[ 1.등록 | 2.회원정보보기 | 3.회원정보검색 | 4.회원정보삭제 | 5.종료 ]");
			System.out.println("메뉴를 입력>");
			try{
			int menu=scan.nextInt();
			if(menu==1) {
				//스캐너로 이름, 나이를 입력받고 User에 저장, 리스트에 추가
				System.out.print("이름을 입력해주세요. >");
				String name=scan.next();
				System.out.print("나이를 입력해주세요. >");
				int age=scan.nextInt();
				list.add(new User(name,age));
				System.out.println("정상 등록되었습니다.");
			}else if(menu==2) {
				//list에 길이만큼 회전하면서 User 객체의 이름, 나이를 순서대로 출력
				for(int i=0;i<list.size();i++) {
					System.out.println("==========="+(i+1)+"번째 회원 정보============");
					System.out.println("이름 : "+list.get(i).getName());
					System.out.println("나이 : "+list.get(i).getAge());
					System.out.println("=================================");
				}
			}else if(menu==3) {
				//찾을 이름을 입력받습니다. 이름이 있다면, 이름과 나이를 출력합니다.
				//찾는 이름이 없다면 "~~님은 목록에 없습니다."
				System.out.print("찾는 이름을 입력해주세요. >");
				String name=scan.next();
				boolean search=false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						search=true;
						System.out.println("==========="+(i+1)+"번째 회원 정보============");
						System.out.println("이름 : "+list.get(i).getName());
						System.out.println("나이 : "+list.get(i).getAge());
						System.out.println("=================================");
					}
				}
				if(!search) {
					System.out.println(name+"님은 목록에 없습니다.");
				}
			}else if(menu==4) {
				//삭제할 이름을 입력받습니다. 입력받은 이름과 동일하다면 User 객체를 삭제.
				System.out.print("삭제할 이름을 입력해주세요. >");
				String name=scan.next();
				boolean search=false;
				for(int i=0;i<list.size();i++) {
					if(list.get(i).getName().equals(name)) {
						search=true;
						System.out.println("==========="+(i+1)+"번째 회원 정보============");
						System.out.println("이름 : "+list.get(i).getName());
						System.out.println("나이 : "+list.get(i).getAge());
						System.out.println("=================================");
						System.out.println("위 회원 정보를 삭제합니다.");
						list.remove(i);
						break;
					}
				}
				if(!search) {
					System.out.println(name+"님은 목록에 없습니다.");
				}
			}else if(menu==5) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
			}catch(Exception e) {
				System.out.println("정수만 입력하세요.");
				scan.next();
			}
		}
		scan.close();
	}

}
