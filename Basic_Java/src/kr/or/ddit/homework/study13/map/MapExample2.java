package kr.or.ddit.homework.study13.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		
//		Map<String, String> m1 = new HashMap<String, String>();
//		Map<String, String> m2 = new HashMap<String, String>();
//		Map<String, String> m3 = new HashMap<String, String>();
//		Map<String, String> m4 = new HashMap<String, String>();
//		
//		m1.put("emp_no", "100");
//		m2.put("emp_name", "홍길동");
//		m3.put("dept", "영업부");
//		m4.put("tel", "010-1234-5678");
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("emp_no", 100);
		map.put("emp_name", "홍길동");
		map.put("dept", "영업부");
		map.put("tel", "010-1234-5678");
		
		Integer empNo = (Integer)map.get("emp_no");
		String tel = (String)map.get("tel");
		
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
	}
}
