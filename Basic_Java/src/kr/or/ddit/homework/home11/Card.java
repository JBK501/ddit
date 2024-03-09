package kr.or.ddit.homework.home11;

public class Card {
	int num;
	String type;

	public Card(int num, String type) {
		this.num = num;
		this.type = type;
	}

	@Override
	public String toString() {
		
		String strNum = this.num + "";
		if (this.num == 1)
			strNum = "A";
		if (this.num == 11)
			strNum = "J";
		if (this.num == 12)
			strNum = "Q";
		if (this.num == 13)
			strNum = "K";

		return type + strNum;
	}
}
