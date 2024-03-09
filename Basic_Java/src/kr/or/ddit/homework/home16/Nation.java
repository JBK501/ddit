package kr.or.ddit.homework.home16;

import java.util.Scanner;

public abstract class Nation {
	
	Scanner sc = new Scanner(System.in);
	
	public abstract int tax(int money);
	public abstract int game(int money);
}
