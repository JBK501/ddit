package kr.or.ddit.homework.home16;

import java.util.Scanner;

public class HomeWork16 {
	public static void main(String[] args) {
		HomeWork16 hw = new HomeWork16();
		hw.process();
	}
	
	public void process() {
		/*		
		 *    Nation 클래스 
		 *    1. tax  메소드 생성
		 *    2. game 메소드 생성
		 *    
		 *    1 -> 게임 시행시 모든 보유 금액에 관하여 세금이 매겨짐
		 *    2 -> 각 게임별 성공시 보상 금액 제공
		 * 
		 *    A 나라에서는 
		 *      1. 세금이 10% + 생활비 1000
		 *      2. 주사위 2개 숫자 맞추기 게임. (상금 : 30000)  
		 *    B 나라에서는 
		 *      1. 세금이 15% + 생활비 2000
		 *      2. 가위바위보 게임  (상금 : 20000)
		 *    C 나라에서는 
		 *      1. 세금이 20% + 생활비 3000
		 *    	2. 홀짝 게임   (상금 : 15000)
		 *     
		 */
		int cnt=0;
		int money =5000;
		String sel;
		Nation2 nation = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt++<3) {
			
			System.out.println("나라 선택(A, B, C)");
			sel = sc.next();
			
			if(sel.equals("A")) nation = new ANation();
			else if(sel.equals("B"))nation = new BNation();
			else if(sel.equals("C"))nation = new CNation();
			
			money = nation.tax(money);
			if(money < 0){
				System.out.println("현재금액 : "+money+"\n잔액이 부족합니다.");
				break;
			}
			
			money = nation.game(money);
			System.out.println("보유금액 :"+money);
		}
	}
}
