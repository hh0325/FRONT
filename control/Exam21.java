package ch02.control;

/**
 * @날짜 : 2025. 9. 3.
 * @작성자: 김현희
 * @설명 : 제어문 - 조건문(switch ~case 문)
 *
 * case -> :사용
 *
 *
 *
 */
public class Exam21 {

	public static void main(String[] args) {
		int su = 5;
		switch(su+10) {
		
		case 10:
		System.out.println("10번 나왔습닏다");
		break;
		case 15:
		System.out.println("15번 나왔습니다");
		break;
		case 20:
		System.out.println("20번 나왔습니다");
		break;
		case 25:
		System.out.println("25번 나왔습니다");
		break;
		
		}
System.out.println();

switch(su%2) {
case 0:
	System.out.println("짝수");
	break;
	
case 1:
	System.out.println("홀수");
	break;
     }
   }
 }
