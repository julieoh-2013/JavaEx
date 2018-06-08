package com.javaex.basic.exception;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ThrowsExcept {
	public void executeException() throws IOException{ // 이메소드는 ioe발생할수 있다고 컴파일러에게 알림
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");  //컴파일러가 체크하는 예외임
	}
	
	public void executeRuntimeException() {
		System.out.println("런타임 오류");
		throw new RuntimeException("Runtime Exception");
	}
	
	public double divide(int num1, int num2) {
		if (num2 == 0 ) {
			//System.out.println("0으로 나눌수 없어요");
			//return 0;
			throw new ArithmeticException();
		}
		return  num1/num2;
	}
}
