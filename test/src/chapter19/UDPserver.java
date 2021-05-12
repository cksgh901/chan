package chapter19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPserver {

	public static void main(String[] args) {
		try {
		//DatagramSocket 객체 생성
		DatagramSocket socket = new DatagramSocket(9898);
		//패킷객체 선언
		DatagramPacket packet;
		//바이트 배열 선언
		byte[] msg = null;
		while(true) {
			 msg= new byte[1024];// 배열 객체 생성
			 //packet 객체 생성
			 packet = new DatagramPacket(msg, 0, msg.length);
			 //페킷 데이터를 수신
			 socket.receive(packet);
			 //문자열로 변환
			 String txt = new String(msg, 0, packet.getLength());
			 System.out.println("클라이언트가 보낸 메세지" + txt);
			 
			 //클라이언트정보
			 InetAddress client = packet.getAddress();
			 System.out.println();
			
		}

	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

}
