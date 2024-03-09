package kr.or.ddit.study06.sec05;

/**
 * @author PC-08
 *
 */
public class Person {
	static int year = 2023;
	String name;
	int age;

	public void newYear() {
		year++;
		age++;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return year+"년[name=" + name + ", age=" + age + "]";
	}

}
