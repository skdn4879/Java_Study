package kr.co.loop;

public class Loop1 {

	public static void main(String[] args) {
		System.out.println("Start\n");
		
		// for(초기식; 조건식; 증감식){}
		// for(int i = 0; i < 5; i = i + 1)
		// for(int i = 0; i < 5; i += 1)
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello World");
		}
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			count += i;
			System.out.println(i);
			System.out.println(count);
		}
		
		System.out.println("\nFinish");
	}

}
