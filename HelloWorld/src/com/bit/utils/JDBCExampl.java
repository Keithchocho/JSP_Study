//JDBC를 이용한 데이터 베이스 접속 코드
package com.bit.utils;
import java.sql.*;
public class JDBCExampl {
	
	private static String dburl = "jdbc:oracle:thin@localhost:1521:orcl";
	private static String dbuser = "webdb";
	private static String dbpass = "webdb";
	
	
	public static void main(String[]args) {
		connectionTest();
		selectTest();
		
	}
	// SELECT
	private static void selectTest() {
		// webdb.emaillist 테이블에서 목록을 불러와서 출력
		Connection conn = null;
		Statement stmt = null; //SQL을 실행하기 위한 객체
		ResultSet rs = null; // SELECT의 결과 레코드 셋 객체
		
		try {
			// 드라이버 클래스 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 커넥션 얻기
			conn = DriverManager.getConnection(dburl, dbuser,dbpass);
			// 실행 객체 생성
			stmt = conn.createStatement();
			
			String sql = "SELECT no, last_name, first_name, FROM emaillist";
			// SQL 실행 후 결과 레코드 셋 얻기
			rs = stmt.executeQuery(sql);
			
//			System.out.println(rs);
			// 순환하면서 레코드 정보를 얻어오기
			while(rs.next()) {
				Integer no =rs.getInt(1); // 숫자 인덱스 1부터
				String lastName = rs.getString("lst_name");
				String firstName = rs.getString("first_name");
				String email = rs.getString("email");
				
				System.out.printf("%d: %s%s - %s%n", no, lastName, firstName, email);
			}
		} catch(ClassNotFoundException e) {
			
			System.err.println("드라이버 로드 실패!");
		} catch(SQLException e ) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	//접속	
	private static void connectionTest() {
		String dburl = "jdbc:oracle:thin@localhost:1521:orcl";
		String dbuser = "webdb";
		String dbpass = "webdb";
		
		Connection conn = null;
		
		try {
			// 드라이버 얻어내고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Connection을 받아오기
			conn = DriverManager.getConnection(dburl,dbuser,dbpass);
			System.out.println("연결 성공");
			System.out.println("연결 객체: " + conn);
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버를 찾지 못했습니다.");
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
			
	}
}
