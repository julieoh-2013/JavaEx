package com.javaex.basic.loop;

public class MiniLotto {

	public static void main(String[] args) {
		//for문 버전
		for(int i=0; i<6 ; i++) {
			System.out.print( (int)(Math.random() *45 )+1);
			System.out.print(" ");
		}
		System.out.println();
		
		
		//while문 버전
		int idx = 0;
		while(idx <6) {
			System.out.print((int)(Math.random() *45 )+1);
			System.out.print(" ");
			idx++;
		}
		System.out.println();
	}

}
