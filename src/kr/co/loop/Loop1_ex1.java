package kr.co.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		// 0 ~ 9 출력하는 반복문, 단, 출력은 짝수만 출력하세요
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = 0; i < 10; i = addon(i)) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\n출력 횟수 입력 : ");
		int limit = sc.nextInt();
		for(int i = 0; i < limit; i++) {
			System.out.println("Baw Baw");
		}
	}
	
	public static int addon(int i) {
		return i + 2;
	}

}
