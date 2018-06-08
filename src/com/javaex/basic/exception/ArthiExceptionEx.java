package com.javaex.basic.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArthiExceptionEx {

	public static void main(String[] args) {
		// 스케너로부터 정수 입력
		// 100을 정수로 나눈다.
		double result = 0;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		// 오류 발생 가능 영역
//		num = sc.nextInt();
//		result = 100/ num;
		// 오류 발생 가능 영역
		
		try {
			num = sc.nextInt();
			result = 100/ num;		
		}catch(InputMismatchException ime) {
			System.out.println("정수 숫자를 입력해주세요.");
		}catch(ArithmeticException ae) {
			System.out.println("0으로는 나눌수 없어요. ");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);
		sc.close();
	}

}
