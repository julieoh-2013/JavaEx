package com.javaex.basic.network.v2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		//	서버소켓생성
		ServerSocket serverSocket = null;
		 
		try {
			// 바인딩 ip주소와 port
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			//주소,포트 127.0.0.1(loop back address=localhost)
			// port == 파이프 (데이터 주고받는 파이프 1~65536 중 비예약포트 10000)
			serverSocket.bind(local);
			
			// 시적 메시지를 출력
			System.out.println("< 서버 시작 >");
			System.out.println("[ 연결을 기다립니다. ]");
			
			// 연결을 기다려봅니다.  : 대기 상태 
			Socket socket = serverSocket.accept();
			
			// 클라이언트 접속 시 처리
			InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(" 클라이언트가 연결되었습니다. ");
			System.out.println(socketAddress.getAddress() + " : " + socketAddress.getPort());
			
			// 클라이언트로부터 메시지를 받아봅시다
			// 받기위해 인풋스트림을 열겠습니다
			InputStream is =  socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//메시지를 읽겠습니다.
			String msg; //클라이언트로 부터 전송된 메시지 받을 변수선
			while(true) {
				msg = br.readLine();
				if(msg == null) {
					System.out.println("[접속 종료 되었습니다.]");
					break;
				}
				System.out.println("Message : "+ msg);
			}
			
			
			// 접속이 끝난후 후처리
			System.out.println("=========");
			System.out.println(" < 서버 종료 > ");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
