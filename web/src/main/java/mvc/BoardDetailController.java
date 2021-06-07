package mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardDetailController implements Command {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("name", "상세");
		return "/sample/boardDetail.jsp";
	}

}
