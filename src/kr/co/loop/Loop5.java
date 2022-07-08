package kr.co.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i < 5) {
			System.out.println("Hello World");
			i++;
		}
		
		boolean check = true;
		while(check) {
			System.out.println("1.성적입력, 2.총점계산, 3.평균계산, 4.종료");
			System.out.print("어떤 작업을 하시겠습니까? ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("성적 입력 선택");
				
			} else if(select == 2) {
				System.out.println("총점 계산 선택");
				
			} else if(select == 3) {
				System.out.println("평균 계산 선택");
				
			} else if(select == 4) {
				System.out.println("종료 선택");
				check = !check;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("\nFinish");
	}

}
