package kr.or.ddit.homework.home12;

public class Person {
	
	String name;
	int money;
	
	
	public Person(String name)
	{
		this(name,10000);
	}
	
	public Person(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
}
