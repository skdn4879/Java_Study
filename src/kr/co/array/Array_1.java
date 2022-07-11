package kr.co.array;

public class Array_1 {

	public static void main(String[] args) {
		// 배열 선언
		// 모을려고하는데이터타입[] 변수명
		int[] nums = new int[5];
		char[] names = new char[2];
		String name = "";
		
		nums[0] = 10;
		nums[1] = 30;
		names[0] = 'a';
		name = "wow";
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(names[0]);
		System.out.println(name);
		// 자바는 메모리 영역을 3가지로 구분 method 영역, stack 영역, heap 영역
		// 원시타입은 stack영역에 생성
		// new 로 선언하는 참조타입은 heap영역에 생성
		// 배열 같은 경우에는 배열 자체는 heap영역에 있고
		// 위의 nums에는 해당 배열의 시작점 주소를 가지고있는 주소가 저장되어있다.(nums는 stack 영역에 생성)
		// 즉, 값은 heap영역의 특정 메모리 공간에 생성되고 우리가 선언한 변수명에는 해당 heap 메모리 주소값이 stack영역에 저장된다.
		// 우리가 값을 사용할때에는 선언된 변수 안의 주소에 해당하는 heap 공간을 찾아가 값을 꺼내온다.
		// 배열은 어차피 시작점으로부터 해당 인덱스 * 데이터타입 크기 만큼 접근할 수 있다. 연속된 공간이므로
	}

}
