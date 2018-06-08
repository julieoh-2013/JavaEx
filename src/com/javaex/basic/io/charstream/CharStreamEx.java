package com.javaex.basic.io.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static String dirName ="D:\\javastudy\\files\\";
	static String filename = dirName+"char.txt";
	
	public static void main(String[] args) {
		//	파일 라이터를 열기
		try {
			Writer fwriter = new FileWriter(filename);
			fwriter.write("Bit Computer\r\n"); // window 계열에서 \r\n를 써줘야 개행됨
			fwriter.write("Java Programming\r\n");
			fwriter.write("2018.05");
			fwriter.flush();
			fwriter.close();
			
			//	파일 리더 열기
			Reader freader = new FileReader(filename);
			
			int data =0; // 2byte만 읽음 char
			while ((data=freader.read())!=-1) {
				 //System.out.println(data);
				 System.out.print((char)data);
				
			}
			System.out.println();
			freader.close();
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없어요.");
		}catch(IOException e) {
			System.out.println("IOException!");
		}
	}
}
