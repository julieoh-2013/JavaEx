package com.javaex.basic.api.generic.ex2;

// Generic 사용
public class Box<T> {  // 외부에서 T를 결정함.
	T content;

	public T getContent() {
		return content;
	}
	public void setContent(T content) {
		this.content = content;
	}
}
