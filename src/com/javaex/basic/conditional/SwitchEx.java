package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요. \n (1.java  2.c  3.c++  4.파이썬)");
		
		int subject = scanner.nextInt();
		switch (subject) {
		case 1:
			System.out.println("R010");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R404");
			break;
		default:
			System.out.println("상담원에게 문의 하세요!");
			break;
		}
		scanner.close();
	}

}
