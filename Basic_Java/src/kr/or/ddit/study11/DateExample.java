package kr.or.ddit.study11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		DateExample de = new DateExample();
//		de.method1();
//		de.method2();
//		de.method3();
//		de.method4();
//		de.method5();
		de.method6();
	}
	
	public void method6() {
		
		Calendar cal = Calendar.getInstance();
		
//		cal.add(Calendar.MONTH, -1);
		cal.set(Calendar.YEAR, 2025);
		
		Date date = cal.getTime();
		System.out.println(date);
		
		
	}
	
	public void method5() {
		
		Date d1 = new Date();
		System.out.println(d1);
		
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour * 24;
		
		Date d2 = new Date(d1.getTime()+(long)(day*100));
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy/MM/dd");
		
		String result = sdf.format(d2);
		System.out.println(result);
		
	}
	
	public void method4() {
		
		String str = "2024.09.23";
		
		// String -> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date date = sdf.parse(str);
//			System.out.println(date);
			
//			System.out.println(date);			
			Date curr = new Date();
			long time = date.getTime() - curr.getTime();
			
			time = time / 1000 / 60 / 60 / 24;
			System.out.println(time);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void method3() {
		
		Date date = new Date();
		System.out.println(date);
		
		// Date -> String
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy/MM/dd a hh:mm:ss");
		String result = sdf.format(date);
		System.out.println(result);
	}
	
	public void method2() {
		
		Date date = new Date();
		long time = date.getTime();
		
		long sec = 1000;
		long min = sec*60;
		long hour = min*60;
		long day = hour * 24;
		long year = (long)(day*365);
		
		System.out.print(time/year+"년");
		time%=year;
		System.out.print(time/day+"일");
		time%=day;
		System.out.print(time/hour+"시");
		time%=hour;
		System.out.print(time/min+"분");
		time%=min;
		System.out.print(time/sec+"초");
		time%=sec;
	}
	
	public void method1() {
		Date date = new Date();
		System.out.println(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Date date2 = new Date();
		System.out.println(date2);
		
		long time = date2.getTime()-date.getTime();
		System.out.println(time);
		
		System.out.println(date.getTime());
	}
}
