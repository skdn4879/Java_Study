package kr.co.array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// 배열은 어떤 데이터타입이든 상관 X, 단 한 배열 내의 데이터타입은 일정해야한다.
		String[] strs = new String[3];
		strs[0] = "name";
		strs[1] = "yudang";
		strs[2] = "wow";
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		
		int[] nums = new int[3];
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}	// heap 영역은 별도의 지시가 없으면 자동으로 초기화 진행
		
		Scanner[] sc = new Scanner[2];	// 참조 타입은 다 모을 수 있다.
		
		int[] nums2 = {1, 4, 52};	//선언과 동시에 초기화
		
	}

}
