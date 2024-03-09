package kr.or.ddit.homework.home10;

public class HomeWork10 {
	public static void main(String[] args) {
		
		HomeWork10 hw = new HomeWork10();
//		hw.method1();
//		hw.method2();
//		hw.method3();
		hw.method4();
	}
	public void method4() {
		Cylinder cy = new Cylinder(new Circle(5), 10);
	}
	
	public void method3() {
		Grade g = new Grade(100, 90, 90);
		System.out.println(g);
	}
	
	public void method2() {
		Tv tv = new Tv("삼성", 2022, 64);
		
		System.out.println(tv);
	}
	
	public void method1() {
		
		Student st = new Student();
		st.department = "컴퓨터공학";
		st.studentNumber = 1;
		
		System.out.println(st);
	}
}
