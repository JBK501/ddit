package kr.or.ddit.homework;

import java.util.Random;
import java.util.Scanner;

public class Homework06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework06 obj = new Homework06();

		obj.process();
	}

	public void process() {
		/*
		 *   6개의 단어가 제공되며 
		 *   이중 임의에 단어가 선택 된다. 
		 *   
		 *   사용자는 이를 보고 원래의 단어를 입력 한다. 
		 *   사용자가 단어를 맞출때 까지 반복하며 단어를 맞추었을때 시도 회수
		 *   출력
		 */
		
		String[] words = {"deserve","cart","fright",
						"scrub","amount","laugh"};
		
		int ran = new Random().nextInt(words.length);
		String select = words[ran];
		
		
//		int count = 0;
//		String myStr = "";
//		while(!myStr.equals(select)) {
//			System.out.print("문자열 입력 : ");
//			myStr = sc.nextLine();
//			count++;
//		}
//		
//		System.out.println("시행횟수:"+count);

		
		char[] ch = select.toCharArray();
		for(int i = 0; i < 1000000; i++)
		{
			int ran2 = new Random().nextInt(ch.length);
			char temp = ch[0];
			ch[0] = ch[ran2];
			ch[ran2] = temp;
		}
		
		int count = 0;
		String myStr="";
		
		while(!select.equals(myStr)) {
			
			count++;
			
			//cart    tarc
			// 문제 출력하기. 
			System.out.println(ch);
			
			// 스캐너를 입력 받기 
			System.out.print("문자열 입력 : ");
			myStr = sc.nextLine();
		}
		
		System.out.println("시행횟수 : "+count);
	}
}
