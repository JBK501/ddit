package kr.or.ddit.homework;

public class HomeWork01 {
	public static void main(String[] args) {
		// 1년은 365.2422일이다.
		// 1년은 xxx일 x시간 x분 x초 입니다. 출력 할것.

		double year = 365.2422;

		int days = (int) year;

		double dHour = (year - 365) * 24;
		int hour = (int) dHour;

		double dMin = (dHour - hour) * 60;
		int min = (int) dMin;

		double dSec = (dMin - min) * 60;
		int sec = (int) dSec;

		System.out.println("1년은 " + days + "일 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");
	}
}
