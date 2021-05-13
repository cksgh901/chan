package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class MemberDAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pstmt;
	
	//생성자 : db연결 , statement객체  생성
	public MemberDAO() {

		try {
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/javadb", "javadb", "javadb1234");
			//conn = DriverManager.getConnection("jdbcDriver");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	//등록
	public int insert(MemberVO vo) throws Exception {
		String sql ="INSERT INTO member";
		sql += "(title,content,regdate)";
		sql += "VALUES";
		sql += "('"+vo.getId()+"','"+vo.getPwd()+"',NOW())";
		int r = stmt.executeUpdate(sql); // 처리된 갯수 리턴
		return r;
	}
	// PreparedStatment 사용
	public int insert2(MemberVO vo) throws Exception {
		String sql ="INSERT INTO member";
		sql += "(id,pwd,name,email)";
		sql += "VALUES";
		sql += "(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql); //sql 준비
		//값 대입
		pstmt.setString(1, vo.getId());
		pstmt.setInt(2, vo.getMemno());
		pstmt.setString(3, vo.getPwd());
		pstmt.setString(4, vo.getName());
		pstmt.setString(5, vo.getEmail());
		// 실행
		
		int r = pstmt.executeUpdate(); // 처리된 갯수 리턴
		return r;
	}
	
	//상세
	public MemberVO selectOne(String id,String pwd) throws Exception {
		rs = stmt.executeQuery("SELECT * FROM member WHERE id ="+id "AND pwd="+pwd);
		MemberVO vo = null;
		if(rs.next()) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setMemno(rs.getInt("memno"));
			vo.setPwd(rs.getString("pwd"));
			vo.setName(rs.getString("name"));
			vo.setEmail(rs.getString("email"));
		}
		return vo;
	}
	
	//목록
	public List<MemberVO> select() throws Exception{
		rs = stmt.executeQuery("SELECT * FROM member ");
		List<MemberVO>list = new ArrayList<MemberVO>();
		MemberVO vo = null;
		while(rs.next()) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setPwd(rs.getString("pwd"));
			vo.setName(rs.getString("name"));
			vo.setEmail(rs.getString("email"));
			list.add(vo);
		}
		return list;
	}
	
	//수정
	public int update(MemberVO vo) throws Exception{
		return stmt.executeUpdate("UPDATE board SET title='"+vo.getTitle()+"',"+"content='"+vo.getContent()+"'"+"WHERE boardno="+vo.getBoardno());
	}
	//삭제
	public int delete(int boardno) throws Exception{
		return stmt.executeUpdate("DELETE FROM board WHERE boardno="+boardno);
	}
	
	public void close() {
		try {conn.close();} catch (Exception e) {}
		try {stmt.close();} catch (Exception e) {}
		try {rs.close();} catch (Exception e) {}
		
	}

}
