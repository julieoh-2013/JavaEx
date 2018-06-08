package com.javaex.basic.collection.hash;

import java.util.HashSet;

class SimpleNum{
	int num;
	
	public SimpleNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}
	// hashcode와 equals를 오버라이드  => 두객체가 같은지 확인 위해
	@Override
	public int hashCode() {
		// 어떤값을 유일한 식별자로 넘길것인가 결정
		return num % 10;
		//return super.hashCode();
	}

	@Override // 객체가 가진 멤버변수 값비교
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum)obj;
			return num == other.num;
		}
		return super.equals(obj);
	}
	
	 
	
}

public class HashSetEx2 {
	public static void main(String[] args) {
		HashSet<SimpleNum> hs = new HashSet<>();
		
		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs); // 중복허용하지 않아야 하나, 중복허용함 주소가 달라 다른객체로 인지 hashcode값 같은지, equals()같은지 비교하여 판단필요
		System.out.println(s2.equals(s3)); // 1. hashcode로 비교할 정수값 생성 2. equals 오버라이드
		
		
		
	}
}
