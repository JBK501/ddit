package kr.or.ddit.study03;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
//		obj.method1();
		obj.method2();
	}

	public void method2() {
		System.out.println("a, b 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();

		int result = (a % 2 == 0) ? a + b : a * b;
		System.out.println(result);
	}

	public void method1() {

		String result = false ? "참" : "거짓";
		System.out.println(result);

		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();

		String state = (age >= 18) ? "성년" : "미성년";
		System.out.println(state);
	}
}
