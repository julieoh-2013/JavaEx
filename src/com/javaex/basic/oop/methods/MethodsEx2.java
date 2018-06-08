package com.javaex.basic.oop.methods;

public class MethodsEx2 {
	public static void main(String[] args) {
		System.out.println(getSum(new double[] {1,2,3,4,5,6,7,8,9,0}));
		System.out.println(getSumVar(1,2,3,4,5,6,7,8,9,0));
		printTotal("합계", 1,2,3,4,5,6,7,8,9,0);
	}
	//고정매개변수와 가변 이수를 함께 쓸수 있다
	public static void printTotal(String msg, double...values) {
		System.out.println(msg+" " +getSumVar(values));
	}
	
	// 배열을 이용한 가변 인수 전달
	public static double getSum(double[] values) {
		double total =0;
		for(double value: values) {
			total += value;
		}
		return total;
	}
	
	// 가변 인수를 이용한 다수의 인수 전달
	public static double getSumVar(double ... values) {
//		double total =0;
//		
//		for(double value : values) {
//			total += value;
//		}
//		return total;
		return getSum(values);
	}
}
