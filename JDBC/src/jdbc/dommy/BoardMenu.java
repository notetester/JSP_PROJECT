package jdbc.dommy;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import jdbc.test.Mem;

public class BoardMenu {
	private static final String URL="jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static final String UID="TEST01";
	private static final String UPW="TEST01";
	private static Connection conn=null;
	private static PreparedStatement pstmt=null;
	private static ResultSet rs=null;
	private static Mem loginMem=null;
	private static int count=0,temp=0;
	private static String id="",pw="",name="",info="",sql="";
	private static final Scanner SCANNER=new Scanner(System.in);
	private static HashMap<String,String>MEMBERMAP=new HashMap<String,String>();
	private static ArrayList<Mem>MEMBERLIST=new ArrayList<>();
	private static final BoardMenu BOARDMENU=new BoardMenu();
	public static final BoardMenu getInstance() {return BOARDMENU;}
	private BoardMenu() {
		sql="select * from board";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL,UID,UPW);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				id=rs.getString("ID");
				pw=rs.getString("PW");
				name=rs.getString("NAME");
				info=rs.getString("INFO");
				Mem member=new Mem(id,pw,name,info);
				MEMBERLIST.add(member);
				MEMBERMAP.put(id,pw);
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public final int getCount() {
		return count;
	}

	public final ArrayList<Mem> getMEMBERLIST() {
		return MEMBERLIST;
	}
	
	public final HashMap<String, String> getMEMBERMAP() {
		return MEMBERMAP;
	}
	
	public final Mem getLoginMem() {
		return loginMem;
	}
	
	public final void loginMenu() {
		System.out.println("===================");
		System.out.println("1. 게시판 글 목록");
		System.out.println("2. 게시판 글 보기");
		System.out.println("3. 게시판 글 쓰기");
		System.out.println("4. 게시판 글 삭제");
		System.out.println("5. 게시판 글 좋아요 하기");
		System.out.println("6. 게시판 댓글 좋아요 하기");
		System.out.println("7. 로그 아웃");
		System.out.println("8. 회원 탈퇴");
		System.out.println("9. 종료");
		System.out.println("===================");
	}
	
	public final boolean doLogin() {
		System.out.println("아이디를 입력하세요.");
		id=SCANNER.next();
		System.out.println("비밀번호를 입력하세요");
		pw=SCANNER.next();
		sql="select * from mem where id=? and pw=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			rs=pstmt.executeQuery();
			temp=0;
			while(rs.next()) {
				id=rs.getString("ID");
				pw=rs.getString("PW");
				name=rs.getString("NAME");
				info=rs.getString("INFO");
				temp++;
			}
			if(temp==1) {
				loginMem=new Mem(id,pw,name,info);
				System.out.println("로그인 성공");
				return true;
			}else {
				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public final void registMem() {
		System.out.println("신규 등록할 회원의 아이디를 입력하세요.");
		id=SCANNER.next();
		if(MEMBERMAP.containsKey(id)) {
			System.out.println("이미 등록된 아이디입니다.");
		}else {
			System.out.println("신규 등록할 회원의 비밀번호를 입력하세요.");
			pw=SCANNER.next();
			System.out.println("신규 등록할 회원의 이름을 입력하세요.");
			name=SCANNER.next();
			System.out.println("신규 등록할 회원의 정보를 입력하세요.");
			info=SCANNER.next();
			sql="insert into mem values(?,?,?,?)";
			try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,id);
				pstmt.setString(2,pw);
				pstmt.setString(3,name);
				pstmt.setString(4,info);
				temp=pstmt.executeUpdate();
				if(temp==1) {
					Mem member=new Mem(id,pw,name,info);
					MEMBERLIST.add(member);
					MEMBERMAP.put(id,pw);
					count++;
					System.out.println("회원 가입 성공");
				}else {
					System.out.println("회원 가입 실패");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}