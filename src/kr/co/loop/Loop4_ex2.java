package kr.co.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FPS
		//ammo : 
		//ammo pack : 30pieces, given 3 ammo packs
		// 1. single shot, 2.semi - auto
		
		Scanner sc = new Scanner(System.in);
		int ammo = 30;
		int ammoPack = 3;
		System.out.print("조정간(1. 단발, 2. 점사) : ");
		int select = sc.nextInt();
		
		System.out.println("Engage hostiles\n");
		if(select == 1) {
			for(int i = 0; i < ammoPack; i++) {
				for(int j = 0; j < ammo; j++) {
					System.out.println("Bang");
				}
				if(i < ammoPack - 1) {
					System.out.println("\nReload\n");
				}
			}
		} else if(select == 2) {
			for(int i = 0; i < ammo; i++) {
				if(i / 10 > 0 && i % 10 == 0) {
					System.out.println("Reload\n");
				}
				for(int j = 0; j < ammoPack; j++) {
					System.out.println("Bang");
				}
				System.out.println();
			}
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.println("Area Is Secured And All Hostile Target Neutralized");
		System.out.println("Set Is Confirmed");
		System.out.println("Mission Completed");
	}

}
