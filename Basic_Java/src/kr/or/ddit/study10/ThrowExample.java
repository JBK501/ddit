package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowExample {
	public static void main(String[] args) {

		ThrowExample te = new ThrowExample();
		
		try {
			String nickName = te.inputNick();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public String inputNick() throws Exception {

		Scanner sc = new Scanner(System.in);
		String nickName = sc.next();
		if (nickName.contains("18")) {
			throw new Exception();
		}
		return nickName;
	}
}