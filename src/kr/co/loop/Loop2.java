package kr.co.loop;

public class Loop2 {

	public static void main(String[] args) {
		// 짝수만 출력
		for(int i = 0; i < 10; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
