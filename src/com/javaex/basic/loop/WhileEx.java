package com.javaex.basic.loop;

public class WhileEx {

	public static void main(String[] args) {
		int num =0;
		int total =0;
		
		while(num <100) {
			total += num; // total = total+num;
			num++; // num = num+1;
		}
		System.out.println(total);

	}

}
