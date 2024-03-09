package kr.or.ddit.homework.home15;

import java.util.Random;

public class HomeWork15 {
	public static void main(String[] args) {
		HomeWork15 hw = new HomeWork15();
		hw.process();
	}

	public void process() {
		// 주사위 2개 눈금의 합 전체 값을 히스토그램으로 나타내기
		/*
		 * 
		 * 2 : ** 
		 * 3 : **** 
		 * 4 : ****** 
		 * 5 : ******** 
		 * 6 : ********** 
		 * 7 : ************ 
		 * 8 : ********** 
		 * 9 : ******** 
		 * 10 : ****** 
		 * 11 : **** 
		 * 12 : **
		 */
		// 1~6 / 1~6

		printHistoGram(10000);
	}

	public int throwOneDice() {
		return new Random().nextInt(6) + 1;
	}

	public int throwTwoDice() {
		return new Random().nextInt(6) + 1;
	}

	int[] cnts = new int[11];

	// 시행횟수 n 리턴값 완성
	public void rollNum(int num) {

		for (int i = 0; i < num; i++) {
			int num1 = throwOneDice();
			int num2 = throwTwoDice();

			cnts[num1 + num2 - 2]++; 
		}
	}

	public void printHistoGram(int num) {
		rollNum(num);

		double stars;
		for (int i = 2; i <= 12; i++) {
			
			stars = 0;
			if (cnts[i - 2] != 0)
				stars = cnts[i-2] / (num * 1.0) * 100;
			
			System.out.print(i + "\t : ");
			for (int j = 0; j < stars; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
