package mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SampleControoler extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		process(req, res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		process(req, res);
	}
	
	void process(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		//파라미터
		String type =req.getParameter("type");
		String view = "/sample/index.jsp";
		//로직 처리
		String result = "";
		// type이 1이면 
		if("1".equals(type)) {
			result ="안녕하세요";
			// type이 2이면 
		}else if("2".equals(type)) {
			result = "반갑습니다.";
			view = "/sample/index2.jsp";
		}
		//결과를 request 저장
		req.setAttribute("result", result);
		//jsp로 포워딩
		RequestDispatcher disp= req.getRequestDispatcher(view);
		disp.forward(req, res);// 실제포워딩
	}
	

}
