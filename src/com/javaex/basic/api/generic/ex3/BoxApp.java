package com.javaex.basic.api.generic.ex3;

public class BoxApp {
	public static void main(String[] args) {
		//	Box 하나만들고 int값 설정
		Box<String, Integer> intBox = new Box<>();
		intBox.setKey("Ingeger");
//		intBox.getKey(123);       // 컴파일 시 타입체크함 안전성 보장
		intBox.setContent(123);
//		intBox.setContent("Java"); // 컴파일 시 타입체크함 안전성 보장
		
		// 값을 꺼내와 봅시다
		int retVal = intBox.getContent(); // 케스팅 불필요 :생성 시, 타입 지정했으므로
		System.out.println(intBox.getKey());
		System.out.println(retVal);
		
		Box<String, String> strBox = new Box<>();
		strBox.setKey("String");
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strBox.getKey());
		System.out.println(strVal);
		
		// 만약 케스팅을 잘못 했다면?
// 		strVal = (String)intBox.getContent(); //java.lang.ClassCastException:
 		// 컴파일 타임에서 체크 : 안전성 확보
	}
}
