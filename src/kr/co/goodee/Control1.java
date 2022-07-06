package kr.co.goodee;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// 제어문
		// 1. 단일 if문
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "은(는) 짝수입니다.");
		} else {
			System.out.println(num + "은(는) 홀수입니다.");
		}
		
		if(num < 10) {
			System.out.println(num + "은(는) 10미만이다.");
		} else if(num == 10) {
			System.out.println(num + "은 10이다.");
		} else {
			System.out.println(num + "은(는) 10초과이다.");
		}
		
		System.out.println("\nFinish");
	}
	
	/*
	 * int limit = 101;
		int[] coins = {1, 5, 7, 10, 16};
		int[] data = new int[limit];
		
		data[0] = 0;
		data[1] = 1;
		
		for(int i = 2; i < limit; i++) {
			data[i] = limit;
		}
		
		for(int coin : coins) {
			for(int i = coin; i < limit; i++) {
				int minValue = Math.min(data[i], data[i - coin] + 1);
				data[i] = minValue;
			}
		}
		
		for(int i = 1; i < limit; i++) {
			System.out.println("인덱스 : " + i + "\t값: " + data[i]);
		}*/

}
