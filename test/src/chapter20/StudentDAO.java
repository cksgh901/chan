package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	//생성자 : db연결 , statement객체  생성
	StudentDAO() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/javadb", "root", "root1234");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	//등록
//	public int insert(StudentVo vo) throws Exception {
//		String sql ="INSERT INTO student";
//		sql += "(studno,name,id,grade,jumin)";
//		sql += "VALUES";
//		sql += "("+vo.getStudno()+",'"+vo.getName()+"','"+vo.getId()+"',";
//		sql += ""+vo.getGrade()+","+vo.getJumin()+")";
//		int r = stmt.executeUpdate(sql); // 처리된 갯수 리턴
//		return r;
//	}
	
	//상세
	public StudentVo selectOne(int studno) throws Exception {
		rs = stmt.executeQuery("SELECT * FROM student WHERE studno ="+studno);
		StudentVo vo = null;
		if(rs.next()) {
			vo = new StudentVo();
			vo.setStudno(rs.getInt("studno"));
			vo.setName(rs.getString("name"));
			vo.setId(rs.getString("id"));
			vo.setGrade(rs.getInt("grade"));
			vo.setJumin(rs.getString("jumin"));
		}
		return vo;
	}
	
	//목록
	public List<StudentVo> select() throws Exception{
		rs = stmt.executeQuery("SELECT * FROM student");
		List<StudentVo>list = new ArrayList<StudentVo>();
		StudentVo vo = null;
		while(rs.next()) {
			vo = new StudentVo();
			vo.setStudno(rs.getInt("studno"));
			vo.setName(rs.getString("name"));
			vo.setId(rs.getString("id"));
			vo.setGrade(rs.getInt("grade"));
			vo.setJumin(rs.getString("jumin"));
			list.add(vo);
		}
		return list;
	}
	
	//수정
	public int update(StudentVo vo) throws Exception{
		return stmt.executeUpdate("UPDATE "
									+ "student SET name='"+vo.getName()+"', "
									+ "id='"+vo.getId()
									+"', grade="+vo.getGrade()+", "
									+"jumin='"+vo.getJumin()+"' "
									+ "WHERE studno="+vo.getStudno());
	}
	
	public void close() {
		try {conn.close();} catch (Exception e) {}
		try {stmt.close();} catch (Exception e) {}
		try {rs.close();} catch (Exception e) {}
		
	}

}
