package kr.co.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int num = random.nextInt(10);	//0부터 매개변수 -1까지의 랜덤 정수 생성
		System.out.println(num);
		
		// 가위 바위 보
		// 0 - 가위, 1 - 바위, 2 - 보
		// 사용자가 하나 입력, 컴퓨터 랜덤, 이길때까지
		boolean isWin = false;
		while(!isWin) {
			System.out.println("가위 바위 보");
			int what = random.nextInt(3);
			System.out.print("뭐 낼래? ");
			int mine = sc.nextInt();
			
			if(mine >= 0 && mine <3) {
				String com = weapon(what);
				String my = weapon(mine);
				String result = winner(what, mine);
				
				System.out.println("컴퓨터 : " + com + ",  유저 : " + my + ",    결과 : " + result);
				System.out.println();
				isWin = isUserWin(what, mine);
			} else {
				System.out.println("잘못된 입력입니다.\n");
			}
			
		}
		
		System.out.println("\nFinish");
		
	}

	public static String weapon(int number) {
		String tool = "";
		switch(number) {
		case 0:
			tool = "가위";
			break;
		case 1:
			tool = "바위";
			break;
		case 2:
			tool = "보";
			break;
		}
		return tool;
	}
	
	public static String winner(int what, int mine) {
		int result = what - mine;
		String resultString = "";
		if(result == -1 || result == 2) {
			resultString = "유저 승리, 컴퓨터 패배";
		} else if(result == 1 || result == -2) {
			resultString = "컴퓨터 승리, 유저 패배";
		} else if(result == 0) {
			resultString = "비겼다.";
		}
		return resultString;
	}
	
	public static boolean isUserWin(int what, int mine) {
		int result = what - mine;
		boolean flag = false;
		if(result == -1 || result == 2) {
			flag = !flag;
		}
		return flag;
	}
	
}
