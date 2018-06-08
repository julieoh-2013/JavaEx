package com.javaex.basic.api.objectclass.ex01;

public class LangClassTest {

	public static void main(String[] args) {
		 Point p = new Point(10, 10);
		 System.out.println(p.getClass().getName());
		 System.out.println(p.hashCode());
		 System.out.println(p.toString());
		 System.out.println(p);
	}

}
