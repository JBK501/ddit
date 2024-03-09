package kr.or.ddit.homework.home16;

import java.util.Random;

public class ANation implements Nation2{

	//		  A 나라에서는 
	 //*      1. 세금이 10% + 생활비 1000
	 //*      2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000)  
	
	@Override
	public int tax(int money) {
		int afterMoney = (int)(money*0.9 -1000); 
		return afterMoney;
	}

	@Override
	public int game(int money) {
		

		int comNum = ThrowTwoDice();
		
		System.out.print("숫자입력 : ");
		int myNum = sc.nextInt();
		
		int afterMoney = money;
		String message;
		if(comNum == myNum) {
			afterMoney += 30000;
			message = "승리";
		}else {
			message = "패배";
		}
		
		System.out.println("======================");
		System.out.println("[결과]");
		System.out.println("컴퓨터 : "+comNum);
		System.out.println("나 : "+myNum);
		System.out.println("======================");
		System.out.println(message);
		System.out.println("======================");
		
		return afterMoney;
	}
	
	public int ThrowDice() {
		return new Random().nextInt(6)+1;
	}
	
	public int ThrowTwoDice() {
		return ThrowDice() + ThrowDice();
	}
	
}
