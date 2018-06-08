package com.javaex.basic.collection.list;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		//	스택 선언
		Stack<Integer> stack = new Stack<>();
		
		//	값을 10개 push
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		//	값을 꺼내기 pop : 출력 위치 확인 (마지막 들어간게 먼저 나옴)
		System.out.println(stack.pop());
		System.out.println(stack);
		
		//peek() 값확인 : 맨 마지막 들어간 값 출력만 함. 값을 꺼내진 않음.
		System.out.println(stack.peek());
		System.out.println(stack);
		
//		while(true) {
//			 System.out.println(stack.pop());
//		}
		
		while(!stack.empty()) {
			 System.out.println(stack.pop());
		}
	}
}
