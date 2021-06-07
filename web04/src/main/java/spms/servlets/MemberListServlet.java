package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest req ,HttpServletResponse res) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			ServletContext sc =this.getServletContext();
			Class.forName(sc.getInitParameter("driver"));
			conn = DriverManager.getConnection(sc.getInitParameter("url"),
					sc.getInitParameter("username"),
					sc.getInitParameter("password"));
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from members order by mno asc");
					res.setContentType("text/html; charset=utf-8");
							PrintWriter out = res.getWriter();
							out.println("<html><head><title>회원목록</title></head>");
							out.println("<style>");
							out.println("table , td { border:1px solid black; padding: 0px; }");
							out.println("</style>");
							
							out.println("<body><h1>회원목록</h1>");
							out.println("<hr>");
							out.println("<p><a href='add'>신규 회원</a></p>");
							out.println("<table>");
							out.println("<tr>");							
							out.println("<td>번호</td>");							
							out.println("<td>이름</td>");							
							out.println("<td>이메일</td>");							
							out.println("<td>가입일</td>");							
							out.println("<td></td>");	
							out.println("</tr>");
							while(rs.next()) {
								out.println("<tr>");	
								out.println(
									"<td>"+rs.getInt("mno")+"</td>"+"<td>"+"<a href='update?no="+rs.getInt("mno")+"'>"+
									rs.getString("mname")+"</a>"+"</td>"+
									"<td>"+rs.getString("email")+"</td>"+
									"<td>"+rs.getDate("cre_datetime")+"</td>"+
									"<td>"+"<a href='delete?no="+rs.getInt("mno")+"'>[삭제]</a></td>");
									
						  }
							out.println("</tr>");							
							out.println("</table>");
						out.println("</body></html>");
															
		} catch (Exception e) {
			throw new ServletException(e);
		} finally {
			try {if(rs!= null) rs.close();}catch(Exception e) {}
			try {if(stmt!= null) stmt.close();}catch(Exception e) {}
			try {if(conn!= null) conn.close();}catch(Exception e) {}
		}
		
	}
					
}

	
