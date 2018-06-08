package com.javaex.quiz.quiz01;

public class Quiz01_3 {

	public static void main(String[] args) {
		//•다음 문장의 출력 결과를 각각 확인해 봅시다. 오류가 난다면 그 이유를 생각해 봅시다.
		System.out.println("1" + "3");
 		System.out.println(true + "Java");
		System.out.println('A' + 'B');
 		System.out.println('1' + 2);
		System.out.println('J' + "ava");
//		//System.out.println(false + null);
		
		
		char a1 = 'a';
		char a2 = 97; // 아스키 코드값
		char a3 = '\u0061'; // 유니코드값

		System.out.println(a1);
		System.out.println(a1+a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
