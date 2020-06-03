package itkorea;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Admin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		HashMap<String,String> member=new HashMap<>();
		HashMap<String,String> password=new HashMap<>();
		String key="",id="",pw="",ans="";
		end:while(true) {
			System.out.println("------회원 관리------");
			System.out.println("1. 회원 등록");
			System.out.println("2. 모든 회원정보 확인");
			System.out.println("3. 회원정보 검색");
			System.out.println("4. 비밀번호 찾기");
			System.out.println("5. 프로그램 종료");
			System.out.print("메뉴 입력>");
			key=scanner.next();
			switch (key) {
			case "1":
				System.out.print("신규 등록할 회원의 아이디를 입력하세요. >");
				id=scanner.next();
				if(member.containsKey(id)) {
					System.out.println("이미 등록된 아이디입니다.");
				}else {
					System.out.print("신규 등록할 회원의 비밀번호를 입력하세요. >");
					pw=scanner.next();
					member.put(id,pw);
					System.out.println("비밀번호 분실시 찾기 위한 질문에 대한 답을 입력하세요.");
					System.out.print("좋아하는 색깔은? >");
					ans=scanner.next();
					password.put(ans,pw);
					System.out.println("정상 등록되었습니다.");
				}
				break;
			case "2":
				if(member.isEmpty()) {
					System.out.println("등록된 회원이 없습니다.");
				}else {
					System.out.println("==========================");
					System.out.println("아이디\t||비밀번호");
					System.out.println("==========================");
					Set<Entry<String,String>>memberViewer=member.entrySet();
					for(Entry<String,String>memberView:memberViewer) {
						System.out.println(memberView.getKey()+"\t||"+memberView.getValue());
					}
					System.out.println("==========================");
				}
				break;
			case "3":
				System.out.print("찾으시는 회원의 아이디를 입력하세요. >");
				id=scanner.next();
				if(member.containsKey(id)) {
					System.out.println("==========================");
					System.out.println("아이디\t||비밀번호");
					System.out.println("==========================");
					System.out.println(id+"\t||"+member.get(id));
					System.out.println("==========================");
				}else {
					System.out.println("찾으시는 회원이 없습니다.");
				}
				break;
			case "4":
				System.out.print("비밀번호를 찾으시는 회원의 아이디를 입력하세요. >");
				id=scanner.next();
				if(member.containsKey(id)) {
					System.out.print("좋아하는 색깔은? >");
					ans=scanner.next();
					if(password.containsKey(ans)&&password.get(ans).equals(member.get(id))) {
						System.out.println("정답입니다.");
						System.out.println("찾으시는 비밀번호는");
						System.out.println(member.get(id));
						System.out.println("입니다.");
					}else {
						System.out.println("틀렸습니다.");
					}
				}else {
					System.out.println("찾으시는 회원이 없습니다.");
				}
				break;
			case "5":
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
