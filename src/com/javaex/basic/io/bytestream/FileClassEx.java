package com.javaex.basic.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String dirName ="D:\\javastudy\\files\\";
	public static void main(String[] args) {
		//	파일 객체
		File root = new File(dirName);
		//	파일이 실제 존재하는지 확인
		System.out.println(dirName +" : " + root.exists());
		//	파일의 정보 출력
		printInfo(root);
		
		//	디렉터리 안쪽에 파일을 만들어 봅시다
		File file = new File(dirName+"\\myfile.txt"); // 메모리상에 객체 생성일뿐 물리적 파일 생성 아님.
		//  물리적 파일 생성
		if (!file.exists()) { //파일이 물리적으로 없으면 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 생성하지 못했습니다.");
				e.printStackTrace();
			}
		}
		printInfo(root);
		//	파일 삭제하기
		file.delete();
		printInfo(root);
	}
	static void printInfo(File f) {
		System.out.println("-------------");
		
		//	이 파일 객체가 디렉토리인지 확인 해 봅시다.
		if(f.isDirectory()) {
			System.out.println("Directory : "+ f.getName());
			File[] files = f.listFiles();
			//	파일 리스트 출력
			for(File file : files) {
				System.out.print(file.isDirectory() ? "d" : "f" + "\t");
				System.out.println(file.getName());
			}
		}else {//	디렉터리 아닙니다. 파일 입니다.
			System.out.println("File : "+ f.getName());
			
		}
		System.out.println("-------------");
	}
	
}
