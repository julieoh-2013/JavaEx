package com.javaex.basic.loop;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요 : ");
		
		int dan = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+ i +" = " + dan*i);
		}
		sc.close();
	}

}
