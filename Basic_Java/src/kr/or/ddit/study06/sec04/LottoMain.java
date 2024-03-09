package kr.or.ddit.study06.sec04;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {
	public static void main(String[] args) {
		LottoMain lm = new LottoMain();

//		int[] lotto = lm.generateLotto();
//		System.out.println(Arrays.toString(lotto));
//		String result = lm.arrayToString(lotto);
//		System.out.println(result);

//		int[][] lottoPaper = lm.lottoPaper();
//		for (int[] lotto : lottoPaper) {
//			System.out.println(Arrays.toString(lotto));
//		}

		int money = 13000;
		int[][][] lottoBundle = lm.lottoBundle(money);
		lm.printBundle(lottoBundle);
		
	}
	
	public void printBundle(int[][][] bundle)
	{
		for (int i = 0; i < bundle.length; i++) {
			for (int[] lotto : bundle[i]) {
				System.out.println(Arrays.toString(lotto));
			}

			System.out.println();
		}
	}
	

	public String arrayToString(int[] lotto) {
		String result = "[";

		for (int i = 0; i < lotto.length; i++) {
			result += lotto[i];
			if (i != lotto.length - 1)
				result += ", ";
		}
		result += "]";

		return result;
	}

	public int[][][] lottoBundle(int money) {

		int paperCount = money / 5000;
		if (money % 5000 != 0)
			paperCount++;

		int[][][] bundle = new int[paperCount][5][6];

		for (int i = 0; i < paperCount; i++) {
			bundle[i] = lottoPaper();
		}
		if (money % 5000 != 0)
			bundle[paperCount - 1] = lottoPaper(money / 1000 % 5);

		return bundle;
	}

	public int[][] lottoPaper() {
		return lottoPaper(5);
	}

	public int[][] lottoPaper(int num) {
		int[][] paper = new int[num][6];

		for (int i = 0; i < paper.length; i++) {
			paper[i] = generateLotto();
		}

		return paper;
	}

	public int[] generateLotto() {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int ran = new Random().nextInt(45) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

//		Arrays.sort(lotto);
		sort(lotto);
		return lotto;
	}

	public void sort(int[] lotto) {
		int temp;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					temp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = temp;
				}
			}
		}
	}
}
