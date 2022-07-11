package kr.co.array;

public class Array_6 {

	public static void main(String[] args) {
		// 배열의 길이 변경(파이썬처럼 유동적으로 간편하게 변경 불가)
		int[] nums = {1, 2, 3};
		int[] copy = new int[nums.length - 1];
		
		System.out.println(nums.length);
		System.out.println();
		for(int i = 0; i < copy.length; i++) {
			copy[i] = nums[i];
			System.out.println(copy[i]);
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		//위에는 3크기의 배열과 2크기의 배열이 heap영역에 별개로 존재한다.
		//만약 기존의 변수명을 그대로 쓰고 싶다면 깊은복사 후 얕은 복사로 참조값을 바꾼다.
		
		nums = copy;
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
