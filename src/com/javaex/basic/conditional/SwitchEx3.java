package com.javaex.basic.conditional;

public class SwitchEx3 {
	public static void main(String[] args) {
		// 나중에 코드를 enum으로 다시만들 예정
		String day ="SUNDAY";
		String act;
		
		switch(day) {
		case "SUNDAY":
			act ="휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSEDAY":
			act ="열공";
			break;
		case "FRIDAY":
			act = "열공후 불금";
			break;
		case "SATURDAY":
			act ="방전";
			break;
		default:
			act="여긴어디";
		}
		System.out.println(act);
	}
}
