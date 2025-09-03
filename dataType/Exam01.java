package ch01.dataType;

/**
 * @날짜 : 2025. 8. 20.
 * @작성자: 김현희
 * @설명 : 자료형
 *   byte(1byte, 8bit), 
     short(2byte, 16bit),
     int(4byte, 32bit), 
     long(8byte, 64bit)
 * 
 * \n 줄바꿈 \t 띄어쓰기
 * 
 * 면접질문? 컬렉션 프레임워크 
 *  -객체를 모아서 처리하는 구조 
 *  자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제. 검색할 수 있도록 java.util 패키지에 관련된 인터페이스와 
 *  클래스를 포함시켜 놓았는데 이를 총칭해서 컬렉션 프레임워크라고 한다. list/Set/ Map이 있다
 *   
 *  
 *  자바 = keyvalue
 *  
 *  list 계열 - ArrayList//,,,
 *  SET 계열 
 *  Map 계열

 * 
 */

public class Exam01 {

	public static void main(String[] args) {
		
		System.out.println("안녕하세요");
		System.out.print("hi");
		System.out.println("How are you"+"\n");
        System.out.println();
		
		
		System.out.println("정수형(기본) 자료형");
		byte a = 10; // 1byte(-128~127)
		short b = 128; // 2byte(-32768 ~ 32767)
		int c = 1000; // 4byte(-2147483648 ~ 2147483647)
		long d = 6580L; // 8byte(-2^63 ~ 2^63-1)
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c + "\t" + "d:" + d);
        System.out.println();
        
		System.out.println("실수형 자료형");
		float e = 45.4f;                       //4byte(1.4e-45~3.4082E38)
		double f = 120.40;                     //8byte(4.92E-324~1.8E308)  
		System.out.println("e:" + e + "\t" + "f:" + f);
        System.out.println();
        
		System.out.println("문자 자료형");
		char x = 'A';                          // 2byte
 		char y = '김';
		System.out.println(x + "\t" + y);
		System.out.println();
		
		System.out.println("문자열 자료형");
		String str1 = "Hello java";          //무한 참조형
		String str2 = "Hello are you?" ;
		String str3 = "반가워요";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();

		System.out.println("논리형");
		boolean b1 = true;  // true(1), false(0)
		boolean b2=false;
		System.out.println(b1);
		System.out.println(b2);
		
		char ch=65;
		if(ch>64) System.out.println(ch);
		
		
		
		
		
		
	}

}
