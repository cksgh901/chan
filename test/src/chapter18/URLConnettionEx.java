package chapter18;

import java.net.URL;
import java.net.URLConnection;

public class URLConnettionEx {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.egovframe.go.kr/home/main.do?menuNO=13");
		URLConnection conn = url.openConnection();
		System.out.println(conn);
		System.out.println(conn.getContentType());


}
}
