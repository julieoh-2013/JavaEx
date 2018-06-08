package com.javaex.basic.exception;

public class ArrayExceptionEx {
	public static void main(String[] args) {
		int[] intArray = new int[] {3,6,9};
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException ae) {
//			ae.printStackTrace();
			System.out.println("Error : "+ ae.getMessage());
			System.out.println("Error : "+ ae.getStackTrace());
		}
	}
}
