package kr.or.ddit.homework.study13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList - 1차원 배열구조 - 중복을 허용하고 순서화 제공 - List 타입의 컬렉션
 * 
 * 주요 메서드
 * 
 *
 */
public class ArrayListExample {

	public static void main(String[] args) {

		List l = new ArrayList();
		for (int i = 0; i < 10; i++) {
			l.add("회원" + i);
		}
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		for (int i = 0; i < 10; i++) {
			l.add(i + 0.5);
		}

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

		String a = "a0";
		if (l.contains(a)) {
			System.out.println(a+"값 포함");
		}
		
		String result = (String)l.remove(0);
		System.out.println(result);
	}
}
