package kr.co.goodee;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// 문자 하나를 입력, ex) a -> c, b -> d, d -> f
		// 숫자를 입력 2일 경우 위의 상태
		// 단, z를 넘어갈 경우 다시 알파벳 순환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력(1 ~ 5) : ");
		int crypto = sc.nextInt();
		
		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		int trans = (int)ch;
		
		int numLargeA = (int)'A';
		int numLargeZ = (int)'Z';
		int numA = (int)'a';
		int numZ = (int)'z';
		int calculation = trans + crypto;
		char result = ' ';
		
		boolean isLargeAlpa = trans >= numLargeA && trans <= numLargeZ ? true : false;
		
		if(isLargeAlpa) {
			if(calculation >= numLargeA && calculation <= numLargeZ) {
				result = (char)(calculation);
			} else {
				result = (char)(calculation - numLargeZ + numLargeA - 1);
			}
		} else {
			if(calculation >= numA && calculation <= numZ) {
				result = (char)(calculation);
			} else {
				result = (char)(calculation - numZ + numA - 1);
			}
		}
		
		System.out.println("암호화된 문자 : " + result);
		
		/*if(calculation >= numA && calculation <= numZ) {
			result = (char)(calculation);
		} else if(calculation > numZ) {
			result = (char)(calculation - numZ + numA - 1);
		} else {
			System.out.println("알파벳 소문자만 입력해주세요.");
		}
		
		System.out.println("암호화된 문자 : " + result);*/
		
		/*for(int i = 65; i <= numZ; i++) {
			System.out.println((char)i);
		}*/
		//Test
	}

}
