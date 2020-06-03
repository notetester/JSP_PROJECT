package test2;

public interface Member {
	static void menu() {
		System.out.println("------회원 관리------");
		System.out.println("1. 신규 회원 등록");
		System.out.println("2. 전체 회원 목록 보기");
		System.out.println("3. 회원 검색");
		System.out.println("4. 회원 수정");
		System.out.println("5. 회원 삭제");
		System.out.println("6. 로그인 테스트");
		System.out.println("7. 프로그램 종료");
		System.out.print("메뉴 입력>");
	}
	void register();
	void view();
	void search();
	void modify();
	void delete();
	void test();
}
