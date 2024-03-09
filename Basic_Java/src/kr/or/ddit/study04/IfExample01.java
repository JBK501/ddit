package kr.or.ddit.study04;

import java.util.Scanner;

public class IfExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		IfExample01 obj = new IfExample01();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
	}
	
	public void method6() {

		System.out.print("점수 : ");
		int score = sc.nextInt();
		String grade = "";

		if (score == 100) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		if (score != 100 && grade != "F") {
			int backNum = score % 10;
			if (backNum >= 0 && backNum <= 2) {
				grade += "-";
			} else if (backNum >= 3 && backNum <= 6) {
				grade += "0";
			} else if (backNum >= 7 && backNum <= 9) {
				grade += "+";
			}
		}

		System.out.println(grade);
	}

	public void method5() {

		System.out.print("점수 : ");
		int score = sc.nextInt();
		char grade = ' ';

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(grade + "학점");

	}

	public void method4() {

		System.out.print("달 : ");
		int month = sc.nextInt();
		String season = "";

		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month >= 3 && month < 6) {
			season = "봄";
		} else if (month >= 6 && month < 9) {
			season = "여름";
		} else if (month >= 9 && month < 12) {
			season = "가을";
		}

		System.out.println(season);

	}

	public void method3() {
		System.out.print("점수 : ");
		int score = sc.nextInt();
		String message;

		if (score >= 60) {
			message = "합격";
		} else {
			message = "불합격";
		}

		System.out.println(message);
	}

	public void method2() {

		System.out.println("1");
		if (false) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("2");
	}

	public void method1() {

		System.out.println("1");
		if (true) {
			System.out.println("실행 됨");
		}
		System.out.println("2");
	}

}
