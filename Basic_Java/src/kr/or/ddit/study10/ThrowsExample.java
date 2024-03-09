package kr.or.ddit.study10;

import java.util.Scanner;

public class ThrowsExample {
	
	static String[] name = {"홍길동","이순신","강감찬"};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			try {
				String name = getArray(num);
			} catch (Exception e) {
				System.out.println("숫자가 범위를 벗어났습니다.");
				continue;
			}
			
			System.out.println("회원 이름"+name);
			break;
		}
	}
	
	public static String getArray(int num) throws ArrayIndexOutOfBoundsException {
		return name[num]; 
	}
	
	
	
}
