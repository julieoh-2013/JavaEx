package com.javaex.basic.api.objectclass.ex02;

public class RectangleApp {
	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(2, 2);
		Rectangle d = c;
		
		//a와 b의 면적비교
		System.out.println(a.equals(b));
		//a와 c의 면적비교
		System.out.println(a.equals(c));
		//a와 d의 면적비교
		System.out.println(a.equals(d));
		
		System.out.println(c.equals(d));
	}
}
