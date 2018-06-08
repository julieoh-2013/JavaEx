package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트연산
		// 하드웨어 제어, 이미지 프로세싱, 필터링
		// 미세한 단위의 데이터 제어에 사용
		byte b1 = 0b1101; //2진수 0b로 시작+바트
		byte b2 = 0b0111;		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(b2));
		
	//	byte result = b1 & b2; //비트 연산 시 내부적으로 int로 변환하여 시도하므로
		int result = b1 & b2; // bit and 연산
		System.out.println(Integer.toBinaryString(result));
		System.out.println(result);
		
		result = b1 | b2; // bit or 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // bit xor 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not 연산   why? integer로 바꾸므로 4byte를 역변환
		System.out.println(Integer.toBinaryString(result));
	}
}
