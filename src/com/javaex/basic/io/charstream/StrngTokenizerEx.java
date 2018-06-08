package com.javaex.basic.io.charstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StrngTokenizerEx {
	static String dirName ="D:\\javastudy\\files\\";
	static String filename = dirName+"thieves.txt";
	
	public static void main(String[] args) {
		// 스트링 열기
		try {
			Reader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			
			String thief;
			
			while((thief = br.readLine())!=null) {
				StringTokenizer st = new StringTokenizer(thief, " ");
				while (st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token +" ");
					
				}
				System.out.println();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
