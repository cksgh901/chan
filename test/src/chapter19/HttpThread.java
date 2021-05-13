package chapter19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HttpThread extends Thread {
	
	Socket client ;
	BufferedReader br;
	PrintWriter pw ;
	
	HttpThread(Socket client ){
		this.client = client;
		try {
		br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		pw = new PrintWriter(client.getOutputStream());
	} catch (Exception e) {
	}
	}
	public void run() {
		try {
		String line = br.readLine();
		System.out.println(line);
		// url 에서 파싱
		// 아이피: 포트번호/aaa/bbb.html
		int start = line.indexOf("/")+1;
		int end = line.lastIndexOf("HTTP")-1;
		String path = line.substring(start,end);// /aaa/bbb.html
		
		System.out.println(path);
		BufferedReader cbr = new BufferedReader(new FileReader(path));
		
		String cLine; 
		pw.println("HTTP/1.0/2.0");
		while((cLine = cbr.readLine()) != null) {
			pw.println(cLine);
			pw.flush();
		}
		
	}catch(Exception e){
		System.out.println(e.getMessage());
		
	}finally {
		try {
		br.close();
		pw.close();
		client.close();
		
	}catch(Exception e) {}
		
}
}
}
