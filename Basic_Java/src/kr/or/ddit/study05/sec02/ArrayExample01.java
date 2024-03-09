package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();

//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
//		obj.method6();
//		obj.method7();
//		obj.method8();
		obj.method9();

	}

	public void method9() {
		int[] num = { 67, 55, 9, 86, 98 };
		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[minIndex]) {
					minIndex = j;
				}
			}

			int temp = num[minIndex];
			num[minIndex] = num[i];
			num[i] = temp;
		}
		System.out.println(Arrays.toString(num));
	}

	public void method8() {

		int[] num = { 67, 55, 9, 86, 98 };
		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					System.out.println();
					flag = false;
				}
			}
			if (flag)
				break;
		}

		System.out.println(Arrays.toString(num));
	}

	public void method7() {

		int[] num = { 67, 55, 9, 86, 98 };
		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					System.out.println();
				}
			}
		}

		System.out.println(Arrays.toString(num));
	}

	public void method6() {

		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = new int[source.length];

		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
//		System.out.println("변경전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target));
//		
//		target[2] = 10;
//		System.out.println("변경후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target));

		int[] target2 = new int[source.length];
		System.arraycopy(source, 0, target2, 0, source.length);

//		System.out.println("변경전");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));
//		
//		target2[2] = 10;
//		System.out.println("변경후");
//		System.out.println(Arrays.toString(source));
//		System.out.println(Arrays.toString(target2));

		int[] target3 = source.clone();
		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));

		target3[2] = 10;
		System.out.println("변경후");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target3));

	}

	public void method5() {

		int[] source = { 1, 2, 3, 4, 5 };
		int[] target = source;

		System.out.println(source);
		System.out.println(target);

		System.out.println("변경전");
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
//		for(int i = 0 ; i < source.length; i++)
//		{
//			System.out.print(source[i]+"\t");
//		}
//		System.out.println();
//		for(int i = 0 ; i < target.length; i++)
//		{
//			System.out.print(target[i]+"\t");
//		}
//		System.out.println();
		target[2] = 10;

		System.out.println("변경후");
//		for(int i = 0 ; i < source.length; i++)
//		{
//			System.out.print(source[i]+"\t");
//		}
//		System.out.println();
//		for(int i = 0 ; i < target.length; i++)
//		{
//			System.out.print(target[i]+"\t");
//		}
//		System.out.println();

		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(target));
	}

	public void method4() {

		int[] coin = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		System.out.print("금액 : ");
		int money = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {
			int count = money / coin[i];
			if (count == 0)
				continue;
			money = money % coin[i];
			System.out.println(coin[i] + " : " + count + "개");
		}

	}

	public void method3() {

		int[] score = { 75, 80, 81, 84, 95 };

		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (max < score[i])
				max = score[i];
		}

		System.out.println(max);

		int min = 100;
		for (int i = 0; i < score.length; i++) {
			if (min > score[i])
				min = score[i];
		}

		System.out.println(min);

//		String answer = "aaabbb";
//        StringBuilder sb = new StringBuilder(answer);
//        
//        int i = 0;
//        int j = answer.length()-1;
//        String temp;
//        
//        while(i!=j)
//        {
//            temp = sb.substring(j,j+1);
//            sb.replace(j,j,sb.substring(i,i));
//            sb.replace(i,i,temp);
//            
//            i++;
//            j--;
//        }
//        
//        answer = sb.toString();
	}

	public void method2() {
		// 정수 5개 입력하고 출력 해보세요.
		System.out.println("정수 5개 입력");

		int[] arr = new int[5];
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public void method1() {

		System.out.println("정수 5개 입력");

		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int score4 = sc.nextInt();
		int score5 = sc.nextInt();

		int sum = score1 + score2 + score3 + score4 + score5;
		float avg = sum / 5.0f;

		// 힙에 배열이 만들어짐.
		// 따라서 첨자에 변수 사용이 가능함.
		int[] array = new int[5];
		array[0] = 100;
		array[1] = 95;
		array[2] = 87;
		array[3] = 94;
		array[4] = 77;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

	}
}
