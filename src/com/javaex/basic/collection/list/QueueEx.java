package com.javaex.basic.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
//		Queue<String> queue = new Queue<>() ;
		Queue<Integer> queue = new LinkedList<>();
		
		//	데이터를 추가
		for (int i = 0; i < 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue);
		
		//	데이터를 꺼내기 :  먼저들어간게 먼저 인출됨
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue); //	처음들어간 값 출력, 인출은 안됨
		
		//	poll을 할때는 empty로 마지막인지 확인
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
	}
}
