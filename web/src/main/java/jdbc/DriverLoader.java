package jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

public class DriverLoader extends HttpServlet {
	public void init(ServletConfig config) {
		try {
			Class.forName("jdbcDriver");
			System.out.println("드라이버 로드!!!!");
		}catch (Exception e) {
	
		}
	

	}
}
