package com.javaex.basic.var;

public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar = 3.14159f;
		double doubleVar = 3.14159;
		
		//정밀도 체크
		doubleVar = 0.1234567890123456789;
		floatVar = 1234567890123456789f;
		System.out.println("float : "+floatVar);
		System.out.println("double : "+ doubleVar);
		
		//지수값(exponent)을 사용한 표현 
		int intVar = 3000000;
		doubleVar = 3E6;//3x10의 6승
		floatVar = 3E6f;
		
		System.out.println("int : "+intVar);
		System.out.println("double : "+ floatVar);
		System.out.println("float : "+doubleVar);
		
		//부동소수점 계산의 유의점 
		System.out.println(0.1*3);

	}
}
