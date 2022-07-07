package kr.co.goodee;

public class Control4 {

	public static void main(String[] args) {
		int select = 1;
		
		// 정수 변수, 문자열 변수, 정수식을 지정할 수 있당.
		switch(select) {
		case 1:
			System.out.println("1 일때 진행");
			break;
		case 2:
			System.out.println("2 일때 진행");
			break;
		case 3:
			System.out.println("3 일때 진행");
			break;
		default:
			System.out.println("나머지");
		}
	}

}
