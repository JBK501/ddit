package kr.or.ddit.study06.sec03;

public class Constructor02 {

	String a;
	String b;

	public Constructor02() {
		this("a");
	}

	public Constructor02(String a) {
		this(a, "b");
	}

	public Constructor02(String a, String b) {
		this.a = a;
		this.b = b;
	}
}
