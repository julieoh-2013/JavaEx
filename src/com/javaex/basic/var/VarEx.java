package com.javaex.basic.var;

public class VarEx {
   public static void main(String[] args) {
	   //변수 식별자부여
	   //문자, 숫자, $,_시작가능
	   //숫자로 시작하면 안됨
	   
	   //변수명 관례
	   //관례상 소문자 단어의 조합시, 뒷단어 첫글자 대문자로
	   /*
	   int myAge; //선언
	   //초기화
	   myAge =25;
	   */
       int myAge=25; //선언과 할당을 동시에
	   //Type 선언된 변수는 다른타입으로 쓸수 없음.
	   //myAge ="이십오";
	   System.out.println(myAge);
	   
	   //한번에 여러변수를 선언할때
	   int v1=10, v2=20, v3=30;
	   
	   //여러변수에 동시에 같은값을 할당할때
	   v1=v2=v3=40;
   }
}
