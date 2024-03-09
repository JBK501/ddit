package kr.or.ddit.homework.home16;

import java.util.Random;

public class BNation implements Nation2{
	
//	 *    B 나라에서는 
//	 *      1. 세금이 15% + 생활비 2000
//	 *      2. 가위바위보 게임  (상금 : 20000)
	
	
	@Override
	public int tax(int money) {
		int afterMoney = (int)(money*0.85-200);
		return afterMoney;
	}
	
	@Override
	public int game(int money) {
		
		int comNum = getComResult();
		System.out.println("0 : 가위 / 1 : 바위 / 2: 보");
		int myNum = sc.nextInt();
		
		String message="";
		switch (comNum) {
		case 0:
			if(myNum == 0)
				message = "비겼다.";
			else if(myNum == 1)
				message = "이겼다.";
			else if(myNum == 2)
				message = "졌다.";
			break;
		case 1:
			if(myNum == 0)
				message = "졌다.";
			else if(myNum == 1)
				message = "비겼다.";
			else if(myNum == 2)
				message = "이겼다.";
			break;
		case 2:
			if(myNum == 0)
				message = "이겼다.";
			else if(myNum == 1)
				message = "졌다.";
			else if(myNum == 2)
				message = "비겼다.";
			break;
		default:
			message = "잘못넣었다.";
			break;
		}		
		
		int afterMoney = money;
		if(message.equals("이겼다."))
			afterMoney+=20000;
		
		System.out.println("======================");
		System.out.println("[결과]");
		System.out.println("컴퓨터 : "+comNum);
		System.out.println("나 : "+myNum);
		System.out.println("======================");
		System.out.println(message);
		System.out.println("======================");
		
		return afterMoney;
	}
	
	public int getComResult() {
		return new Random().nextInt(3);
	}

}
