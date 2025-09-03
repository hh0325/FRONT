package ch01.dataType;
/**
 * @날짜 : 2025. 8. 20.
 * @작성자: 김현희
 * @설명 : 단항연산자 : !(일반부정), ~(이진 또는 비트 부정), +/-
*/

public class Exam02 {
	
	public static void main(String[] args) {
// ! (일반부정)
		boolean a=false;
		boolean b=!a;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		// ~ (이진 또는 비트 부정)
		int c=~10;
		// 0000 1010 : 10
		// 1111 0101 : -11  음수의 하나큰 값
		
		System.out.println(c);
		System.out.println();
		
		int d=~-15;
		//1111 0001 : -15
		//0000 1000 : 14  양수의 하나 작은 값
		
		System.out.println(d);
		System.out.println();
		
		// +/-
		int x=100;
		int y=-200;
		System.out.println(x + "\t" + y);   //100, -200
		System.out.println(-x + "\t" + -y); //-100, 200
		System.out.println(x + "\t" + y);   //원본데이터 영향 안준다 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
