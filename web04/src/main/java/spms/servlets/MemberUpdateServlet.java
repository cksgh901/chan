package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/update"
//		urlPatterns = {"/member/update"},
//		initParams = {
//				@WebInitParam(name="driver", value="com.mysql.jdbc.Driver"),
//				@WebInitParam(name="url", value="jdbc:mysql://localhost:3307/webdb"),
//				@WebInitParam(name="username", value="webuser"),
//				@WebInitParam(name="password", value="web1234")
//			} 
		)

public class MemberUpdateServlet extends HttpServlet {
	@Override
	protected void doGet(
			HttpServletRequest req ,HttpServletResponse res)throws ServletException,IOException{
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
			rs = stmt.executeQuery("select mno,email,mname,cre_datetime from members where mno="+req.getParameter("no"));
			rs.next();
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<style>");
			out.println("table{\r\n"
					+ "	table-layout: fixed;\r\n"
					+ "	border: 3px black;\r\n"
					);
			out.println("</style>");
			out.println("<html><head><title>회원 정보</title></head>");
			out.println("<body><h1>회원 정보</h1>");
			out.println("<table>");				
			out.println("<tr>");
			out.println("<form action='update' method='post'>");
			out.println("<td>번호: <input type='text' name='no' value='"+req.getParameter("no")+"'readonly></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>이름: <input type='text' name='name' value='"+rs.getString("mname")+"'></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>이메일: <input type='text' name='email' value='"+rs.getString("email")+"'></td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>가입일:" + rs.getDate("cre_datetime")+"</td>");
			out.println("</tr>");
			out.println("</table>");				

			out.println("<input type='submit' value='저장'>");				
			out.println("<input type='button' value='삭제'"+"onclick='location.href=\"delete?no="+rs.getInt("mno")+"\"'>");			
			out.println("<input type='button' value='취소'"+"onclick='location.href=\"list\"'>");			
			out.println("</form>");			
			out.println("</body></html>");			
		}catch(Exception e) {
			throw new ServletException(e);
		}finally {
			try {if(rs!= null) rs.close();}catch(Exception e) {}
			try {if(stmt!= null) stmt.close();}catch(Exception e) {}
			try {if(conn!= null) conn.close();}catch(Exception e) {}
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		Connection conn =null;
		PreparedStatement stmt = null;
		try {
			ServletContext sc =this.getServletContext();
			Class.forName(sc.getInitParameter("driver"));
			conn = DriverManager.getConnection(sc.getInitParameter("url"),
					sc.getInitParameter("username"),
					sc.getInitParameter("password"));
			stmt = conn.prepareStatement("update members set email=?,mname=?,mod_datetime=now() where mno=?");
			stmt.setString(1, req.getParameter("email"));
			stmt.setString(2, req.getParameter("name"));
			stmt.setInt(3, Integer.parseInt(req.getParameter("no")));
			stmt.executeUpdate();
			res.sendRedirect("list");
	}catch(Exception e) {
		throw new ServletException(e);
	}finally {
		try {if(stmt!= null) stmt.close();}catch(Exception e) {}
		try {if(conn!= null) conn.close();}catch(Exception e) {}
	}
	

}
}
