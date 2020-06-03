package jdbc.basic;

import java.util.ArrayList;
import java.util.Scanner;
import java.sql.*;
import jdbc.command.Board01;

public class JDBCSelect3 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("조회할 시작 데이터 행 : ");
		String start=scanner.next();
		System.out.print("조회할 끝 데이터 행 : ");
		String end=scanner.next();
		// 1. DB 연결에 필요한 접속 정보를 선언
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String uid="TEST01";
		String upw="TEST01";
		String sql="SELECT *\r\n" + 
				"FROM(SELECT ROWNUM AS RN,\r\n" + 
				"            NUM,\r\n" + 
				"            ID,\r\n" + 
				"            TITLE,\r\n" + 
				"            CONTENT\r\n" + 
				"    FROM(SELECT NUM,\r\n" + 
				"                ID,\r\n" + 
				"                TITLE,\r\n" + 
				"                CONTENT\r\n" + 
				"        FROM BOARD01\r\n" + 
				"        ORDER BY NUM DESC\r\n" + 
				"    )\r\n" + 
				")\r\n" + 
				"WHERE RN>? AND RN<=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		ArrayList<Board01> arrayList=new ArrayList<Board01>();
		try {
			/*
			 * 조회한 데이터를 출력, Board01 클래스를 생성해서 순서대로 저장하는 JDBC코드를 완성하세요.
			 */
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(url,uid,upw);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,start);
			pstmt.setString(2,end);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String rn=rs.getString("RN");
				String num=rs.getString("NUM");
				String id=rs.getString("ID");
				String title=rs.getString("TITLE");
				String content=rs.getString("CONTENT");
				System.out.println("-------------------------");
				System.out.println(rn);
				System.out.println(num);
				System.out.println(id);
				System.out.println(title);
				System.out.println(content);
				Board01 board01=new Board01(rn,num,id,title,content);
				arrayList.add(board01);
			}
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
