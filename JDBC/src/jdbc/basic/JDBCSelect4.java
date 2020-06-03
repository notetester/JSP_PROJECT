package jdbc.basic;

import java.util.ArrayList;
import java.util.Scanner;

import jdbc.command.*;

import java.sql.*;

public class JDBCSelect4 {

	public static void main(String[] args) {
		//조인에 대한 처리
		ArrayList<Board01>list=new ArrayList<>();
		MemberBoard mb=new MemberBoard();
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디>");
		String search=scanner.next();
		// 1. DB 연결에 필요한 접속 정보를 선언
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid="TEST01";
		String upw="TEST01";
		String sql="SELECT M.ID,\r\n" + 
				"        M.PW,\r\n" + 
				"        M.NAME,\r\n" +
				"        M.EMAIL,\r\n" + 
				"        M.ADDRESS,\r\n" + 
				"        B.NUM,\r\n" + 
				"        B.TITLE,\r\n" + 
				"        B.CONTENT\r\n" + 
				"FROM MEMBER01 M\r\n" + 
				"JOIN BOARD01 B\r\n" + 
				"ON M.ID=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,uid,upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,search);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				//회원에 대한 정보
				String id=rs.getString("ID");
				String pw=rs.getString("PW");
				String name=rs.getString("NAME");
				String email=rs.getString("EMAIL");
				String address=rs.getString("ADDRESS");
				//글에 대한 정보
				int num=rs.getInt("num");
				String title=rs.getString("TITLE");
				String content=rs.getString("CONTENT");
				mb.setId(id);
				mb.setPw(pw);
				mb.setName(name);
				mb.setEmail(email);
				mb.setAddress(address);
				Board01 board=new Board01(num,null,title,content);
				list.add(board);
			}
			mb.setList(list);
			System.out.println("이름 : "+mb.getName());
			System.out.println("아이디 : "+mb.getId());
			System.out.println("이메일 : "+mb.getEmail());
			System.out.println("주소 : "+mb.getAddress());
			System.out.println("크기 : "+mb.getList().size());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {conn.close();}
				if(pstmt!=null) {pstmt.close();}
				if(rs!=null) {rs.close();}
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
