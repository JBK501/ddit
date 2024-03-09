package kr.or.ddit.homework.home17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HomeWork17 {
	public static void main(String[] args) {
		
		
		HomeWork17 hw = new HomeWork17();
		hw.process();

		// 달력 출력하기
		// 다음달을 입력하면 다음달 달력 출력
		// 이전달을 입력하면 이전달 달력 출력
	}

	public void process() {
		
		Scanner sc = new Scanner(System.in);

		int month = 0;

		while (true) {
			
			// 달을 출력한다.
			System.out.print("----------------------");
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MONTH, month);
			Date date = cal.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월");
			String result = sdf.format(date);
			System.out.print(result);
			System.out.println("-----------------------");
			System.out.println("<이전달					                다음달>");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			System.out.println("-------------------------------------------------------");
			
		
			cal.set(Calendar.DATE, 1);
			
			int day = cal.get(Calendar.DAY_OF_WEEK);
			
			for(int i = 1 ; i < day; i++) {
				System.out.print("\t");
			}
			
			int last = cal.getActualMaximum(Calendar.DATE);

			for(int i = 1; i < last; i++)
			{
				if((day + i-2) % 7 ==0)
					System.out.println();
				
				System.out.print(i + "\t");
			}
			
			System.out.println();
			System.out.print("입력 : ");
			String sel = sc.next();
			
			if(sel.equals("다음달"))
				month+=1;
			else if(sel.equals("이전달"))
				month-=1;
			else
				break;
		}
		
		// 힌트
		// set으로 1일에 해당하는 날짜로 바꾼다. 
		// 그때 해당하는 요일을 찾는다.
		// 해당 요일의 개수만큼 텝을 한다. 
		// 마지막 날짜까지 반복한다. 
			// 날짜를 출력한다. 
		
//		// 달의 마지막 일
//		int last = cal.getActualMaximum(Calendar.DATE);
//		System.out.println(last);
//
//		// 요일 구하는법
//		int day = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println(day);
		
		
		
	}

}
