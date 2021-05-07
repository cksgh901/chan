package chapter19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

	public static void main(String[] args) {
		try {
			//입력한 텍스트를 읽어서 서버로 전송.
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			InetAddress server = InetAddress.getByName("192.168.0.3");
			
			while(true) {
				String txt = br.readLine();
				//소켓객체 생성
				DatagramSocket socket = new DatagramSocket();
				//입력한 텍스트를 바이트배열로 저장
				byte[] msg = txt.getBytes();
				//서버로 전송
				//패킷객체 생성
				DatagramPacket packet = new DatagramPacket(msg, msg.length, server, 9898);
				//전송
				socket.send(packet);
				// 소켓 닫기
				socket.close();
			}
	}catch (Exception e) {
		System.out.println(e.getMessage());
		
	}

}
}
