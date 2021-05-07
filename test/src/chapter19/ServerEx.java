package chapter19;

import java.net.ServerSocket;
import java.net.Socket;



public class ServerEx {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
		//서버 소켓을 생성
		 server = new ServerSocket(9999);
		
		// 클라이언트 접속 대기(무한 반복)
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			HttpThread ht = new HttpThread(client);
			ht.start();
		}
		
	}catch (Exception e) {
		
	}finally {
		try { server.close();}catch (Exception e) {
	}
		
	}
		
	}
}


