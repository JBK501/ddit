package kr.or.ddit.study06.sec04;

import java.util.Date;

public class MethodTest6 {
	public static void main(String[] args) {
		MethodTest6 mt = new MethodTest6();
		mt.process();
	}

	public void process() {
		// System.out.println(method1(10));
		// System.out.println(sum(100));

		Date d1 = new Date();

		System.out.println(fibo(10));

		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime() + "ms");
	}

	public int method1(int num) {

		// base
		if (num == 1)
			return 1;

		// recursive
		return num * method1(num - 1);
	}

	public long sum(int num) {
		// base
		if (num == 1)
			return 1;
		// recursive
		return num + sum(num - 1);
	}

	long[] fiboResult = new long[10000];

	public long fibo(int num) {

		// base
		if (num < 1)
			return 0;
		if (num == 1)
			return 1;

//		if (num <= 2)
//			return 1;

		// recursive
		long f1 = fiboResult[num - 1];
		long f2 = fiboResult[num - 2];

		if (f1 == 0) {
			f1 = fibo(num - 1);
			fiboResult[num - 1] = f1;
		}
		if (f2 == 0) {
			f2 = fibo(num - 2);
			fiboResult[num - 2] = f2;
		}

		return f1 + f2;
	}
	
}
