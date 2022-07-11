package kr.co.array;

public class Array_5 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		//System.out.println(nums.length);
		//얕은 복사
		int[] nums2 = nums;	//주소만 복사(참조값만 복사)
		//System.out.println(nums2.length);
		
		//깊은 복사
		int[] nums3 = new int[3];
		//System.out.println(nums3.length);
		for(int i = 0; i < nums3.length; i++) {
			nums3[i] = nums[i];
		}
		
		nums2[0] = 9;
		
		System.out.println(nums[0]);
		System.out.println(nums2[0]);
		System.out.println(nums3[0]);
		
		nums3 = new int[3];	//기존배열 해제, 새로운 배열 heap영역에 생성, nums3는 그 참조값을 가짐
		System.out.println(nums3[0]);
		
	}

}
