package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		
//		obj.method1();
//		obj.method2();
//		obj.method3();
		obj.method4();
		
	}
	
	public void method4()
	{
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < 1000; i++)
		{
			if(i > num)
				break;
			System.out.println(i);
		}
	}
	
	public void method3()
	{
		System.out.print("숫자 : ");
		int odd = sc.nextInt();
		
		for(int i = 1 ; i < odd; i+=2)
		{
			System.out.println(i);
		}
	}
	
	public void method2()
	{
		for(int dan = 2 ; dan <=9 ; dan++)
		{
			for(int i = 1; i <= 9; i++)
			{
				System.out.print((dan*i)+"\t");
			}
			System.out.println();
		}
	}
	
	public void method1()
	{
		System.out.print("입력 : ");
		String s = sc.nextLine();
		
		int count= 0;
		int length = s.length();
		char ch;
		for(int i = 0; i < length; i++)
		{
			ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'||
					ch == 'o'||ch=='u')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
	}
}
