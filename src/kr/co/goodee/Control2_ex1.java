package kr.co.goodee;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// 월급을 입력받음, 1을 입력하면 정규직, 2를 입력하면 계약직
		// 정규직이면 세금 부여(국민연금 : 월급의 1%, 건강보험 : 급여의 1.4%, 고용보험 : 급여의 0.5%, 산재보험 : 급여의 0.7%)
		// 계약직이면 급여의 3.3%
		Scanner sc = new Scanner(System.in);
		System.out.print("월급 입력 : ");
		int salary = sc.nextInt();
		System.out.print("고용 형태 입력(1 - 정규직, 2 - 계약직) : ");
		int typeOfJob = sc.nextInt();
		
		if(typeOfJob == 1) {
			salary -= (int)((salary * 0.01) + (salary * 0.014) + (salary * 0.005) + (salary * 0.007));
		} else {
			salary -= (int)(salary * 0.033);
		}
		System.out.println("최종 급여 : " + salary);
		
		// 굳이 굳이 어렵게 돌아가겠다.
		System.out.print("월급 입력 : ");
		int salary2 = sc.nextInt();
		System.out.print("고용 형태 입력(정규직, 계약직) : ");
		boolean isFulltimeJob = sc.next().equalsIgnoreCase("정규직") ? true : false;
		
		if(isFulltimeJob) {
			salary2 -= (int)((salary2 * 0.01) + (salary2 * 0.014) + (salary2 * 0.005) + (salary2 * 0.007));
		} else {
			salary2 -= (int)(salary2 * 0.033);
		}
		System.out.println("최종 급여 : " + salary2);
	}

}
