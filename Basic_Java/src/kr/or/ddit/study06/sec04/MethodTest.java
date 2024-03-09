package kr.or.ddit.study06.sec04;

public class MethodTest {
	public static void main(String[] args) {
		System.out.println("메인 메소드");
		
		MethodTest mt = new MethodTest();
		mt.method1();
		
		int result1 = mt.method2();
		double result2 = mt.method3();
	}
	
	public void method1() {
		System.out.println("public void method1()");
		System.out.println("리턴값이 없어요");
	}
	
	public int method2() {
		System.out.println("public void method2()");
		System.out.println("리턴값 int");
		
		return 10;
	}
	
	public double method3() {
		System.out.println("public void method3()");
		System.out.println("리턴값 double");
		
		return 3.14;
	}
}
