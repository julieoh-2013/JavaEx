package com.javaex.basic.api.generic.ex1;

public class BoxApp {
	public static void main(String[] args) {
		//	Box 하나만들고 int값 설정
		Box intBox = new Box();
		intBox.setContent(123);
		
		// 값을 꺼내와 봅시다
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		// 만약 케스팅을 잘못 했다면?
		strVal = (String) intBox.getContent(); //java.lang.ClassCastException:
		System.out.println(strVal);
	}
}
