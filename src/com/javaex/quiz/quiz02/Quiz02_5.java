package com.javaex.quiz.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		
//		클래스 명은 Quiz02_5로 합니다.
//		다음과 같이 변수가 선언되어 있습니다.
//		int num1 = 13579;
//		int num2 = 13579;
//		다음 두 값이 같은지 확인하는 코드를 작성해 봅시다. 같다면 "같음" 다르다면 "다름"을 출력하세요.
//
//		++num1 + 1
//		num2++ + 1
//		최종 num1과 num2의 값을 출력해 봅시다.
		
		int num1 = 13579;
		int num2 = 13579;
		
		System.out.println(++num1 + 1 == num2++ + 1 ?"같음":"다름");
		System.out.println(++num1 + 1);
		System.out.println(num2++ + 1);

	}

}
