package kr.or.ddit.study06.sec05;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("김길동", 20);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.newYear();
		System.out.println(p1);
		System.out.println(p2);
	}
}
