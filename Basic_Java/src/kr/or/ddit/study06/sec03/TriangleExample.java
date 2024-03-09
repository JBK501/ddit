package kr.or.ddit.study06.sec03;

public class TriangleExample {
	public static void main(String[] args) {

		Triangle t1 = new Triangle(0, 0, 0, 10, 10, 0);
		System.out.println(t1);

		Triangle t2 = new Triangle(
				new Point(0, 0), 
				new Point(0, 10), 
				new Point(10, 0)
		);
		
		System.out.println(t2);
	}
}
