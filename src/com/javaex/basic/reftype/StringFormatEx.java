package com.javaex.basic.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		//%s, %d, %n
		String fruit = "Apple";
		int total = 10;
		int eat =3;
		
		System.out.println(10+"개의 "+fruit+"중에 " + eat +"개를 먹었다");
		//-> format
		System.out.printf("%d개의 %s중에 %s개를 먹었다.%n",total, fruit,eat);
		
		// %f (실수형)
		float pi = 3.14159f;
		System.out.printf("파일값은 %f입니다.%n",pi);
		System.out.printf("파일값은 %.3f 입니다. %n",pi);
		
		//포맷형식은 String 에서도 사용할수 있다
		String str = String.format("%d개의 %s중에 %d개를 먹었다. %n", total, fruit, eat);
		System.out.println(str);
	}

}
