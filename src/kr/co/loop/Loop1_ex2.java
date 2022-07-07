package kr.co.loop;

import java.util.Scanner;

public class Loop1_ex2 {
	
	public static class LocalUser{
		private String userId = "";
		private String userPw = "";
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserPw() {
			return userPw;
		}
		public void setUserPw(String userPw) {
			this.userPw = userPw;
		}
		
	}
	
	public static LocalUser user = new LocalUser();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean stopFlag = false;
		char stopSign = 'n';
		
		while(!stopFlag) {
			System.out.print("\n문제 선택(1 ~ 6)(0 = 유저 등록 및 갱신) : ");
			int select = sc.nextInt();
			
			if(select == 0) {
				System.out.print("ID 등록 : ");
				user.setUserId(sc.next());
				System.out.print("PW 등록 : ");
				user.setUserPw(sc.next());
				System.out.println("유저 등록 완료");
			}
			else if(select == 1) {
				// 1번 대문자, 2번 소문자
				// 1번이면 A ~ Z 출력
				// 2번이면 a ~ z 출력
				/*
				 * int i = (int)'a';
				 * int j = (int)'z';
				 * if(flag == 1){
				 * 	i = (int)'A';
				 * 	j = (int)'Z';
				 * }
				 * 이런식으로 하면 for문 한 번만 써도 된다.*/
				System.out.print("1번 대문자, 2번 소문자 : ");
				int flag = sc.nextInt();
				switch(flag) {
				case 1:
					for(int i = (int)'A'; i <= (int)'Z'; i++) {
						System.out.println((char)i);
					}
					break;
				case 2:
					for(int i = (int)'a'; i <= (int)'z'; i++) {
						System.out.println((char)i);
					}
					break;
				default:
					System.out.println("잘못된 입력입니다.");
				}
			}
			else if(select == 2) {
				// 1 ~ 10까지의 합 구하기
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("\n1 ~ 10까지의 합 : " + sum);
			}
			else if(select == 3) {
				// 최대 5번 로그인시도 실패시 멈춤
				// ID, PW 입력해서 로그인 판단, 로그인 성공 시 종료
				int yId = 1234;
				int yPw = 5678;
				int id = 0;
				int pass = 0;
				
				for(int i = 0; i < 5; i++) {

					System.out.print("\n아이디 입력 : ");
					id = sc.nextInt();
					System.out.print("패스워드 입력 : ");
					pass = sc.nextInt();
					
					if(id == yId && pass == yPw) {
						System.out.println("\n로그인 성공");
						break;
					}
					
					if(i == 4) {
						System.out.println("\n로그인 실패");
						break;
					}
				}
			}
			else if(select == 4) {
				String id = "";
				String password = "";
				for(int i = 0; i < 5; i++) {
					System.out.print("\n아이디 입력 : ");
					id = sc.next();
					System.out.print("패스워드 입력 : ");
					password = sc.next();
					
					if(checkLogin(id, password)) {
						System.out.println("\n로그인 성공");
						break;
					}
					
					if(i == 4) {
						System.out.println("\n로그인 실패");
					}
				}
			}
			else if(select == 5) {
				String id = "";
				String password = "";
				int count = 0;
				boolean isCorrect = false;
				while(count < 5 && !isCorrect) {
					System.out.print("\n아이디 입력 : ");
					id = sc.next();
					System.out.print("패스워드 입력 : ");
					password = sc.next();
					
					isCorrect = checkLogin(id, password);
					count++;
				}
				
				if(isCorrect) {
					System.out.println("\n로그인 성공");
				} else {
					System.out.println("\n로그인 실패");
				}
			}
			else if(select == 6) {
				if(isUserEmpty()) {
					System.out.println("유저 등록이 필요합니다.");
				} else {
					String id = "";
					String password = "";
					int count = 0;
					boolean isCorrect = false;
					while(count < 5 && !isCorrect) {
						System.out.print("\n아이디 입력 : ");
						id = sc.next();
						System.out.print("패스워드 입력 : ");
						password = sc.next();
						
						isCorrect = checkUser(id, password);
						count++;
					}
					
					if(isCorrect) {
						System.out.println("\n로그인 성공");
					} else {
						System.out.println("\n로그인 실패");
					}
				}
			}
			else {
				System.out.println("\n없는 문제입니다.");
			}
			
			System.out.print("\n종료하시겠습니까(y, n) : ");
			stopSign = sc.next().charAt(0);
			if(stopSign == 'y') {
				stopFlag = true;
			}
		}
		
		System.out.println("\nFinish");
		
	}
	
	public static boolean checkLogin(String id, String password) {
		String yId = "id1234";
		String yPw = "password5678";
		boolean isRightId = id.equalsIgnoreCase(yId) ? true : false;
		boolean isRightPw = password.equalsIgnoreCase(yPw) ? true : false;
		return isRightId && isRightPw;
	}
	
	public static boolean checkUser(String id, String password) {
		boolean isRightId = id.equalsIgnoreCase(user.getUserId()) ? true : false;
		boolean isRightPw = password.equalsIgnoreCase(user.getUserPw()) ? true : false;
		return isRightId && isRightPw;
	}
	
	public static boolean isUserEmpty() {
		return user.getUserId().isEmpty() || user.getUserPw().isEmpty() ? true : false;
	}

}
