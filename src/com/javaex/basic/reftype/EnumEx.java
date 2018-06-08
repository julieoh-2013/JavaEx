package com.javaex.basic.reftype;

public class EnumEx {
	public static void main(String[] args) {
		Week today = Week.THURSDAY;
		System.out.printf("today is %s(%d)%n", today.name(),today.ordinal());
		
		System.out.println(today.toString());
		
		//문자열을 가지고 열거 객체 반환
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name()+" "+obj.ordinal());
	}
}
