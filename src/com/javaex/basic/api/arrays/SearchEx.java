package com.javaex.basic.api.arrays;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// 기본형 검색
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int index = Arrays.binarySearch(nums, 5); //-값나오면 검색헐수 없다는것임
		System.out.println( " 5의 인덱스 :"+ index);
		
		// String 검색
		String[] str = {"Java", "C", "C++", " Python","Linux"	};	
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		int index2 = Arrays.binarySearch(str, "Linux");
		System.out.println("인덱스 : "+index2);
	}

}
