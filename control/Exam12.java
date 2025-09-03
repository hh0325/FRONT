package ch02.control;

/**
 * @날짜 : 2025. 8. 22.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문 (if ~else 문)
 *  코세라
 */
public class Exam12 {

	public static void main(String[] args) {
	 int a = -25;
	 
	 if(a>0)
		 System.out.println("양수입니다");
	 else
	 System.out.println("음수입니다");

		if(a%2 ==0) {
			a+=100;
			System.out.println("짝수입니다" + a);
		}else {
			a*=200;   //곱셈대입연산자
			System.out.println("홀수입니다" + a);
		}
 
		//삼항식 표현
		String str =a>0 ? "양수" :"음수";   //?-> 조건식의 결과를 확인하는 연산자
		System.out.println(str);
		
	}

}
