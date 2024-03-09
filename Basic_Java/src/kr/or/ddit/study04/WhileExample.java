package kr.or.ddit.study04;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();

//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
	
	public void method4()
	{
		int i = 1; 
		do {
			System.out.println(i+++"번 실행");
		} while (i<10);
	}

	public void method3() {
		String menu = "** 커피 메뉴 **\n";
		menu += " 1. 아메리카노\t 3000원\n";
		menu += " 2. 카페라떼\t 3500원\n";
		menu += " 3. 카라멜 마끼아또\t 4000원\n";
		menu += " 4. 딸기 에이드\t 4000원\n";
		menu += " 5. 종료\n";
		
		int total = 0;
		String bill = "";

		while (true) {
			System.out.println(menu);
			System.out.println("음료를 선택 하세요.");
			int choice = sc.nextInt();

			if (choice == 1) {
				total += 3000;
				bill+="아메리카노\n";
			}
			if (choice == 2) {
				total += 3500;
				bill+="카페라떼\n";
			}
			if (choice == 3) {
				total += 4000;
				bill+="카라멜 마끼아또\n";
			}
			if (choice == 4) {
				total += 4000;
				bill+="딸기 에이드\n";
			}
			if (choice == 5)
				break;
		}
		System.out.println("총 결제금액 : "+total);
		System.out.println("--------------------------------");
		System.out.println(bill);
	}

	public void method2() {
		int i = 1;
		while (true) {
			i = i + 100;
			System.out.println(i);
		}
	}

	public void method1() {
		System.out.println("10찍어 안 넘어가는 마무없다.");
		int i = 0;
		while (i < 10) {
			System.out.println((i + 1) + "번");
			i++;
		}
		System.out.println("나무가 넘어갔습니다.");
	}
}
