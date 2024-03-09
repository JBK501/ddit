package kr.or.ddit.study04;

import java.util.Scanner;

public class ForExample00 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample00 obj = new ForExample00();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
		obj.method7();
	}
	public void method1() {
		/*
		 *    *
		 *    **
		 *    ***
		 *    ****
		 *    .
		 *    .
		 *    .
		 *    ***********
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method2() {
		/*
		 *         *
		 *        **
		 *       ***
		 *      ****
		 *     *****
		 *     # 힌트 * 앞에 공백 출력하기.
		 */
		for(int row =0; row<4; row++) {
			for(int space = 0 ; space < 4-row-1; space++)
			{
				System.out.print(" ");
			}
			for(int star = 0 ; star <row+1;star++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public void method3() {
		/*
		 *     *****
		 *      ****
		 *       ***
		 *        **
		 *         *
		 */
		
		for(int row = 0 ; row < 5; ++row)
		{
			for(int space = 0; space <row; space++)
			{
				System.out.print(" ");
			}
			
			for(int star = 0; star < 5-row; ++star)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void method4() {
		/*
		 *     *****
		 *     ****
		 *     ***
		 *     **
		 *     *
		 */
		int row = sc.nextInt(); 
		for(int i=0; i<row; i++) {
			for(int j=0; j<row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method5() {
		/*
		 *         *
		 *        ***
		 *       *****
		 *      *******
		 *     *********
		 */
		
		for(int row = 0 ; row < 5; row++)
		{
			for(int space = 0 ; space < 5-row-1; space++)
			{
				System.out.print(" ");
			}
			
			for(int star = 0; star < row*2+1; ++star)
			{
				System.out.print("*");
			}
			
			for(int space = 0 ; space < 5-row-1; space++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public void method6() {
		/*
		 *      
		 *     *********
		 *      *******
		 *       *****
		 *        ***
		 *         *
		 */
		
		for(int row = 0 ; row < 5; row++)
		{
			for(int space = 0 ; space < row; space++)
			{
				System.out.print(" ");
			}
			for(int star = 0; star < (5-row)*2-1; star++ )
			{
				System.out.print("*");
			}
			for(int space = 0 ; space < row; space++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public void method7() {
		/*
		 *      
		 *     ******
		 *     *    *
		 *     *    * 
		 *     *    *
		 *     *    * 
		 *     ******
		 */
		for(int i = 0 ; i < 6; ++i)
		{
			for(int j = 0; j < 6; ++j)
			{
				if((i>=1 && i <=4) && j != 0 && j!=5)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
}
