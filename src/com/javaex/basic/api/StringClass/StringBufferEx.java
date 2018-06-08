package com.javaex.basic.api.StringClass;

public class StringBufferEx {
	public static void main(String[] args) {
		// 버퍼의 생성
		StringBuffer sb = new StringBuffer("This");
		
		// 문자열 추가 : append()
		sb.append(" is pencil");
		
		// 문자열 삽입 : insert()
		sb.insert(7, "My");
		
		// 문자열 치환
		sb.replace(8, 10, "your");
		
		System.out.println(sb);
		
		sb.setLength(10);  // 버퍼 길이 변경
		System.out.println(sb);
		
		//
		String s = new StringBuffer("This")
									.append(" is")
									.append(" pencil")
									.insert(8, "my")
									.replace(8, 10, " your ")
									.toString();
		
			System.out.println(s);
			
		StringBuffer sb2 = new 	StringBuffer("This")
									.append(" is")
									.append(" pencil")
									.insert(8, "my")
									.replace(8, 10, " your ");
		String ss = sb2.toString();
		System.out.println(ss);
	}
}
