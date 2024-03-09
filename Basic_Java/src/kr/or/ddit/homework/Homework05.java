package kr.or.ddit.homework;

import java.util.Scanner;

public class Homework05 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework05 obj = new Homework05();
		
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
		
	public void method1()
	{
		/*
		 * 스캐너를 통해 입력받은 단의 구구단 출력
		 * 
		 */
		System.out.print("몇 단? : ");
		int dan = sc.nextInt();
		
		for(int i= 1; i <= 9; i++)
		{
			System.out.println(dan * i);
		}
	}
	
	public void method2()
	{
		/*
		 * 구구단 전체 출력
		 * 
		 * 2*1 = 2 3*1=3...
		 * 2*2 = 4 3*2=4...
		 */
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	public void method3()
	{
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 2; j <= 9; j++)
			{
				if(j == dan)
					continue;
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}
	
	public void method4()
	{
		/*
		 * 숫자 입력
		 * 홀수일 경우
		 * ex ) 11 : 1+ 3+ 5+ 7 + 9 + 11
		 * 4 16 36 64
		 * 짝수일 경우
		 * ex ) 8 : 2*2 + 4*4 + 6*6 + 8*8
		 */
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		
		int sum = 0;
		if(num % 2 == 1)
		{
			for(int i = 1 ; i <= num; i+=2)
			{
				sum+=i;
			}
		}
		else 
		{
			for(int i = 2; i <=num; i+=2)
			{
				sum+= (i*i);
			}
		}
		System.out.println(sum);
	}
}
