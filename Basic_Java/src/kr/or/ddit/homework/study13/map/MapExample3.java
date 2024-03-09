package kr.or.ddit.homework.study13.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapExample3 {
	public static void main(String[] args) {
		
		
		MapExample3 mp = new MapExample3();
		mp.process();
	}
	
	public void process() {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		printHistoGram(1000, map);
	}
	
	public int throwOneDice() {
		return new Random().nextInt(6) + 1;
	}

	public int throwTwoDice() {
		return throwOneDice() + throwOneDice();
	}
	
	
	public void rollNum(int num, Map<Integer, Integer> map) {

		int count;
		for (int i = 0; i < num; i++) {
			count = 1;
			int diceNum = throwTwoDice();
			if(map.containsKey(diceNum))
				count += map.get(diceNum);
			map.put(diceNum, count);
		}
	}
	
	public void printHistoGram(int num, Map<Integer, Integer> map) {

		rollNum(num, map);
		double stars = 0;
		
		for(int i = 2; i <= 12 ; i++)
		{
			int originalCount = map.get(i);
			if(originalCount != 0)
				stars = originalCount / (num * 1.0) * 100;
			
			System.out.print(i + "\t : ");
			for (int j = 0; j < stars; j++) {
				System.out.print("■");
			}
			System.out.println();
		}
	}
}
