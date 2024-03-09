package kr.or.ddit.homework.home12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork12 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork12 hw = new HomeWork12();
		hw.process();
	}

	public void process() {
		// 사람 클래스 만들고

		String name;
		int money;

		System.out.print("플레이어 이름 : ");
		name = sc.nextLine();

		System.out.print("보유금액 입력 : ");
		money = sc.nextInt();

		Person person = new Person(name, money);
		int[][][] lottoBundle;
		int price;
		int num = 0;
		int winningMoney;

		while (num != -1) {
			if (person.money < 1000) {
				System.out.println("보유금액이 부족합니다.");
				break;
			}

			System.out.print("구매할 금액을 입력 : ");
			price = sc.nextInt();
			if (person.money < price) {
				System.out.println("보유 금액보다 많이 입력했습니다.");
				continue;
			}

			// 로또 추첨
			lottoBundle = lottoBundle(price);

			// 보유금액 차감
			person.money -= price;

			// 게임진행
			winningMoney = playGame(lottoBundle);

			// 결과 확인
			if (winningMoney>0) {
				System.out.println("당첨되었습니다!");
				person.money += winningMoney;
				System.out.println("보유금액 : " + person.money);
			}
			else
			{
				System.out.println("실패!");
				System.out.println("보유금액 : " + person.money);
			}

			// 계속할지 여부 결정
			System.out.print("계속 하시겠습니까? (1 : 계속 / -1: 그만두기): ");
			num = sc.nextInt();
		}
	}
	
	

	public int playGame(int[][][] lottoBundle) {
		// 로또를 생성한다.
		
		int money = 0;
		int[] comLotto = generateLotto();
		
		System.out.println("========================================");
		System.out.println("[컴퓨터]");
		System.out.println(Arrays.toString(comLotto));
		System.out.println("========================================");
		System.out.println("[내 로또]");

		// 내 번호와 비교한다.
		for (int[][] lottoPaper : lottoBundle) {
			for (int[] lotto : lottoPaper) {
				System.out.println(Arrays.toString(lotto));
				if (Arrays.equals(lotto, comLotto)) {
					money+=100000;
				}
			}
			System.out.println();
		}
		System.out.println("========================================");
		return money;
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
			int ran = new Random().nextInt(8) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}

		Arrays.sort(lotto);
		return lotto;
	}
}
