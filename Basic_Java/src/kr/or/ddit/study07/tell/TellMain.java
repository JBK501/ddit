package kr.or.ddit.study07.tell;

import java.util.Scanner;

public class TellMain {
	public static void main(String[] args) {

		System.out.println("전화상담 분배방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : Priorityallocation");

		Scanner sc = new Scanner(System.in);
		String sel = sc.next();

		Schdeular schdeular = null;

		switch (sel) {

		case "R":
			schdeular = new RoundRobn();
			break;

		case "L":
			schdeular = new LeastJob();
			break;

		case "P":
			schdeular = new PriorityAllocation();
			break;
		default:
			break;
		}
		
		schdeular.getNextCall();
		schdeular.sendCallToAgent();

		/*
		 * Schdeular 클래스 1. getNextCall(); 2. sendCallToAgent();
		 * 
		 * RoundRobn, LeastJob, Priorityallocation클래스는 각각 Schdeular 클래스 상속후 각 메시지를 출력할 것
		 * 
		 * PriorityAllocation 1. 우선순위가 높은 상담전화를 대기열에서 가져옴. 2. 업무 스킬이 가장 우수한 상담원에게 상담전화를
		 * 분배.
		 * 
		 * LeastJob 1. 상담전화를 대기열에서 차례대로 가져옴. 2. 대기열이 가장 짧은 상담원에게 상담전화를 분배.
		 * 
		 * RoundRobn 1. 상담전화를 대기열에서 차례대로 가져옴 2. 차례대로 상담원에게 상담전화를 분배.
		 *
		 * 
		 */
	}
}
