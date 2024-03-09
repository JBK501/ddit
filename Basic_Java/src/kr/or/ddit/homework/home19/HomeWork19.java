package kr.or.ddit.homework.home19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork19 {

	public static void main(String[] args) {
		HomeWork19 hw = new HomeWork19();
		hw.process();
	}
	
	public void process() {
		
		// 차량번호를 입력했을 때, 시간이 몇분걸렸는지 체크한다.
		// 번호를 기준으로 요금을 계산한다.
		List<Map> list = dataInput();
		
		// 전체 출력하기
		printAll(list);
		
		// 차량번호를 입력하면 시간을 계산한다. 
		int min = getMin(list, 0000);
		System.out.println(min);
		
		// 차량 시간별 요금 계산
		int pay = pay(min);
		System.out.println("요금 : "+pay);
	}
	
	public int pay(int min) {
		// 기본시간(분) / 기본요금(원)  /  단위시간(분) // 단위요금(원) 
		// 180			5000			10				600
		int money = 5000;
		if(min > 180) {
			
			int dMin = (min - 180) / 10;
			int remain = (min - 180) % 10;
			
			if(dMin > 0)
				money += (600 * dMin);
			
			if(remain > 0)
				money+= 600;
		}
		
		return money;
	}
	
	public int getMin(List<Map> list, int carNum) {
		
		//[getMin]
		// 출차시간 - 입차시간
		// 입차출차를 여러번 할 경우, 입차출차 누적시간을 구한다.
		// 이후에 계산한다. 
		
		
		// 리스트 개수만큼 반복한다.
		// 맵을 가져온다.
		// 차량번호가 같고, 입차시간이라면
			// 시간을 구한다.
		// 차량번호가 같고, 출차시간이라면
			// 시간을 구한다.
		
		// 최종시간에 누적한다. 
		
		int total = 0;
		int startTime = 0;
		int lastTime = 0;
		
		for(Map<String, String> map : list) {
			
			if(carNum == Integer.parseInt(map.get("차량번호")) && map.get("내역").equals("입차")) {
				startTime = getTime(map.get("시각"));
			}
			
			if(carNum == Integer.parseInt(map.get("차량번호")) && map.get("내역").equals("출차"))
			{
				lastTime = getTime(map.get("시각"));
			}
			
			if(startTime != 0 && lastTime != 0) {
				total += (lastTime-startTime);
				
				startTime = 0;
				lastTime = 0;
			}
		}
			
		
		return total;
	}
	
	public int getTime(String time) {
		
		String hour = time.split(":")[0];
		String min = time.split(":")[1];
		
		return Integer.parseInt(hour) * 60 + Integer.parseInt(min);
	}
	
	
	
	public void printAll(List<Map> list) {
		
		System.out.println("[전체출력]");
		for(Map<String, String> map : list) {
			System.out.println("==============================");
			System.out.println("시각 : "+map.get("시각") );
			System.out.println("차량번호 : "+map.get("차량번호") );
			System.out.println("내역 : "+map.get("시각") );
			System.out.println("==============================");
		}
		System.out.println("[출력완료]");
		
	}
	
	
	public List<Map> dataInput(){
		
		List<Map> list = new ArrayList<Map>();
		
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		Map<String, String> map4 = new HashMap<String, String>();
		Map<String, String> map5 = new HashMap<String, String>();
		Map<String, String> map6 = new HashMap<String, String>();
		Map<String, String> map7 = new HashMap<String, String>();
		Map<String, String> map8 = new HashMap<String, String>();
		Map<String, String> map9 = new HashMap<String, String>();
		Map<String, String> map10 = new HashMap<String, String>();
		
//		시각         차량 번호	 내역
//		05:34	5961	 입차
		
		map1.put("시각", "05:34");
		map1.put("차량번호","5961");
		map1.put("내역","입차");
		
//		06:00	0000	 입차
		
		map2.put("시각", "06:00");
		map2.put("차량번호","0000");
		map2.put("내역","입차");
		
		
//		06:34	0000	 출차

		
		
		map3.put("시각", "06:34");
		map3.put("차량번호","0000");
		map3.put("내역","출차");
		
//		07:59	5961	 출차

		
		map4.put("시각", "07:59");
		map4.put("차량번호","5961");
		map4.put("내역","출차");
		
//		07:59	0148	 입차

		
		
		map5.put("시각", "07:59");
		map5.put("차량번호","0148");
		map5.put("내역","입차");
		
//		18:59	0000	 입차

		
		map6.put("시각", "18:59");
		map6.put("차량번호","0000");
		map6.put("내역","입차");
		
//		19:09	0148	 출차

		
		
		map7.put("시각", "19:09");
		map7.put("차량번호","0148");
		map7.put("내역","출차");
		
		
//		22:59	5961	 입차

		
		map8.put("시각", "22:59");
		map8.put("차량번호","5961");
		map8.put("내역","입차");
		
//		23:00	5961	 출차

		
		map9.put("시각", "23:00");
		map9.put("차량번호","5961");
		map9.put("내역","출차");
		
//		23:59	0000	 출차
		
		map10.put("시각", "23:59");
		map10.put("차량번호","0000");
		map10.put("내역","출차");
		
		
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);
		list.add(map6);
		list.add(map7);
		list.add(map8);
		list.add(map9);
		list.add(map10);
		
		return list;
	}
}
