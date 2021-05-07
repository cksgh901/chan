package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseEx {

	public static void main(String[] args) {
		//데이터베이스 접속(connection)객체 생성
		Connection conn = null;
		//SQL을 실행하기위한 객체 선언
		Statement stmt = null;
		//SQL 실행 결과를 담을 객체 선언
		ResultSet rs = null;
		
		try {
			//1. 드라이버 로드
			Class.forName("org.mariadb.jdbc.Driver");
			//2. DB접속
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/javadb",
					"root",
					"root1234");
			//3.Statement 객체 생성
			stmt = conn.createStatement();
			//4.SQL 실행 ->결과처리
			rs = stmt.executeQuery("select * from student");
			//stmt.executeUpdate() ->Insert , Update , delete
			//5.결과 출력
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			
			/*
			 DB 처리 순서
			 1. 드라이버(클래스) 로드
			 2. DB에 접속(host , ip , id , pwd, db명)
			 3. SQL 실행할 객체
			 4. SQL 실행
			 5. SQL 실행결과 처리
			 6/ close();
			 */
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		} finally {
			try {conn.close();}catch(Exception e) {}
			try {stmt.close();}catch(Exception e) {}
			try {rs.close();}catch(Exception e) {}
		}
		
		}

	}


