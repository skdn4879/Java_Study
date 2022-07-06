package kr.co.goodee;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		//짝수일 경우 짝수입니다. 홀수일 경우 홀수입니다. 단, if문은 딱 한 번만 쓴다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		// 방법1-1
		String result = num % 2 == 0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(num + "은(는) " + result);
		
		// 방법1-2
		String result4 = "홀수입니다.";
		boolean isEven = num % 2 == 0 ? true : false;
		if (isEven) {
			result4 = "짝수입니다.";
		}
		System.out.println(num + "은(는) " + result4);
		
		// 방법2-1
		String result2 = "홀수입니다.";
		if(num % 2 == 0) {
			result2 = "짝수입니다.";
		}
		System.out.println(num + "은(는) " + result2);
		
		// 방법2-2
		String result3 = "짝수입니다.";
		if(num % 2 == 1) {
			result3 = "홀수입니다.";
		}
		System.out.println(num + "은(는) " + result3);
	}

}
