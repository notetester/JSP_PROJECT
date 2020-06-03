package jdbc.basic;

import java.sql.*;
import java.util.Scanner;

public class JDBCSelect2 {

	public static void main(String[] args) {
		/*
		 * 회원 ID를 입력받아서 해당 ID의 회원 정보를 모두 출력하는 JDBC 코드를 작성
		 */
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid="TEST01";
		String upw="TEST01";
		Scanner scanner=new Scanner(System.in);
		System.out.println("찾는 아이디를 입력하세요.");
		String search=scanner.next();
		String sql="select * from member01 where id='"+search+"' order by id desc";
		scanner.close();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,uid,upw);
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String id=rs.getString("ID");
				String pw=rs.getString("PW");
				String name=rs.getString("NAME");
				String email=rs.getString("EMAIL");
				String address=rs.getString("ADDRESS");
				System.out.println(id);
				System.out.println(pw);
				System.out.println(name);
				System.out.println(email);
				System.out.println(address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {conn.close();}
				if(pstmt!=null) {pstmt.close();}
				if(rs!=null) {rs.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
