package mvc;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class controllerWithFile extends HttpServlet {
	
	// 1. 매핑객체 저장 <"boardList",BoardListController>
	Map<String , Command> map = new HashMap<String , Command>();
	
	public void init() throws ServletException{
		String file = getInitParameter("file"); // /WEB-INF/command.propertise
		file = getServletContext().getRealPath(file); // D:/java/workspace/web/src/main/webapp/WEB-INF/command.propertise
		System.out.println(file);
		Properties prop =new Properties();
		try(FileReader fr = new FileReader(file)){
			prop.load(fr);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Set Keyset = prop.keySet();
		Iterator iter = Keyset.iterator();
		while(iter.hasNext()) {
			String cmd = (String)iter.next();
			String className = prop.getProperty(cmd);
			try {
			Class className2 = Class.forName(className);
			Command command = (Command)className2.newInstance();
			map.put(cmd, command);
		}catch (Exception e) {}
			
	}
  }


public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	process(req, res);
}
public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	process(req, res);
}
void process(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
	// 커맨드패턴으로 처리
	String cmd = req.getParameter("cmd");
	Command command = map.get(cmd);
	
	//로직처리 후 뷰를 리턴
	String view = command.process(req, res);
	
	
	//jsp로 포워딩
	RequestDispatcher disp= req.getRequestDispatcher(view);
	disp.forward(req, res);// 실제포워딩
}

}
