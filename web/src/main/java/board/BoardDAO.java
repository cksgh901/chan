package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BoardDAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	//생성자 : db연결 , statement객체  생성
	public BoardDAO() {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/javadb", "javadb", "javadb1234");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	//등록
	public int insert(BoardVO vo) throws Exception {
		String sql ="INSERT INTO board";
		sql += "(title,content,regdate)";
		sql += "VALUES";
		sql += "('"+vo.getTitle()+"','"+vo.getContent()+"',NOW())";
		int r = stmt.executeUpdate(sql); // 처리된 갯수 리턴
		return r;
	}
	
	//상세
	public BoardVO selectOne(int boardno) throws Exception {
		rs = stmt.executeQuery("SELECT * FROM board WHERE boardno ="+boardno);
		BoardVO vo = null;
		if(rs.next()) {
			vo = new BoardVO();
			vo.setBoardno(rs.getInt("boardno"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setRegdate(rs.getTimestamp("regdate"));
		}
		return vo;
	}
	
	//목록
	public List<BoardVO> select() throws Exception{
		rs = stmt.executeQuery("SELECT * FROM board ORDER BY regdate DESC");
		List<BoardVO>list = new ArrayList<BoardVO>();
		BoardVO vo = null;
		while(rs.next()) {
			vo = new BoardVO();
			vo.setBoardno(rs.getInt("boardno"));
			vo.setTitle(rs.getString("title"));
			vo.setContent(rs.getString("content"));
			vo.setRegdate(rs.getTimestamp("regdate"));
			list.add(vo);
		}
		return list;
	}
	
	//수정
	public int update(BoardVO vo) throws Exception{
		return stmt.executeUpdate("UPDATE "
									+ "board SET title='"+vo.getTitle()+"', "
									+ "content='"+vo.getContent()+"' "
									+ "WHERE boardno="+vo.getBoardno());
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
