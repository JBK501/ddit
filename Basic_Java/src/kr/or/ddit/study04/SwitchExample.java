package kr.or.ddit.study04;

import java.util.Scanner;

public class SwitchExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SwitchExample obj = new SwitchExample();

//		obj.method1();
//		obj.method2();
		obj.method3();
	}

	public void method3() {
		System.out.println("달 : ");
		int month = sc.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");
			break;
		case 2:
			System.out.println("28 29");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");
			break;
		default:
			break;
		}

	}

	public void method2() {
		System.out.print("국가 영문 :");
		String nation = sc.nextLine();

		switch (nation) {

		case "kor":
			System.out.println("한국");
			break;
		case "jpn":
			System.out.println("일본");
			break;
		case "chn":
			System.out.println("중국");
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
	}

	public void method1() {
		System.out.println("회원 등급코드(1-3) : ");
		int grade = sc.nextInt();

		switch (grade) {

		case 1:
			System.out.println("VIP");
			break;
		case 2:
			System.out.println("우수");
			break;
		case 3:
			System.out.println("일반");
			break;
		default:
			System.out.println("잘못된 등급");
			break;
		}

	}
}
