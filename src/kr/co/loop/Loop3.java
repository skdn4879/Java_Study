package kr.co.loop;

public class Loop3 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.print("1 대문자, 2 소문자, 3 종료 : ");
			int select = 1;
			switch(select) {
			case 1:
				System.out.println("대문자");
				break;
			case 2:
				System.out.println("소문자");
				break;
			default:
				System.out.println("종료");
				break;	//반복문 안의 switch문 안의 break가 있다고 해서 반복문이 종료되지는 않는다.
				// 만약 반복문을 종료시킨다면 조건식의 범위를 벗어나게 조건 값을 수정한다. ex) i = 1000;
			}
		}
	}

}
