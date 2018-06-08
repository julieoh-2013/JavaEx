package com.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이는?");
		int age = scanner.nextInt();
		
		System.out.println("이름은 : ");
		String name = scanner.next();
		
		System.out.println("welcome, "	+ name);
		System.out.println("age: "+age);;
		scanner.close();
	}

}
