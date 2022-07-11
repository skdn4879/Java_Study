package kr.co.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String[] monsterNames = {"고블린", "오크", "트롤", "골렘"};
		int[] monsterHps = {5, 7, 10, 15};
		int leng = monsterNames.length;
		
		//법사
		System.out.print("캐릭터 이름 입력 : ");
		String characterName = sc.next();
		int characterHp = 30;
		int fireballDamage = 6; //몬스터 공격시 0 ~ 6 미만의 랜덤한 데미지로 몬스터 공격
		
		//몬스터 파티 생성
		//몬스터 수 입력(1 ~ 4)
		//몬스터 체력은 기본체력의 절반 ~ 기본체력까지
		System.out.print("몬스터의 수 입력 : ");
		int choosen = sc.nextInt();
		String[] choosenMonsterNames = new String[choosen];
		int[] choosenMonsterHps = new int[choosen];
		boolean[] choosenMonsterState = new boolean[choosen];
		
		for(int i = 0; i < choosen; i++) {
			int ran = random.nextInt(leng);
			double hpRan = random.nextDouble(0.5, 1);
			//int hpRan = random.nextInt(1, 3);
			choosenMonsterNames[i] = monsterNames[ran];
			choosenMonsterHps[i] = (int)(monsterHps[ran] * hpRan);
			choosenMonsterState[i] = true;
		}
		
		for(int i = 0; i < choosen; i++) {
			System.out.println("몬스터 이름 : " + choosenMonsterNames[i] + "   HP : " + choosenMonsterHps[i]);
		}
		System.out.println();
		
		/*for(String mon : choosenMonsterNames) {
			System.out.println(mon);
		}*/
		
		// 1회성 공격
		boolean gamesetFlag = false;
		boolean isRested = true;
		
		while(!gamesetFlag) {
			
			System.out.println("==========================================");
			System.out.println("당신의 턴!!!");
			System.out.print("커맨드 입력(1.파이어볼 광역기, 2.휴식) : ");
			int command = sc.nextInt();
			
			if(command == 1) {
				int flagCount = 0;
				
				for(int i = 0; i < choosen; i++) {
					if(choosenMonsterHps[i] > 0) {
						int damage = fireballAttack(fireballDamage);
						choosenMonsterHps[i] -= damage;
						System.out.println(characterName + "의 파이어볼 공격!  \t" + choosenMonsterNames[i] + "에게 \t" + damage + "만큼의 피해!\t" 
						+ "   남은 HP : " + choosenMonsterHps[i]);
					}
				}
				
				for(int i = 0; i < choosen; i++) {
					if (choosenMonsterHps[i] <= 0) {
						choosenMonsterState[i] = false;
					}
					
					String state = choosenMonsterState[i] ? "생존" : "사망";
					System.out.println("몬스터 이름 : " + choosenMonsterNames[i] + "\t   HP : " + choosenMonsterHps[i] + "\t 상태 : " + state);
				}
				
				System.out.println();
				System.out.println("몬스터의 턴!!!");
				for(int i = 0; i < choosen; i++) {
					if(choosenMonsterState[i]) {
						int hitPoint = hitDamage(choosenMonsterHps[i]);
						characterHp -= hitPoint;
						System.out.println(choosenMonsterNames[i] + "가 " + characterName + "에게 공격! \t" +
						hitPoint + "만큼의 피해! \t" + "남은 체력 : " + characterHp);
					}
				}
				
				for(int i = 0; i < choosen; i++) {
					if(choosenMonsterState[i] == false) {
						flagCount++;
					}
				}
				
				if(flagCount == choosen) {
					gamesetFlag = !gamesetFlag;
					System.out.println("\n모든 적 사망, 게임종료");
				} else if(characterHp <= 0) {
					gamesetFlag = !gamesetFlag;
					System.out.println("\n캐릭터 사망, 패배 ㅠㅠ");
				}
			} else if(command == 2) {
				if(isRested) {
					System.out.println("휴식으로 체력 회복");
					characterHp += rest();
					if(characterHp > 30) {
						characterHp = 30;
					}
					System.out.println(characterName + "의 남은 체력 : " + characterHp);
					isRested = !isRested;
				} else {
					System.out.println("이미 전투중에 한번 쉬었습니다.");
				}
			} else if(command == 0) {
				break;
			}
			
		}
		
	}
	
	public static int fireballAttack(int fireballDamage) {
		Random random = new Random();
		double damageRate = random.nextDouble(1);
		return (int)(fireballDamage * damageRate);
	}
	
	public static int hitDamage(int monsterHp) {
		Random random = new Random();
		double damageRate = random.nextDouble(1);
		return (int)(monsterHp * damageRate);
	}
	
	public static int rest() {
		Random random = new Random();
		double restRate = random.nextDouble(1);
		return (int)(10 * restRate);
	}

}
