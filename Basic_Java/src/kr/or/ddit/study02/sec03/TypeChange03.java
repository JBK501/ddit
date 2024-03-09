package kr.or.ddit.study02.sec03;

import java.util.Scanner;

public class TypeChange03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TypeChange03 obj = new TypeChange03();
		obj.method1();
	}

	public void method1() {
		byte b = 10;
		short s = 10;
		int i = 10;
		long l = 10;
		float f = 3.0f;
		double d = 3.0;
		char c = 'a';
		boolean bl = true;
	}

	public void method2() {
		int i = 10;
		long l = (long) i;
		int i2 = (int) l;

		char c1 = 'A';
		int i3 = (char) c1;
		char c2 = (char) i3;

		int i4 = 100;
		double d1 = (double) i4;
		int i5 = (int) d1;

		int i6 = 50;
		String str1 = String.valueOf(i6);
		int i7 = Integer.parseInt(str1);

		char c3 = 'a';
		String str2 = String.valueOf(c3);
		char c4 = str2.charAt(0);
	}
}
