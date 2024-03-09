package kr.or.ddit.study06.sec02;

public class PhoneExample {
	
	public static void main(String[] args) {
		
		Phone p1 = new Phone();
		p1.name = "아이폰15";
		p1.year = 2023;
		p1.Camera = "좋음";
		
		System.out.println(p1);
		
		
		Phone p2 = new Phone();
		p2.name = "아이폰10";
		p2.year = 2018;
		p2.Camera = "별로";
		
		System.out.println(p2);
	}
}
