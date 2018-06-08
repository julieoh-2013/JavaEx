package com.javaex.basic.conditional;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade = 'A';
		String message ;
		
		switch(grade) {
		case 'A' :
			message = "Excellent!";
			break;
		case 'B' :
			message ="Good";
			break;
		case 'C':
			message ="So So";
			break;
		case 'D':
			message = "Fail";
			break;
		default:
			message ="??";
			break;
		}
	 System.out.println(message);
		
	}
}
