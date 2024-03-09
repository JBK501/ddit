package kr.or.ddit.homework.home14;

import java.util.Scanner;

public class HomeWork14 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		HomeWork14 hw = new HomeWork14();
		hw.process();
	}
	
	Mem[] memList = new Mem[100];
	int cur =0;
	
	
	public void process() {
		
		int num;
		while(true) {
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 전체 정보 출력");
			System.out.println("5. 종료");
			num = sc.nextInt();
			
			if(num == 1)
			{
				addMember();
//				printListMember();
			}
			else if(num == 2)
			{
				removeMember();
//				printListMember();
			}
			else if(num == 3)
			{
				updateMember();
//				printListMember();
			}
			else if(num == 4)
			{
				printListMember();
			}
			else if(num == 5)
			{
				System.out.println("프로그램 종료.");
				break;
			}
			else
			{
				System.out.println("다시입력:");
				continue;
			}
		}
	}
	
	public void addMember() {
		Mem mem = new Mem();
		// 정보 입력 
		System.out.print("아이디 : ");
		mem.setId(sc.next());
		System.out.print("패스워드 : ");
		mem.setPass(sc.next());
		System.out.print("이름 : ");
		mem.setName(sc.next());;
		System.out.print("나이 : ");
		mem.setAge(sc.nextInt());
		
		
		memList[cur++] = mem;

	}
	
	public void removeMember() {
		
		printListMember();
		System.out.println("삭제할 회원 번호 입력");
		int index = sc.nextInt();
		index--;
		
//		Mem[] temp = new Mem[memList.length-1];
		
//		for(int i = 0 ; i < index; i++)
//		{
//			temp[i] = memList[i];
//		}
		
		memList[index] = null;
		
		for(int i = index+1; i < cur-1; i++)
		{
			memList[i-1] = memList[i]; 
		}
		cur--;
	}
	
	public void updateMember() {
		printListMember();
		System.out.println("수정할 회원 번호 입력");
		int index = sc.nextInt();
		index--;
		
		System.out.print("아이디 : ");
		String id = sc.next();
		if(id== "")
			id = memList[index].getId();
		
		System.out.print("패스워드 : ");
		String pass = sc.next();
		if(pass== "")
			pass = memList[index].getPass();
		
		System.out.print("이름 : ");
		String name = sc.next();
		if(name=="")
			name = memList[index].getName();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if(age <= 0)
			age = memList[index].getAge();
		
		memList[index].setId(id);
		memList[index].setPass(pass);
		memList[index].setName(name);
		memList[index].setAge(age);;
		
	}
	
	public void printListMember() 
	{
		System.out.println("=======================");
		System.out.println("[현재 회원정보]");
		for(int i=0; i<cur; i++) {
			Mem mem = memList[i];
			System.out.println("["+(i+1)+"번째 멤버] \t 아이디 : "+memList[i].getId()+
					"\t 비밀번호 : "+memList[i].getPass()+
					"\t 이름 : "+memList[i].getName()+
					"\t 나이 : "+memList[i].getAge()
			);
		}
		System.out.println("=======================");
	}
	
	
}
class Mem{
	private String id;
	private String pass;
	private String name;
	private int age;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/*
	 *  생성자 사용 x
	 *  
	 *  toString 사용 x
	 */
	
	
	
	
	
}