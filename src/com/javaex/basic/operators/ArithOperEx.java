package com.javaex.basic.operators;

public class ArithOperEx {
	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		//부호연산자 : +, -
		System.out.println(-a);
		System.out.println(-1*a);
		System.out.println("---------------");
		
		//사칙연산
		a=7;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나눗셈
		System.out.println(a%b);//나머지
		System.out.println("----------------");
		
		//정수와 정수의 나눗셈은 정수
		System.out.println((float)a/(float)b);
		System.out.println((float)a/b);
		System.out.println("----------------");
		
		//증감연산자 ++, -- 
		//++a와 a++ 혼동하지 말자
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b++); //b를 일단 출력후 값을 1 증가시킴
		System.out.println(b);
		System.out.println("----------------");
		
		//나눗셈 보충
//		System.out.println(4/0); //ArithmeticException 발생
		System.out.println(4.0 / 0); //Infinity 무한대
		System.out.println(7 % 4);
		System.out.println(7.2 % 2.0); //유의 문제있는 연산 1.2000000000000002 
		//Infinite 체크
		System.out.println(Double.isInfinite(4.0/0));
		//NaN  : Not a Number
		System.out.println(Double.isNaN(4.0/0));
	}
}
