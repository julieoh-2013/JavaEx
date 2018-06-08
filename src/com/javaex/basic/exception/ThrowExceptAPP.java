package com.javaex.basic.exception;

import java.io.IOException;

public class ThrowExceptAPP {
	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
		
	System.out.println(except.getClass().getName());	
		
		try {
			except.executeException();
			except.executeRuntimeException();
		} catch(RuntimeException e) {
			System.out.println("Message :"+ e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();

		}
		try 
		{
			System.out.println(except.divide(100, 0));
		}catch(ArithmeticException e){
			System.out.println("0 으로 못나눈나구!");
		}
		
	}
}
