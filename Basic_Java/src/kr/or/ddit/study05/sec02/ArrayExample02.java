package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample02 obj = new ArrayExample02();

//		obj.method1();
//		obj.method2();
//		obj.method3();
//		obj.method4();
//		obj.method5();
		obj.method6();
	}
	
	public void method6() {
		
		int[] array = {1,3,5,2,4};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	public void method5() {
		
		int[][] arr = new int[3][];
		
		arr[0] = new int[4];
		arr[1] = new int[5];
		arr[2] = new int[5];
		
	}
	

	public void method4() {
		
		int[][] numList1 = new int[5][5];
		int[][] numList2 = new int[5][5];
		int[][] numList3 = new int[5][5];
		int[][] numList4 = new int[5][5];

		// <1>
//		for(int i = 0 ; i < numList1.length; ++i) {
//			for(int j = 0 ; j < numList1[i].length; ++j) {
//				numList1[i][j] = numList1[i].length*i+j+1;
//			}
//		}
//		
//		for(int i = 0 ; i < numList1.length; ++i) {
//			for(int j = 0 ; j < numList1[i].length; ++j) {
//				System.out.print(numList1[i][j] + " ");
//			}
//			System.out.println();
//		}

		// 1 6 11 16 21
		// 2 7 12 17 22

		// <2>
//		for(int i = 0 ; i < numList2.length; ++i) {
//			for(int j = 0 ; j < numList2[i].length; ++j) {
//				numList2[i][j] = (i+1)+numList2[i].length*j;
//			}
//		}
//		
//		for(int i = 0 ; i < numList2.length; ++i) {
//			for(int j = 0 ; j < numList2[i].length; ++j) {
//				System.out.print(numList2[i][j] + " ");
//			}
//			System.out.println();
//		}

		// 1 2 3 4 5
		// 10 9 8 7 6

		// <3>
		int k3 = 1;

		for (int i = 0; i < numList3.length; i++) {
			for (int j = 0; j < numList3[0].length; j++) {
				if (i % 2 == 0)
					numList3[i][j] = k3++;
				else
					numList3[i][numList3[0].length - 1 - j] = k3++;
			}

		}

		for (int i = 0; i < numList3.length; ++i) {
			for (int j = 0; j < numList3[i].length; ++j) {
				System.out.print(numList3[i][j] + " ");
			}
			System.out.println();
		}

	}

	public void method3() {
		int[][] scoreList = { { 100, 97, 84 }, { 30, 93, 84 }, { 40, 92, 54 }, { 60, 91, 82 }, { 70, 44, 74 } };

		int korSum = 0;
		for (int i = 0; i < 5; i++) {
			korSum += scoreList[i][0];
		}
		System.out.println(korSum);

		int engSum = 0;
		for (int i = 0; i < 5; i++) {
			engSum += scoreList[i][1];
		}
		float engAvg = engSum / 5.0f;

		System.out.println(engAvg);

		int sum;
		float avg;
		for (int i = 0; i < scoreList.length; i++) {
			sum = 0;
			for (int j = 0; j < scoreList[i].length; j++) {
				sum += scoreList[i][j];
			}
			avg = sum / 3.0f;

			System.out.println((i + 1) + "번째 학생 평균 : " + avg);
		}

	}

	public void method2() {
		// 5명의 국어 영어 수학 점수만들기.

		int[] score1 = { 100, 97, 84 };
		int[] score2 = { 30, 93, 84 };
		int[] score3 = { 40, 92, 54 };
		int[] score4 = { 60, 91, 82 };
		int[] score5 = { 70, 44, 74 };

		int[][] scoreList = new int[5][3];

		scoreList[0] = score1;
		scoreList[1] = score2;
		scoreList[2] = score3;
		scoreList[3] = score4;
		scoreList[4] = score5;
		
		

		System.out.println(scoreList[0][0]);
		System.out.println(scoreList[1][2]);
		System.out.println(scoreList[2][1]);

		int sum = 0;
		for (int score : scoreList[3]) {
			sum += score;
		}
		System.out.println(sum);

		int sum2 = 0;
		for (int score : scoreList[4]) {
			sum2 += score;
		}

		float avg = sum2 / 3.0f;

		System.out.println(avg);
	}

	public void method1() {

		int[][] arr = new int[3][3];

		int[] sub1 = new int[3];
		int[] sub2 = new int[3];
		int[] sub3 = new int[3];

		arr[0] = sub1;
		arr[1] = sub2;
		arr[2] = sub3;
	}
}
