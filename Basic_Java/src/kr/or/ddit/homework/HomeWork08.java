package kr.or.ddit.homework;

import java.util.Scanner;

public class HomeWork08 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork08 obj = new HomeWork08();
		
		obj.process();
	}
	
	public void process() {
		
		// 5명의 3과목 성적과 이름을 배열에 저장하고 
		// 총점, 평균, 등수를 구하여 출력하시오.
		
		String[] stuName = {"홍길동","김길동","이길동","강길동","고길동"};
		
		// 국어 영어 수학 총점 평균 등수
		// 80, 70, 80, 0, 0, 1
		
		int[][] scores = {  {80,70,80,0,0,1},
							{90,85,90,0,0,1},
							{90,70,75,0,0,1},
							{60,75,70,0,0,1},
							{80,80,70,0,0,1}};
		
		
		int sum;
		double avg;
		
		for(int i = 0 ; i < scores.length; i++)
		{
			sum = 0;
			for(int j = 0 ; j < 3; j++)
			{
				sum += scores[i][j]; 
			}
			
			// 1. 총점을 구한다.
			scores[i][3] = sum;
			
			// 2. 평균을 구한다.
			scores[i][4] = sum / 3;
		}
		
		// 3. 등수를 구한다.
		for(int i = 0;  i < scores.length-1 ; i++)
		{
			for(int j = i+1; j < scores.length; j++)
			{
				if(scores[i][3] < scores[j][3])
					scores[i][5]++;
				else
					scores[j][5]++;
			}
		}
		
		// 4. 출력한다.
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("==================================================");
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(stuName[i]+"\t");
			for(int j = 0 ; j < scores[i].length; j++)
			{
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 5. 정렬한다.
		String tempName;
		int[] temp = new int[6];
		int minSumIndex;
		
		for(int i = 0 ; i < scores.length - 1; i++)
		{
			minSumIndex = i; 
			for(int j = i+1; j < scores.length; j++)
			{
				if(scores[minSumIndex][3] < scores[j][3])
					minSumIndex = j;
			}
			
			
			// 문자열교체
			tempName = stuName[minSumIndex];
			stuName[minSumIndex] = stuName[i];
			stuName[i] = tempName;
			
			// 스코어교체
			temp = scores[minSumIndex];
			scores[minSumIndex] = scores[i];
			scores[i] = temp;
		}
		
		// 6. 출력한다. 
		System.out.println("\n\n[총점기준 정렬]");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("==================================================");
		for(int i = 0; i < scores.length; i++)
		{
			System.out.print(stuName[i]+"\t");
			for(int j = 0 ; j < scores[i].length; j++)
			{
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
