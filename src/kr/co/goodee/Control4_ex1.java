package kr.co.goodee;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		// 국어 영어 수학 점수를 받아, 총합 및 평균 계산
		// 등급은 이전과 같다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int lang = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		/*boolean isLangValueCheck = lang <= 100 && lang >= 0 ? true : false;
		boolean isEngValueCheck = eng <= 100 && eng >= 0 ? true : false;
		boolean isMathValueCheck = math <= 100 && math >= 0 ? true : false;*/
		
		boolean isRight = checkRightValue(lang, eng, math);
		// isLangValueCheck && isEngValueCheck && isMathValueCheck
		if(isRight) {
			int total = lang + eng + math;
			int aver = total / 3;
			
			switch(aver / 10) {
			case 9:
			case 10:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
		} else {
			System.out.println("점수 입력 오류 : 0 ~ 100의 값으로 입력하세요.");
		}
	}
	
	public static boolean checkRightValue(int lang, int eng, int math) {
		boolean isLangRight = lang <= 100 && lang >= 0 ? true : false;
		boolean isEngRight = eng <= 100 && eng >= 0 ? true : false;
		boolean isMathRight = math <= 100 && math >= 0 ? true : false;
		
		boolean checkingResult = isLangRight && isEngRight && isMathRight;
		
		return checkingResult;
	}

}
