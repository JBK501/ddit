package kr.or.ddit.study06.sec04;

public class MethodTest3 {
	public static void main(String[] args) {

		MethodTest3 mt = new MethodTest3();
		int s = mt.sum(10, 7);
		int sub = mt.subtract(10, 7);
		double div = mt.divide(10, 2);
		int multi = mt.multiply(10, 5);

		System.out.println(s);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(multi);
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

}
