package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork04 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork04 obj = new HomeWork04();
		
		obj.process();
	}
	
	public void process() {
		// 0 -> 가위 / 1 -> 바위 / 2 -> 보
		
		// 컴퓨터가 랜덤으로 내는 가위바위보랑
		// 내가 입력한 가위바위 보를 비교해서 승패를 출력
		
		// ex) 컴퓨터 : 가위, 사람 : 보
		// -> 결과 : 졌다 / 이겼다  / 비겼다. 
		
		// math 랜덤을 사용해서 컴퓨터가 가위바위보를 내게 할 것.
		
		
		int comNum = (int)(Math.random()*3);
		System.out.print("숫자 입력 : ");
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
		
		System.out.println(message);
	}
}
