package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample obj = new ForExample();

//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();

	}
	
	public void method6() {
		
		char ch;
		for(int i = 97 ; i < 123; i++)
		{
			ch = (char)i;
			System.out.println(ch);
		}
		
		System.out.println("문자 입력 : ");
		String s = sc.nextLine();
		char c = s.charAt(0);
				
		for(char i = c; i < 'z'; i++)
		{
			System.out.println(c++);
		}
		
	}
	

	public void method5() {
		int sum = 0;
		for(int i = 1 ; i <= 100; i+=2)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

	public void method4() {
		int sum = 0;
		for (int i = 0; i <= 10; i += 2) {
			sum += i;
		}

		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 = (i % 2 == 0) ? sum2 + i : sum2;
		}

		System.out.println(sum2);
	}

	public void method3() {
		int sum = 0;
		for (int i = 11; i <= 20; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method2() {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

	public void method1() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}

	}

}
