package kr.or.ddit.study06.sec02;

public class StudentExample {
	public static void main(String[] args) {
		
		Student stu1 = new Student();
		
		stu1.name = "홍길동";
		stu1.kor = 100;
		stu1.eng = 56;
		stu1.math = 93;
		stu1.avg = (stu1.kor + stu1.eng + stu1.math) / 3.0;
		
		System.out.printf("%s\n%d\n%d\n%d\n%f\n",stu1.name,stu1.kor,stu1.eng,stu1.math,stu1.avg);

		Student stu2 = new Student();
		
		stu2.name = "김길동";
		stu2.kor = 50;
		stu2.eng = 26;
		stu2.math = 63;
		stu2.avg = (stu2.kor + stu2.eng + stu2.math) / 3.0;
		
		System.out.printf("%s\n%d\n%d\n%d\n%f\n",stu2.name,stu2.kor,stu2.eng,stu2.math,stu2.avg);
	}
}
