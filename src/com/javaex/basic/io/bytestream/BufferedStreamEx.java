package com.javaex.basic.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {
	static String dirName ="D:\\javastudy\\files\\";
	static String source = dirName+ "img.jpg";
	static String target = dirName+ "img_bufferd_copy.jpg";
	
	public static void main(String[] args) {
		//	File스트림을 열기		
		try {
		InputStream fis = new FileInputStream(source);
		OutputStream fos = new FileOutputStream(target);
		//전송효율 향상위해 bufferedstream열기
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//파일 복사하기
		// int data = 0 ;
		byte[] data = new byte[1024]; //1kb 데이터 담을 배열선언
		int size = 0; //버퍼에 전송된 사이즈 담을 변수
		while((size=bis.read(data))!=-1) {
			bos.write(data);
			System.out.println(size + " 바이트를 복사했습니다.");
		}
		bis.close();
		bos.close();//보조스트림 닫으면 메인스트림 자동으로 닫힘.
		System.out.println("파일을 복사했습니다.");
		
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없어요.");
		}catch(IOException e) {
			System.out.println("IOException!");
		}
	}
}
