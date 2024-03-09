package kr.or.ddit.study06.sec04;

public class Circle {
	public static void main(String[] args) {

		Circle cir = new Circle();

		double area = cir.getArea(10);
		double round = cir.getRound(10);

		System.out.println(area);
		System.out.println(round);
	}

	double getArea(int radious) {
		return Math.pow(radious, 2) * Math.PI;
	}

	double getRound(int radious) {
		return radious * 2 * Math.PI;
	}
}
