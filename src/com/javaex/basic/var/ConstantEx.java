package com.javaex.basic.var;

public class ConstantEx {
	
	static final double PI = 3.14159;
	static final int SPEED_LIMIT = 110; //static이 없으면 그냥 변경불가 변수
	
	//static 이라 메모리에 적재하지 않고도 실행가능한 메소드
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		//상수변경시도
//		SPEED_LIMIT = 129;
		//final이라 변경 불가함
		
	}
}
