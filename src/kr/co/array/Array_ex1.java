package kr.co.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드부터 인원수를 입력받아서, 인원수만큼 이름을 입력받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력 : ");
		int len = sc.nextInt();
		String[] names = new String[len];
		
		for(int i = 0; i < len; i++) {
			System.out.print((i + 1) + "번째 이름 입력 : ");
			names[i] = sc.next();
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		int[] langs = new int[len];
		
		for(int i = 0; i < len; i++) {
			System.out.print(names[i] + "의 국어 점수 입력 : ");
			langs[i] = sc.nextInt();
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println(names[i] + ",  국어 점수 : " + langs[i]);
		}
		
		int totalLangScore = 0;
		
		for(int lang : langs) {
			totalLangScore += lang;
		}
		
		System.out.println("총 국어점수 : " + totalLangScore);
		
	}

}
