package kr.or.ddit.study02.sec04;

import java.util.Scanner;

public class PrintExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		PrintExample obj = new PrintExample();
//		obj.method1();
//		obj.method2();
		obj.method3();
	}
	
	public void method3() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.printf("이름 : %s\n나이 : %d",name,age);
	}
	
	
	public void method2() {
		System.out.printf("숫자 : %d %d 입니다.\n",1000,2000);
		System.out.printf("%8d\n",1000);
		System.out.printf("%-8d\n",1000);
		System.out.printf("%08d\n",1000);
		
	}
	
	public void method1() {
		System.out.println("홍길동");
		System.out.println("34061");
		System.out.println("대전시 중구 계룡로");
		System.out.println();
		
		
		System.out.print("홍길동\t");
		System.out.print("34061\t");
		System.out.print("대전시 중구 계룡로");
		System.out.println();
		
	}
}
