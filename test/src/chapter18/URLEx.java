package chapter18;

import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class URLEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.egovframe.go.kr/home/main.do?menuNO=13");
			System.out.println("protoco :" + url.getProtocol());
			System.out.println("host :" + url.getHost());
			System.out.println("port :" + url.getPort());
			System.out.println("path :" + url.getPath());
			System.out.println("query :" + url.getQuery());
			
			int data =0;
			Reader is = new InputStreamReader(url.openStream());
			while((data=is.read())!= -1) {
				System.out.print((char)data);
			}
			System.out.println();
		}catch(Exception e) {}

	}

}
