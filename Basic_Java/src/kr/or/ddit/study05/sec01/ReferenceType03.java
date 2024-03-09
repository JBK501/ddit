package kr.or.ddit.study05.sec01;

import java.util.Scanner;

public class ReferenceType03 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ReferenceType03 obj = new ReferenceType03();

		obj.method1();
	}

	public void method1() {
		String str1 = ""; // 주소 O / 데이터 X
		String str2 = null; // 주소 x / 데이터 X
		
		System.out.println(str1.equals(str2));
	}
}
