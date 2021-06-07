package spms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>회원 등록</title></head>");
		out.println("<body><h1>회원 등록</h1>");
		out.println("<form action='add' method='post'>");
		out.println("이름:<input type='text' name='name'><br>");
		out.println("이메일: <input type='text' name ='email'><br>");
		out.println("암호: <input type='password' name='password'><br>");
		out.println("<input type='submit' value='추가'>");
		out.println("<input type='reset' value='취소'>");
		out.println("</form>");
		out.println("</body></html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		Connection conn =null;
		PreparedStatement stmt = null;
		try {
			ServletContext sc =this.getServletContext();
			Class.forName(sc.getInitParameter("driver"));
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/webdb","webuser","web1234");
			stmt= conn.prepareStatement("insert into members(email,pwd,mname,cre_datetime,mod_datetime)" 
					+"values(?,?,?,now(),now())");
			int pstmtint=0;
			stmt.setString(++pstmtint, req.getParameter("email"));
			stmt.setString(++pstmtint, req.getParameter("password"));
			stmt.setString(++pstmtint, req.getParameter("name"));
			stmt.executeUpdate();
			
			res.setContentType("text/html; charset=utf-8");
			PrintWriter out = res.getWriter();
			out.println("<html><head><title>회원등록결과</title>");
			out.println("<meta http-equiv='refresh' content='1;url=list'>");			
			//out.println("<script>location.href='list';</script>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>등록 성공입니다!</p>");
			out.println("</body></html>");
			res.sendRedirect("list");
			//res.addHeader("refresh","");
			
 		}catch(Exception e) {
			throw new ServletException(e);
		}finally {
			try {if(stmt!= null) stmt.close();}catch(Exception e) {}
			try {if(conn!= null) conn.close();}catch(Exception e) {}
		}
	}

}
