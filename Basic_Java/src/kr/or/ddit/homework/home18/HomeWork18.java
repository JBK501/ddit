package kr.or.ddit.homework.home18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HomeWork18 {
	public static void main(String[] args) {
		HomeWork18 hw = new HomeWork18();
		hw.process();
	}
	
	public void process() {
		
		List<Map> list = dataInput();
		// 1. 제일 높은 월급 구하기
		int max = maxSalary(list);
		System.out.println("제일 높은 월급 : "+max);
		
		System.out.println();
		// 2. 각 부서별 월급 총합 구하기
		Map<String, Integer> sals = getDeptSalSum(list);
		
		Set<String> set = sals.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+sals.get(key));
		}
		
		System.out.println();
		// 3. enpno를 파라미터로
		// 모든 정보를 출력하는 메소드 만들기
		printAll(7369,list);
		
	}
	
	public void printAll(int empno, List<Map> list) {
		
		// 리스트 개수만큼 반복한다.
		// 맵을 가져온다.
		// empno를 비교한다.
		// empno가 같다면
			// 해당 맵 데이터를 전부 출력한다.
		for(Map m : list) {
			if(empno == (int)m.get("EMPNO")) {
				System.out.println("=======================");
//				Set<String> set = m.keySet();
//				Iterator<String> it = set.iterator();
				
				Iterator<String> it = m.keySet().iterator();
				while(it.hasNext()) {
					String key = it.next();
					System.out.println(key+" : "+m.get(key));
				}
				System.out.println("=======================");
			}
		}
	}
	
	public Map<String, Integer> getDeptSalSum(List<Map> list){
		
		// 리스트 개수만큼 반복한다.
		// set에 부서를 추가한다. {영업부, 관리부 ...}
		Set<String> depts = new HashSet<String>();
		for(Map m : list) {
			depts.add((String) m.get("DNAME"));
		}
	
		
		// 셋의 개수만큼 반복한다. {영업부, 관리부, 조사부...}
			// 리스트 개수만큼 반복한다. 
			// 셋의이름과 맵의 이름이 같다면
				// 월금을 추가한다.
		// 맵에 셋의 키와 월급을 추가한다. 
		Map<String, Integer> sals = new HashMap<String, Integer>();
		
		
		Iterator<String> it = depts.iterator();
		while(it.hasNext()) {
			
			int totalSal = 0;
			String deptName = it.next();
			for(Map m : list) {
				if(deptName.equals((String)m.get("DNAME"))) {
					totalSal += (int)m.get("SAL");
				}
			}
			sals.put(deptName, totalSal);
		}
		
		return sals;
	}
	
	public int maxSalary(List<Map> list) {
		
		// map을 꺼내온다.
		// 월급을 가져온다.
		// 월급을 비교한다.
		
		int max = 0;
		int sal;
		for(Map m : list) {
			
			sal = (Integer)m.get("SAL");
			if(sal > max)
				max = sal;
		}
	
		return max;
	}
	
	public List<Map> dataInput(){
		
		List<Map> list = new ArrayList<Map>();
		
		Map map1 = new HashMap();
		Map map2 = new HashMap();
		Map map3 = new HashMap();
		Map map4 = new HashMap();
		Map map5 = new HashMap();
		
		
		map1.put("EMPNO",7369);
		map1.put("ENAME", "장길동");
		map1.put("JOB", "프로그래머");
		map1.put("SAL", 650);
		map1.put("DNAME", "조사부");
		
		map2.put("EMPNO",7499);
		map2.put("ENAME", "고영우");
		map2.put("JOB", "영업사원");
		map2.put("SAL", 340);
		map2.put("DNAME", "영업부");
		
		map3.put("EMPNO",7521);
		map3.put("ENAME", "구기현");
		map3.put("JOB", "영업사원");
		map3.put("SAL", 250);
		map3.put("DNAME", "영업부");
		
		
		map4.put("EMPNO",7566);
		map4.put("ENAME", "김동혁");
		map4.put("JOB", "관리자");
		map4.put("SAL", 295);
		map4.put("DNAME", "관리부");
		
		map5.put("EMPNO",7654);
		map5.put("ENAME", "김민욱");
		map5.put("JOB", "영업사원");
		map5.put("SAL", 950);
		map5.put("DNAME", "영업부");
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		
//		7362	장길동	프로그래머	650	조사부
//		7499	고영우	영업사원	340	영업부
//		7521	구기현	영업사원	250	영업부
//		7566	김동혁	관리자	295	관리부
//		7654	김민욱	영업사원	950	영업부
		
		return list;
	}
}
