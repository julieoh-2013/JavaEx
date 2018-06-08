package com.javaex.quiz.quiz01;

public class Quiz01_4 {

	public static void main(String[] args) {
		// 다음과 같은 변수 선언 코드가 있습니다.
		byte b = 10;  
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		//아래 형 변환 코드 중에서 명시적 형 변환이 필요 없는 코드는 무엇입니까?

				byte b2 = (byte)i; // int 4byte -> byte 1byte 
				char ch2 = (char)b; // byte 1byte -> char 2byte  unsigned 를 signed에 할당해서 캐스팅 필요
				short s = (short)ch; //char 2byte -> short 2byte
				float f =  l;  //long  8byte -> float 4byte 형변환 필요 없음.
				int i2 = ch; // char 2byte  ->int 4byte  형변환 필요 없음.

		        System.out.println(" int 4byte -> byte 1byte : (byte)i -> byte b2 : "+ b2);
		        System.out.println(" byte 1byte -> char 2byte : (char)b ->char ch2 : "+ ch2);
		        System.out.println(" char 2byte -> short 2byte : (short)ch ->short s : "+ s);
		        System.out.println(" long  8byte -> float 4byte :  (float)l -> float f :"+ f);		        
		        System.out.println(" char 2byte  ->int 4byte : (int)ch -> int i2 : "+ i2);

	}
}
/* boolean 1byte
 * byte  8bit (1byte)
 * char 2byte
 * short  2byte
 * int    4byte
 * long 8byte
 * ------
 * float  4byte
 * double 8byte
  */
 