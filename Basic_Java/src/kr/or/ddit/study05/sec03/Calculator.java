package kr.or.ddit.study05.sec03;

public class Calculator {
	// 더하기 빼기 나누기 곱하기 메소드 만들기

	public double cal(int a, CalType type, int b) {

		if (type == CalType.ADD)
			return add(a, b);
		else if (type == CalType.SUB)
			return subtract(a, b);
		else if (type == CalType.MUL)
			return multiply(a, b);
		else if (type == CalType.DIV)
			return divide(a, b);
		else if (type == CalType.PER)
			return percent(a, b);
		else {
			System.out.println("지원되지 않는 연산자입니다.");
			return 0;
		}

	}

	private int add(int a, int b) {
		return a + b;
	}

	private int subtract(int a, int b) {
		return a - b;
	}

	private int multiply(int a, int b) {
		return a * b;
	}

	private double divide(int a, int b) {
		return a / (b * 1.0);
	}

	private int percent(int a, int b) {
		return a % b;
	}
}
