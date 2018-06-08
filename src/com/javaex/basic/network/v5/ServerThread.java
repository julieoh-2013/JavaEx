package com.javaex.basic.network.v5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	// 필드
	private Socket socket;
	private String client;
	
	// 생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		
		try {
			// 클라이언트 접속 시 처리
			InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(" 클라이언트가 연결되었습니다. ");
			System.out.println(socketAddress.getAddress() + " : " + socketAddress.getPort());
			
			// 클라이언트로부터 메시지를 받아봅시다
			// 받기위해 인풋스트림을 열겠습니다
			InputStream is =  socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// Echo Back을 위한 스트림을 열겠습니다
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
		    BufferedWriter bw = new BufferedWriter(osw);
		    
		    // 메시지를 읽고 Echo Back
			String msg; //클라이언트로부터 전송된 메시지 받을 변수선
				while(true) {
					msg = br.readLine();
					if(msg == null) {
						System.out.println("[접속 종료 되었습니다.]");
						break;
					}
					System.out.println("Message : "+ msg);
					//Echo Back
					System.out.println("Echo back : " + msg);
					bw.write(" [Echo ] : "+ msg);
					bw.newLine();
					bw.flush();
				} 
				bw.close();
				br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
