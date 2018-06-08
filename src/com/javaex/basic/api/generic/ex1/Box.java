package com.javaex.basic.api.generic.ex1;

// 모든 객체를 담을수 있는 box를 설계
public class Box {
	Object content;

	public void setContent(Object content) {
		this.content = content;
	}
	public Object getContent() {
		return content;
	}
}
