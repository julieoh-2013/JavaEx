package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int startnum=(num%2==0) ? 2 : 1;
		int sum=0;
		
		for (int i = startnum; i <=num; i+=2) {
			sum +=i;
		}
		System.out.println("결과 : "+sum);
//		if(num%2==0) {
//
//			for (int i = 1; i <= num/2; i++) {
//				startnum +=2;
//				System.out.println(startnum);
//				sum += startnum;
//			}
// 
//		}else {
//			startnum =1;
//			for (int i = 1;  i<=num/2; i++) {
//				startnum+=2;
//				System.out.println(startnum);
//				sum += startnum;
//			}
//		}
//		System.out.println("결과값  : "+ sum);
        sc.close();
	}

}
