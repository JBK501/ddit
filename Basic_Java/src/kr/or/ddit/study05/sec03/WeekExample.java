package kr.or.ddit.study05.sec03;


public class WeekExample {
	
	public static void main(String[] args) {
		
		for(Week week : Week.values()) {
			System.out.println(week+", "+week.kor);
		}
		
	}
}
