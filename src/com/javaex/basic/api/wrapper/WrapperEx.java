package com.javaex.basic.api.wrapper;

public class WrapperEx {
	public static void main(String[] args) {
		// 기본 만들기
		Integer i = new Integer(10);
		Character c = new Character('c');
		
		// jdk9에서 new Wrapper는 Deprecated
		Float f =Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
		
		// 문자열로 넣어도 됩니다.
		Integer i1 = Integer.valueOf("10");
		Double d1 = Double.valueOf("3.14159f");
		Boolean b1 = Boolean.valueOf("false");
		// 주의 : 문자열의 형태가 해당 기본형의 값의 형태를 갖춰야한다.
		
		// 자동 박싱 (Auto Boxing)
		Integer i2 = 10;  // == Integer i2 = Integer.valueOf(10); 이 내부적으로 자동으로 일어난것임
		
		//parse 계열 메서드 : 문자열 이용, 해당 타입으로 변환하거나 다른형태로 출력해주는 메서드
		System.out.println(Integer.parseInt("-123"));  // 문자열을 -> 정수로 변경
		System.out.println(Integer.parseInt("10", 16)); // 16진수의 문자열을 정수로 변경
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
		System.out.println(Integer.toHexString(28)); // 16진수 문자열로 변환
		// 형변환
		System.out.println(i2.doubleValue()); // integer > double로 변환
		//System.out.println(i2.floatValue());
		
		// 포장된 값의 비교
		Integer i3 = Integer.valueOf(2018);
		Integer i4 = Integer.valueOf(2018);	
		System.out.println(i3==i4);
		
		// 언박싱 비교
		System.out.println(i3.intValue()==i4.intValue());
		// 언박싱 비교2
		System.out.println(i3.equals(i4)); // 객체의 값의 비교
		
	}
}
