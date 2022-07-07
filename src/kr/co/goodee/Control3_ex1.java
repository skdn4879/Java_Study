package kr.co.goodee;

import java.util.Scanner;

public class Control3_ex1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 입력, 총점 및 평균 계산
		// 평균 90이상 A, 평균 80이상 B, 평균 70이상 C, 평균 60이상 D, 나머지 F
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int lang = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		
		boolean isLangValueCheck = lang <= 100 && lang >= 0 ? true : false;
		boolean isEngValueCheck = eng <= 100 && eng >= 0 ? true : false;
		boolean isMathValueCheck = math <= 100 && math >= 0 ? true : false;
		
		if(isLangValueCheck && isEngValueCheck && isMathValueCheck) {
			int total = lang + eng + math;
			int aver = total / 3;
			
			if(aver >= 90) {
				System.out.println("A");
			} else if(aver >= 80) {
				System.out.println("B");
			} else if(aver >= 70) {
				System.out.println("C");
			} else if(aver >= 60) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
			
			switch (aver / 10) {
				case 10:
					System.out.println("A");
					break;
				case 9:
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

}
