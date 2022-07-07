package kr.co.loop;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			} //안쪽 for 끝
			System.out.println();
		} //바깥 for 끝
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1  3  5  7  9  11
		// 12 11 10 9  8  7
		int count = 0;
		int spaceCount = 12;
		for(int i = 1; i <= 25; i+=2) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < count; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			System.out.println();
			count = i;
			spaceCount--;
		}
		//spaceCount++;
		//count = 23;
		for(int i = 25; i >= 1; i-=2) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < count; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			System.out.println();
			count = i;
			spaceCount++;
		}
		
		//분과 초을 입력받아 ex) 1분 15초 -> 0분 0초에서 진행 후 1분 15초 도달시 종료
		/*Scanner sc = new Scanner(System.in);
		System.out.print("분 입력 : ");
		int minute = sc.nextInt();
		System.out.print("초 입력 : ");
		int second = sc.nextInt();
		
		for(int m = 0; m < 60; m++) {
			for(int s = 0; s < 60; s++) {
				System.out.println(m + "분 " + s + "초");
				if(m == minute && s == second) {
					break;
				}
			}
			if(m == minute) {
				break;
			}
		}*/
		
		System.out.println("\nFinish");
	} //메인 끝

}
