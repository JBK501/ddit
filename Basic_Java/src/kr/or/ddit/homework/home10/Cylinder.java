package kr.or.ddit.homework.home10;

public class Cylinder {
	Circle circle;
	double height;
	
	Cylinder(Circle circle, double height){
		System.out.println(circle.area * height);
	}
}
