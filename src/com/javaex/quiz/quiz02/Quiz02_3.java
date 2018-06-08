package com.javaex.quiz.quiz02;

public class Quiz02_3 {

	public static void main(String[] args) {
//		클래스 명은 Quiz02_3으로 합니다.
//		다음과 같이 변수를 선언했습니다.
//		int num = 13579;
//		num의 100자리 미만을 버리는 코드를 작성해 봅시다.
//		num이 456이라면 결과는 400
//		num이 12345라면 결과는 12300이 됩니다.
//		결과를 화면에 출력해 봅시다.		 
		int num = 13579;
		
//	    int result1 = (num/100);
//	    int result2 =  num%100>0 ? 
		
//		위의 코드에서 %02d 에 설명하면 다음과 같다.
//		% : 명령 시작을 의미
//		0 : 채워질 문자
//		2 : 총 자리수
//		d : 십진수로 된 정수
//
//		%02d : 십진수로 된 2자리의 정수 형식으로 나타냄. 단 자릿수가 부족할 경우 0으로 해당부분을 채움
//
//
//		이 밖에도 String.format을 이용하면 다양한 방법으로 문자를 표현할 수 있다. 
//		시간날때 다음 URL을 참고하면 많은 도움이 된다. - http://examples.javacodegeeks.com/core-java/lang/string/java-string-format-example/
// 
//        System.out.println(String.format("%02d", 8));
//        System.out.println(String.format("%03d", 11));
 
	   System.out.println(num/100*100);
	}

}
