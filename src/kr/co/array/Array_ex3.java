package kr.co.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//1. 학생 정보 입력, 2. 학생 정보 조회, 3.학생 정보 검색, 4.학생 정보 삭제, 5.학생 정보 추가, 6.프로그램 종료
		//1. 학생 수 입력, 이름, 번호, 국어, 영어, 수학 입력받음, 총점과 평균도 계산후 기록
		//2. 모든 학생의 이름, 번호, 총점, 평균이 출력
		//3. 검색할 학생의 번호 입력, 입력한 번호와 일치하는 학생의 모든 정보 출력, 없으면 없는 번호라 출력
		//4. 삭제할 학생의 번호 입력, 입력한 번호와 일치하는 학생의 모든 정보 삭제, 없으면 없는 번호라 출력(배열 한칸 삭제)
		//5. 이름, 번호, 국어, 영어, 수학, 총점, 평균 추가
		Scanner sc = new Scanner(System.in);
		
		String[] names = new String[0];
		int[] nums = new int[0];
		int[] langScores = new int[0];
		int[] engScores = new int[0];
		int[] mathScores = new int[0];
		int[] totalScores = new int[0];
		int[] averScores = new int[0];
		int count = 0;
		
		boolean isContinue = true;
		while(isContinue) {
			System.out.println();
			System.out.print("1. 학생 정보 입력, 2. 학생 정보 조회, 3.학생 정보 검색, 4.학생 정보 삭제, 5.학생 정보 추가, 6.프로그램 종료 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("학생 수 입력 : ");
				count = sc.nextInt();
				names = new String[count];
				nums = new int[count];
				langScores = new int[count];
				engScores = new int[count];
				mathScores = new int[count];
				totalScores = new int[count];
				averScores = new int[count];
				
				for(int i = 0; i < count; i++) {
					System.out.println("=============================");
					System.out.print("이름 입력 : ");
					names[i] = sc.next();
					System.out.print("번호 입력 : ");
					nums[i] = sc.nextInt();
					//nums[i] = i + 1;
					System.out.print("국어 점수 입력 : ");
					langScores[i] = sc.nextInt();
					System.out.print("영어 점수 입력 : ");
					engScores[i] = sc.nextInt();
					System.out.print("수학 점수 입력 : ");
					mathScores[i] = sc.nextInt();
					totalScores[i] = langScores[i] + engScores[i] + mathScores[i];
					averScores[i] = totalScores[i] / 3;
					System.out.println("=============================");
				}
				
			} else if(select == 2) {
				System.out.println("=============================");
				System.out.println("\t이름\t\t번호\t\t총점\t\t평균");
				for(int i = 0; i < count; i++) {
					System.out.println("\t" + names[i] + "\t\t" + nums[i] + "\t\t" + totalScores[i] + "\t\t" + averScores[i]);
				}
				System.out.println("=============================");
			} else if(select == 3) {
				System.out.println("총 학생 수 : " + count);
				for(int i = 0; i < count; i++) {
					System.out.print(nums[i] + ". " + names[i] + "\t");
				}
				System.out.println();
				System.out.print("검색할 학생 번호 입력 : ");
				int num = sc.nextInt();
				boolean isExist = false;
				int targetIndex = 0;
				for(int i = 0; i < count; i++) {
					if(num == nums[i]) {
						isExist = !isExist;
						targetIndex = i;
						break;
					}
				}
				if(!isExist) {
					System.out.println("없는 학번입니다.");
				} else {
					//num -= 1;
					System.out.println("=============================");
					System.out.println("\t이름\t번호\t국어점수\t영어점수\t수학점수\t총점\t평균");
					System.out.println("\t" + names[targetIndex] + "\t" + nums[targetIndex] + "\t" +
					langScores[targetIndex] + "\t" + engScores[targetIndex] + "\t" + mathScores[targetIndex] + 
					"\t" + totalScores[targetIndex] + "\t" + averScores[targetIndex]);
					System.out.println("=============================");
				}
			} else if(select == 4) {
				System.out.println("총 학생 수 : " + count);
				for(int i = 0; i < count; i++) {
					System.out.print(nums[i] + ". " + names[i] + "\t");
				}
				System.out.println();
				System.out.print("삭제할 학생 번호 입력 : ");
				int num = sc.nextInt();
				boolean isExist = false;
				int targetIndex = 0;
				for(int i = 0; i < count; i++) {
					if(num == nums[i]) {
						isExist = !isExist;
						targetIndex = i;
						break;
					}
				}
				if(!isExist) {
					System.out.println("없는 학번입니다.");
				} else {
					//num -= 1;
					String[] copyNames = new String[count - 1];
					int[] copyNums = new int[count - 1];
					int[] copyLangScores = new int[count - 1];
					int[] copyEngScores = new int[count - 1];
					int[] copyMathScores = new int[count - 1];
					int[] copyTotalScores = new int[count - 1];
					int[] copyAverScores = new int[count - 1];
					for(int i = 0; i < targetIndex; i++) {
						copyNames[i] = names[i];
						copyNums[i] = nums[i];
						copyLangScores[i] = langScores[i];
						copyEngScores[i] = engScores[i];
						copyMathScores[i] = mathScores[i];
						copyTotalScores[i] = totalScores[i];
						copyAverScores[i] = averScores[i];
					}
					for(int i = targetIndex + 1; i < count; i++) {
						copyNames[i - 1] = names[i];
						copyNums[i - 1] = nums[i];
						copyLangScores[i - 1] = langScores[i];
						copyEngScores[i - 1] = engScores[i];
						copyMathScores[i - 1] = mathScores[i];
						copyTotalScores[i - 1] = totalScores[i];
						copyAverScores[i - 1] = averScores[i];
					}
					names = copyNames;
					nums = copyNums;
					langScores = copyLangScores;
					engScores = copyEngScores;
					mathScores = copyMathScores;
					totalScores = copyTotalScores;
					averScores = copyAverScores;
					count -= 1;
					System.out.println(num + "번 학생 정보 삭제 완료");
				}
			} else if(select == 5) {
				String[] copyNames = new String[count + 1];
				int[] copyNums = new int[count + 1];
				int[] copyLangScores = new int[count + 1];
				int[] copyEngScores = new int[count + 1];
				int[] copyMathScores = new int[count + 1];
				int[] copyTotalScores = new int[count + 1];
				int[] copyAverScores = new int[count + 1];
				for(int i = 0; i < count; i++) {
					copyNames[i] = names[i];
					copyNums[i] = nums[i];
					copyLangScores[i] = langScores[i];
					copyEngScores[i] = engScores[i];
					copyMathScores[i] = mathScores[i];
					copyTotalScores[i] = totalScores[i];
					copyAverScores[i] = averScores[i];
				}
				System.out.println("=============================");
				System.out.print("이름 입력 : ");
				copyNames[count] = sc.next();
				System.out.print("번호 입력 : ");
				//nums[i] = sc.nextInt();
				copyNums[count] = sc.nextInt();
				System.out.print("국어 점수 입력 : ");
				copyLangScores[count] = sc.nextInt();
				System.out.print("영어 점수 입력 : ");
				copyEngScores[count] = sc.nextInt();
				System.out.print("수학 점수 입력 : ");
				copyMathScores[count] = sc.nextInt();
				copyTotalScores[count] = copyLangScores[count] + copyEngScores[count] + copyMathScores[count];
				copyAverScores[count] = copyTotalScores[count] / 3;
				System.out.println("=============================");
				
				names = copyNames;
				nums = copyNums;
				langScores = copyLangScores;
				engScores = copyEngScores;
				mathScores = copyMathScores;
				totalScores = copyTotalScores;
				averScores = copyAverScores;
				count += 1;
				System.out.println("학생 추가 완료");
			} else if(select == 6) {
				isContinue = !isContinue;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 입력");
			}
		}
	}

}
