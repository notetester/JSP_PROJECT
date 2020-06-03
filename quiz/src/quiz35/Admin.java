package quiz35;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Admin implements Member{
	
	private static final Scanner SCANNER=new Scanner(System.in);
	private static final HashMap<String,String>MEM=new HashMap<String,String>();
	private static String id="",pw="";
	private Admin() {}
	private static final Admin ADMIN=new Admin();
	public static final Admin getInstance() {
		return ADMIN;
	}

	@Override
	public void register() {
		System.out.print("신규 등록할 회원의 아이디를 입력하세요. >");
		id=SCANNER.next();
		if(MEM.containsKey(id)) {
			System.out.println("이미 등록된 아이디입니다.");
		}else {
			System.out.print("신규 등록할 회원의 비밀번호를 입력하세요. >");
			pw=SCANNER.next();
			MEM.put(id,pw);
			System.out.println("정상 등록되었습니다.");
		}
	}

	@Override
	public void view() {
		if(MEM.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			System.out.println("==========================");
			System.out.println("아이디\t||비밀번호");
			System.out.println("==========================");
			Set<Entry<String,String>>MEMViewer=MEM.entrySet();
			for(Entry<String,String>MEMView:MEMViewer) {
				System.out.println(MEMView.getKey()+"\t||"+MEMView.getValue());
			}
			System.out.println("==========================");
		}
	}

	@Override
	public void search() {
		System.out.print("찾으시는 회원의 아이디를 입력하세요. >");
		id=SCANNER.next();
		if(MEM.containsKey(id)) {
			System.out.println("==========================");
			System.out.println("아이디\t||비밀번호");
			System.out.println("==========================");
			System.out.println(id+"\t||"+MEM.get(id));
			System.out.println("==========================");
		}else {
			System.out.println("찾으시는 회원이 없습니다.");
		}
	}

	@Override
	public void modify() {
		System.out.print("비밀번호를 변경할 회원의 아이디를 입력하세요. >");
		id=SCANNER.next();
		if(MEM.containsKey(id)) {
			System.out.print("변경할 비밀번호를 입력하세요. >");
			pw=SCANNER.next();
			MEM.put(id,pw);
			System.out.println("정상 수정되었습니다.");
		}else {
			System.out.println("없는 회원입니다.");
		}
	}

	@Override
	public void delete() {
		System.out.print("삭제할 회원의 아이디를 입력하세요. >");
		id=SCANNER.next();
		if(MEM.containsKey(id)) {
			MEM.remove(id);
			System.out.println("정상 삭제되었습니다.");
		}else {
			System.out.println("없는 회원입니다.");
		}
	}

	@Override
	public void test() {
		System.out.print("아이디를 입력하세요. >");
		id=SCANNER.next();
		if(MEM.containsKey(id)) {
			System.out.print("비밀번호를 입력하세요. >");
			pw=SCANNER.next();
			if(MEM.get(id).equals(pw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호를 틀렸습니다.");
			}
		}else {
			System.out.println("없는 아이디입니다.");
		}
	}

}
