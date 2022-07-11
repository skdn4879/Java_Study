package kr.co.array;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		int[] nums = new int[4];
		int len = nums.length;
		nums[0] = 20;
		nums[1] = 30;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < len; i++) {
			System.out.print((i + 1) + "번째 값 입력 : ");
			nums[i] = sc.nextInt();
		}
		
		for(int num : nums) {
			System.out.println(num);
		}
		
	}

}
