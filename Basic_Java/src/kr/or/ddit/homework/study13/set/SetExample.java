package kr.or.ddit.homework.study13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * HashSet
 *  - key로 이루어짐
 *  - key값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *  
 *  중복없는 데이터 가져오는데 사용함.
 *  
 * Set 타입의 대표 컬렉션
 * 
 * 주요 메소드
 * 	s.add()
 * 	s.remove()
 * 	s.comtains();
 * 	s.iterator();
 *	
 */
public class SetExample {

	public static void main(String[] args) {
		
//		Set s = new HashSet();
//		s.add("a");
//		s.add(1);
//		s.add(10.5);
//		s.add("b");
//		s.add("가");
//		s.add("나");
//		s.add("다");
////		s.add("다");
//		
//		
//		Iterator it = s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
 		
		Set<Integer> s = new HashSet<Integer>();
		while(s.size()<6) {
			s.add(new Random().nextInt(45)+1);
		}
		
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		
		
	}
}
