package kr.or.ddit.homework.home16;

import java.util.Random;

public class CNation implements Nation2 {
	
//	C 나라에서는 
//	 *      1. 세금이 20% + 생활비 3000
//	 *    	2. 홀짝 게임   (상금 : 15000)
	
	
	@Override
	public int tax(int money) {
		int afterMoney = (int)(money*0.8-3000);
		return afterMoney;
	}

	@Override
	public int game(int money) {
		
		int comNum = generateRandomNumber();
		
		int result;
		String message = "실패";
		if(comNum % 2 == 1)
		{
			result = 1;
		}
		else
			result = 2;
		
		System.out.println("홀(1) 짝(2)");
		int myNum = sc.nextInt();
		
		int afterMoney = money;
		if(result == myNum)
		{
			message = "성공";
			afterMoney+=15000;
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
	
	public int generateRandomNumber() {
		return new Random().nextInt(100)+1;
	}
}
