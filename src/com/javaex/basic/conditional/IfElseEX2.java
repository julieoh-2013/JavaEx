package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElseEX2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요. \n (1.java 2.c 3.c++ 4.파이썬)");
		
		int subject = scanner.nextInt();
		if (subject ==1	) {
			System.out.println("R101");
		} else if (subject ==2) {
			System.out.println("R202");
		} else if(subject ==3) {
			System.out.println("R303");
		} else if (subject ==4) {
			System.out.println("R404");
		} else {
			System.out.println("상담원에게 문의하세요");
		}
		scanner.close();
		
	}

}
