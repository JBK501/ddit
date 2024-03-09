package kr.or.ddit.study03;

import java.util.Scanner;

public class UnaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator obj = new UnaryOperator();

		obj.method1();
		obj.method2();
	}

	public void method2() {
		int val;
		int res;

		val = 10;
		res = val++;
		System.out.println(val + ", " + res);

		val = 10;
		res = ++val;
		System.out.println(val + ", " + res);

		val = 10;
		res = val--;
		System.out.println(val + ", " + res);

		val = 10;
		res = --val;
		System.out.println(val + ", " + res);

	}

	public void method1() {
		int num = 100;
		int res = -num;
		System.out.println("num : " + num);
		System.out.println("res : " + res);
	}

}
