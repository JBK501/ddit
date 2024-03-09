package kr.or.ddit.homework.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap
 * 	-key와 value로 이루어짐
 *  -Key값은 중복을 허용하지 않고 순서가 보장되지 않음.
 *  
 *  Map 타입의 대표 컬렉션
 *  
 *  주요 메소드
 * 	.put(key, value) : 데이터 입력 key값은 중복되지 않음.
 * 	 value는 중복가능
 * 	. get(key) : 입력 받은 값을 key 값을 통해 꺼내올 수 있음.
 *  . clear()  : 데이터 초기화
 *  . keySet() : Key 값을 Set 타입으로 전부 가져옴.
 * 
 *
 */
public class MapExample {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("홍길동", 95);
		map.put("이순신", 85);
		map.put("강감찬", 87);
		map.put("강감찬", 85);
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
	}
}
