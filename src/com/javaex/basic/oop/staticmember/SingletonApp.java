package com.javaex.basic.oop.staticmember;

public class SingletonApp {
	public static void main(String[] args) {
//		Singleton si = new Singleton(); // 오류 : 생성자 private
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		
	}
}
