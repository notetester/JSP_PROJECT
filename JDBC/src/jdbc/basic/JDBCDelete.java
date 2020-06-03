package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCDelete {

	public static void main(String[] args) {
		//회원 아이디를 받아서 해당 아이디를 삭제하는 JDBC 코드를 완성.
		Scanner scanner=new Scanner(System.in);
		System.out.print("삭제할 아이디를 입력하세요.>");
		String id=scanner.next();
		// 1. DB 연결에 필요한 접속 정보를 선언
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid="TEST01";
		String upw="TEST01";
		String sql="delete member01 where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//2. JDBC 드라이버 호출
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//3. 커넥션 생성
			conn=DriverManager.getConnection(url,uid,upw);
			//4. SQL문 전달 객체 PSTMT 생성
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id);
			//5. SQL문 실행
			int result=pstmt.executeUpdate();
			if(result==1) {
				System.out.println("회원 아이디가 정상적으로 삭제되었습니다.");
			}else {
				System.out.println(id+"를 확인하세요.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) {conn.close();}
				if(pstmt!=null) {pstmt.close();}
				scanner.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
