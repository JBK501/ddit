package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork02 obj = new HomeWork02();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
		obj.method5();
	}

	public void method1() {
		/*
		 * 스캐너를 통해 숫자를 입력받고 소수점 2째자리까지 버림 ex) 12.23123 -> 12.23
		 */
		System.out.print("실수를 입력해 주세요. ");
		double dNum = sc.nextDouble();
		int num = (int) (dNum * 100);
		double dNum2 = num / 100.0;
		System.out.println("답 : " + dNum2);
	}

	public void method2() {
		/*
		 * 스캐너를 통해서 소문자를 입력받고 대문자로 변환 ex ) a -> A
		 */
		System.out.println("소문자를 입력하세요. ");
		char low = sc.next().charAt(0);
		char upper = (char) (low - 32);
		System.out.println("대문자 : " + upper);
	}

	public void method3() {
		/*
		 * 스캐너를 통해서 대문자를 입력받고 소문자로 변환 ex) F -> f
		 */

		System.out.println("대문자를 입력하세요. ");
		char upper = sc.next().charAt(0);
		char low = (char) (upper + 32);
		System.out.println("소문자 : " + low);
	}

	public void method4() {
		/*
		 * 스캐너를 통해서 숫자 3자리를 입력받고 각 자리수의 합을 구하시오. ex) 123 -> 1+2+3 = 6
		 */

		System.out.println("세자리 숫자를 입력하세요. ");
		int num = sc.nextInt();

		int sum = 0;
		int quotient;
		int remainder;

		quotient = num / 100;
		remainder = num % 100;

		sum += quotient;

		quotient = remainder / 10;
		remainder = remainder % 10;

		sum = sum + quotient + remainder;

		System.out.println("합계 : " + sum);
	}

	public void method5() {
		/*
		 * 스캐너를 통해서 숫자를 입력받고, 소수점 2째 자리에서 반올림
		 * 
		 * ex) 12.756 -> 12.8
		 * 
		 */

		System.out.println("숫자를 입력하세요. ");
		double dNum = sc.nextDouble();

		double multipleDNum = dNum * 10;
		int num = (int) multipleDNum;
		int dNum2 = (int) ((multipleDNum - num) * 2);

		double finNum = (num + dNum2) / 10.0;

		System.out.println(finNum);

//		int num = (int) (dNum * 100);
//		String strNum = "" + num;
//		int reNum = strNum.charAt(3) - '0';
//
//		
//		double semifinNum = (num + reNum * 2) / 100.0;
//		int finNum = (int)(semifinNum *10);
//		double dFinNum = finNum / 10.0;
//		
//		
//		System.out.println(dFinNum);

	}
}
