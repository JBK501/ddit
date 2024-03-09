package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class ScannerExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScannerExample obj = new ScannerExample();
		obj.method1();
	}

	public void method2() {
		System.out.println("메소드 2");
	}

	public void method1() {
		System.out.println("국어 점수를 입력하세요 : ");
		String kor_str = sc.nextLine();
		System.out.println("영어 점수를 입력하세요 : ");
		String eng_str = sc.nextLine();
		System.out.println("수학 점수를 입력하세요 : ");
		String math_str = sc.nextLine();

		int kor = Integer.parseInt(kor_str);
		int eng = Integer.parseInt(eng_str);
		int math = Integer.parseInt(math_str);

		int sum = kor + eng + math;
		float avg = sum / 3.0f;

		System.out.println("총합 : " + sum);
		System.out.printf("평균 %.2f",avg);
	}
}
