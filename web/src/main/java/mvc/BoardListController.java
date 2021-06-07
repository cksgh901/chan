package mvc;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BoardListController implements Command {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("name", "목록");
		req.setAttribute("text", "아아아");
	
		return "/sample/boardList.jsp";
		
	}

}
