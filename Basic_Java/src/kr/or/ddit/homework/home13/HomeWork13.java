package kr.or.ddit.homework.home13;

import java.util.Scanner;

public class HomeWork13 {
	
	Scanner sc = new Scanner(System.in);
	
	 public static void main(String[] args) {
		
		 HomeWork13 hw = new HomeWork13();
		 
		 hw.process();
	}
	 
	 public void process() {
		 
		 Reserve reserve = Reserve.getInstance();
		 
		 int isContinue;
		 String name;
		 
		 while(true) {
			 
			 System.out.println("1. 예약\n2. 완료\n3. 종료");
			 isContinue = sc.nextInt();
			 
			 // 3 : 종료
			 if(isContinue == 3)
			 {
				 System.out.println("프로그램 종료");
				 break;
			 }
			 
			 // 2 : 체크아웃
			 if(isContinue == 2) {
				 reserve.out();
			 }
			 
			 // 1 : 예약
			 if(isContinue == 1)
			 {
				 System.out.print("예약자명 입력 : ");
				 name = sc.next();
				 
				 reserve.resevation(new Person(name));
			 }
				 
			 
		 }
		 
	 }
}

class Person{
	String name;

	public Person(String name) {
		this.name = name;
	}
}


class Reserve{
	Person person = null;
	
	// 싱글톤 활용할것.
	private static Reserve instance = null;

	private Reserve() {

	}

	public static Reserve getInstance() {

		if (instance == null) {
			instance = new Reserve();
		}
		return instance;
	}
	
	
	public void resevation(Person p) {
		
		if(this.person != null) {
			
			System.out.println(this.person.name+"님이 이미 예약되어 있습니다.");
			return;
		}
		
		this.person = new Person(p.name);
		System.out.println(this.person.name+"님으로 예약되었습니다.");
	}
	
	public void out() {
		
		if(this.person == null)
		{
			System.out.println("예약내역이 없습니다.");
			return;
		}
		
		System.out.println(this.person.name+"님 체크아웃!");
		this.person = null;
	}
}
