package kr.co.array;

public class Array_7 {

	public static void main(String[] args) {
		int[] ar = {4, 7, 1, 3, 9};
		//내림차순
		int len = ar.length;
		for(int i = 0; i < len - 1; i++) {
			for(int j = i + 1; j < len; j++) {
				if(ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < len; i++) {
			System.out.println(ar[i]);
		}
	}

}
