package com.javaex.basic.thread.ex02;

public class MainThread {
	public static void main(String[] args) {
		//쓰레드를 불러와 실행
		Thread thread = new DigitThread();
		// 쓰레드의 실행
		thread.start();;
//		// 메인 쓰레드 코드를 만들겠습니다
//		->AlphabetTherad 로 이동
//		for(char ch='A'; ch<='Z'; ch++) {
//			System.out.println(ch);
//			
//			//	출력속도를 지연
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		Thread thread2 = new AlphabetThread();
		thread2.start();
		System.out.println("메인 쓰레드 종료!");
	}
}
