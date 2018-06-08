package com.javaex.basic.var;

public class IntLongEx {
	public static void main(String[] args) {
		//int 변수 선언
		int intVar1;
		int intVar2;
		
		intVar1 = 2018;
//		intVar2 = 1234567890123; //out of range
		
		System.err.println(intVar1);
		//long 변수 선언
		long longVar1;
		long longVar2;
		
		longVar1 = 2018;
		longVar2 = 1234567890123L; // 8byte
		System.err.println(longVar1);
		System.err.println(longVar2);
		
		//2진수, 8진수, 16진수
		int bin; //2진수   0b~
		int oct; //8진수   0~
		int hex; //16진수 0x~
		
		bin =0b1100;  	//12
		oct =072; 		//58
		hex = 0xFF;		//255
		
		System.err.println(bin);  
		System.err.println(oct);
		System.err.println(hex);
		
	}
}
