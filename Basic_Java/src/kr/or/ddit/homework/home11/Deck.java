package kr.or.ddit.homework.home11;

import java.util.Random;

public class Deck {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.process();
	}

	public void process() {
		// 카드 리스트 호출
		Card[] cardList = cardList();

		// 카드 섞기
		shuffle(cardList);

		// 승패 비교
		String result = compareCards(cardList);

		// 랜덤한 카드뽑기 (내카드) , 맨위카드(컴퓨터)
		// 내 카드 숫자가 높을 경우 승리
		System.out.println(result);

	}

	public Card[] cardList() {
		Card[] cardList = new Card[52];
		String[] types = { "♠", "◆", "♥", "♣" };
		int cur = 0;
		for (String type : types) {
			for (int i = 1; i <= 13; i++) {
				cardList[cur++] = new Card(i, type);
			}
		}
		return cardList;
	}

	public void shuffle(Card[] cardList) {
		for (int i = 0; i < 100000; i++) {
			int index = new Random().nextInt(52);

			Card card = cardList[index];
			cardList[index] = cardList[0];
			cardList[0] = card;
		}
	}

	public String compareCards(Card[] cardList) {
		String result = "패배";

		int index = new Random().nextInt(51) + 1;

		if (cardList[index].num > cardList[0].num)
			result = "승리";

		System.out.println("내 카드 : " + cardList[index].toString());
		System.out.println("컴퓨터 카드 : " + cardList[0].toString());

		return result;
	}
}
