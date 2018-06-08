package com.javaex.basic.var;

//암묵적 형변환 예제 promotion
public class ImplicitCastingEX {
	
	public static void main(String[] args) {
		byte b=25; //1byte 정수형
		System.out.println(b);
		
		short s = b; //2 바이트 정수형
		System.out.println(s);
		
		int i = s; //4바이트 정수형
		System.out.println(i);
		
		float f = i;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		char ch ='A';
//		short s2 = ch; 
		int i2 = ch;
		System.out.println(i2);
		
	}
}
