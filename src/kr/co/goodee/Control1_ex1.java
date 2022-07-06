package kr.co.goodee;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// 키보드로부터, 국어, 영어, 수학 점수를 차례대로 입력받아 총점과 평균을 계산
		// 평균이 90점 이상이면 우등상 수상 출력, 모든 학생들은 졸업 출력
		// 평균이 90점 이상이면 A, 평균이 80점 이상이면 B, 평균이 70점 이상이면 C, 평균이 60점 이상이면 D, 나머지 F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 입력 : ");
		int lang = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		int total = lang + eng + math;
		int aver = total / 3;
		
		System.out.println("니 평균 : " + aver);
		
		if(aver >= 90) {
			System.out.println("우등상 수상, 학점 A");
		} else if(aver >= 80) {
			System.out.println("졸업, 학점 B");
		} else if(aver >= 70) {
			System.out.println("졸업, 학점 C");
		} else if(aver >= 60) {
			System.out.println("졸업, 학점 D");
		} else {
			System.out.println("졸업, 학점 F");
			// F인데 졸업??
		}
		
		/*
		 * if(aver >= 90){
		 * 		System.out.println("우등상 수상");
		 * }
		 * System.out.println("졸업");*/
	}

}
