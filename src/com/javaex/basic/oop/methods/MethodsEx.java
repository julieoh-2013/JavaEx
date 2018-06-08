package com.javaex.basic.oop.methods;

public class MethodsEx {
	public static void main(String[] args) {
		printMessage(); // 매개변수, 리턴 없는 메서드
		double squared = square(3.5);
		System.out.println(squared);
		printDivide(4, 0);
		System.out.println("4+5 = " +getSum(4,5));
		
	}
	
	public static void printDivide(int num1, int num2) {
		if(num2 ==0) {
			System.out.println("0으로 나눌수 없어요");
			return; //실행종료
		}
		System.out.println(num1/num2);
	}
	
	// 반환값이 없는 메서드, 
	public static void printMessage() {
		System.out.println("Message");
	}
	
	// 매개변수는 개수 제한이 없음.
	public static double getSum(double num1, double num2) {
		return num1+num2;
	}
	
	// 리턴값과 매개변수가 있는 메서드
	public static double square(double num) {
		return num*num;
	}
}
