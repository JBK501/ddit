package kr.or.ddit.study06.sec03;

public class Member {

	String nation;
	String group;
	String name;
	int age;


	// 국가 그룹 이름 나이 입력
	Member(String nation, String group, String name, int age) {
		this.nation = nation;
		this.group = group;
		this.name = name;
		this.age = age;
	}

	// 그룹 이름 나ㅣ <- 국가 기본값 한국
	Member(String group, String name, int age) {
		this("한국", group, name, age);
	}
	
	// 이름 나이 <- 기본값 304호
	Member(String name, int age) {
		this("304호", name, age);
	}
}
