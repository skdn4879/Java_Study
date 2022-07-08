package kr.co.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static class LocalUser{
		private String id = "";
		private String password = "";
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
	}
	
	public static LocalUser user = new LocalUser();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isStop = false;
		boolean isLoginSuccess = false;
		
		while(!isStop) {
			
			System.out.println("1. 유저등록, 2.로그인, 0.종료");
			System.out.print("어떤 작업을 하시겠습니까? ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("아이디 등록 : ");
				String myId = sc.next();
				System.out.print("패스워드 등록 : ");
				String myPw = sc.next();
				user.setId(myId);
				user.setPassword(myPw);
				System.out.println("유저 등록 완료");
			}
			else if(select == 2) {
				if(isUserNotExist()) {
					System.out.println("유저 등록을 먼저 해주세요.");
					continue;
				} else {
					boolean isLoginStop = false;
					while(!isLoginStop) {
						System.out.print("아이디 입력 : ");
						String myId = sc.next();
						System.out.print("패스워드 입력 : ");
						String myPw = sc.next();
							
						if(isRightValue(myId, myPw)) {
							System.out.println("로그인 성공");
							isLoginStop = !isLoginStop;
							isStop = !isStop;
							isLoginSuccess = !isLoginSuccess;
						} else {
							boolean isRetry = true;
							while(isRetry) {
								System.out.print("계속 시도합니까?(y, n) : ");
								char flag = sc.next().charAt(0);
								if(flag == 'y') {
									isRetry = !isRetry;
								} else if(flag == 'n') {
									isRetry = !isRetry;
									isLoginStop = !isLoginStop;
								} else {
									System.out.println("잘못된 입력입니다.");
								}
							}
						}
					}
				}
			}
			else if(select == 0) {
				isStop = !isStop;
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		if(isLoginSuccess) {
			System.out.println("게임시작");
			boolean isMaxLevel = false;
			
			int level = 1;
			int maxLevel = 15;
			int expBar = 0;
			int gold = 1000;
			
			while(!isMaxLevel) {
				
				expBar = level * 3;
				
				for(int i = 1; i <= expBar; i++) {
					System.out.println("몬스터 1마리 사냥");
				}
				System.out.println("\n레벨업!!!!!\n");
				level++;
				
				if(isGiveGold(level)) {
					gold += giveGold(level);
				}
				
				if(level == maxLevel) {
					isMaxLevel = !isMaxLevel;
				}
			}
			
			System.out.println("게임종료");
			System.out.println("레벨 : " + level + ",  골드 : " + gold);
			
		}
		
		System.out.println("\nFinish");
	}
	//로그인에 성공했으면 게임 시작
	//RPG, 시작레벨 1, 만렙 15, 모든 몬스터의 경험치는 동일, 보유골드 1000
	//1->2는 3마리, 2->3는 6마리, 3->4는 9마리, 4->5는 12마리
	//5렙 달성시 축하금 1000골드 지급, 10렙은 2000골드, 15렙은 3000골드, 총 7000골드
	
	public static boolean isUserNotExist() {
		return user.getId().isEmpty() || user.getPassword().isEmpty() ? true : false;
	}
	
	public static boolean isRightValue(String id, String pw) {
		boolean isRightId = id.equalsIgnoreCase(user.getId()) ? true : false;
		boolean isRightPw = pw.equalsIgnoreCase(user.getPassword()) ? true : false;
		return isRightId && isRightPw;
	}
	
	public static boolean isGiveGold(int level) {
		boolean giveFlag = level / 5 > 0 && level % 5 == 0 ? true : false;
		return giveFlag;
	}
	
	public static int giveGold(int level) {
		return (level / 5) * 1000;
	}

}
