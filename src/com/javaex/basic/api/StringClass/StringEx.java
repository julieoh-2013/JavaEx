package com.javaex.basic.api.StringClass;

public class StringEx {

	public static void main(String[] args) {
	 
			String s1 ="Java";
			String s2 = new String("Java");
			String s3 = "Java";
			
			System.out.println(s1== s2);
			System.out.println(s1== s3);
			
			// String 생성자
			char[] letters = {'J', 'a', 'v','a'};
			String s4 = new String(letters);
			System.out.println("s4 : "+ s4);
			
			//valueOf 메서드
			String s5 = String.valueOf(3.14159f);
			System.out.println("s5 : "+ s5);
			
			// 유용한 메서드들
			String str = "Java Programming is Fun? ";
			System.out.println(str.charAt(5)); //5번 인덱스의 char
			System.out.println(str.indexOf("Fun"));
			System.out.println(str.indexOf("fun")); // -1은 없다는 것
			
			// replace
			System.out.println(str.replace('?', '!'));
			System.out.println(str.replaceAll("Fun", "Funny"));
			System.out.println(str);
			
			String s6 = "         Hello      "; //화이트 스페이스 제거
			String s7 = ", Java";
			
			s6 = s6.trim();//whitespace 제거
			System.out.println(s6+s7);
			
			// 문자열 분리 : split();
			String [] split = str.split(" ");
			System.out.println(split);
			
			for (String data: split) {
				System.out.println(data);
			}
	}

}
