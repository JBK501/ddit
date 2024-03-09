package kr.or.ddit.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework07 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Homework07 obj = new Homework07();

		obj.process();
	}

	public void process() {
		/*
		 * 로또 번호 6개 출력
		 */

		// 1. lotto 번호 45개 배열 temp 생성
		int[] temp = new int[45];
		for (int i = 0; i < 45; i++) {
			temp[i] = i + 1;
		}

		// 2. temp 배열 섞기 / 어제 숙제 참고
		for (int i = 0; i < 1000000; i++) {
			int ran2 = new Random().nextInt(temp.length);
			int num = temp[0];
			temp[0] = temp[ran2];
			temp[ran2] = num;
		}

		// 3. 6개 배열 looto 생성
		int[] lotto = new int[6];

		// 4. looto 배열에 temp 앞에 6개 값 복사하기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = temp[i];
		}

		// 5. 정렬하기
		for (int i = 0; i < lotto.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[j] < lotto[minIndex]) {
					minIndex = j;
				}
			}

			int tempNum = lotto[minIndex];
			lotto[minIndex] = lotto[i];
			lotto[i] = tempNum;
		}

		// 6. 결과 출력하기
		System.out.println(Arrays.toString(lotto));
	}
}
