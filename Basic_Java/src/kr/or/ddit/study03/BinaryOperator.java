package kr.or.ddit.study03;

import java.util.Scanner;

public class BinaryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator obj = new BinaryOperator();
//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
	}

	public void method5() {
		int a = 10;
		int b = 4;
		int result = 0;
		result += (a + b);

		System.out.println("a=a+b => a+=b=>" + (a += b));
		System.out.println("a=a-b => a-=b=>" + (a -= b));
		System.out.println("a=a*b => a*=b=>" + (a *= b));
		System.out.println("a=a/b => a/=b=>" + (a /= b));
		System.out.println("a=a%b => a%=b=>" + (a %= b));
	}

	public void method4() {
		// 시프트 연산자
		// >> <<
		// 숫자 >> 정수 => 숫자를 정수만큼 오른쪽으로 평행이동
		// => 숫자를 2^정수 나눈 몫이됨

		System.out.println(12 >> 2);
		System.out.println(12 << 2);

	}

	public void method3() {
		// 논리연산자
		// &(and) |(or)
		// 45 : 00101101 00101101
		// 25 : 00011001 00011001
		// 00001001 => 9 00111101 => 61

		int a = 45;
		int b = 25;
		System.out.println(a & b);
		System.out.println(a | b);

		// XOR
		System.out.println(a ^ b);
		// not
		System.out.println(~a);

	}

	public void method2() {
		System.out.println("정수 입력 : ");
		int score = sc.nextInt();

		if (score >= 90) {
			System.out.println("B학점");
		}
		if (score == 100) {
			System.out.println("A+학점");
		}
	}

	public void method1() {
		boolean a = true;
		boolean b = false;

		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(a && !b);
	}
}
