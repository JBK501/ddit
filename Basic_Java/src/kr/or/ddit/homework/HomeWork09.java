package kr.or.ddit.homework;

public class HomeWork09 {
	
	public static void main(String[] args) {
		HomeWork09 obj = new HomeWork09();
		obj.method1();
	}
	
	public void method1() {
		
		
		Student[] scores = new Student[5];
		for(int i = 0 ; i < scores.length; ++i)
		{
			scores[i] = new Student();
			
		}
		
		scores[0].name = "홍길동";
		scores[0].kor = 100;
		scores[0].eng = 50;
		scores[0].math = 70;
		scores[0].rank = 1;
		
		scores[1].name = "김길동";
		scores[1].kor = 40;
		scores[1].eng = 70;
		scores[1].math = 80;
		scores[1].rank = 1;
		
		scores[2].name = "이길동";
		scores[2].kor = 83;
		scores[2].eng = 50;
		scores[2].math = 70;
		scores[2].rank = 1;
		
		scores[3].name = "고길동";
		scores[3].kor = 10;
		scores[3].eng = 20;
		scores[3].math = 99;
		scores[3].rank = 1;
		
		scores[4].name = "우길동";
		scores[4].kor = 70;
		scores[4].eng = 45;
		scores[4].math = 90;
		scores[4].rank = 1;
		
		// 총점 구하기
		// 평균 구하기
		for(int i = 0 ; i < scores.length; ++i) {
			
			scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
			scores[i].avg = scores[i].sum / 3.0f;
		}
			
		// 등수 구하기
		for(int i = 0 ; i < scores.length -1; i++)
		{
			for(int j = i+1; j < scores.length; j++)
			{
				if(scores[i].sum < scores[j].sum)
					scores[i].rank++;
				else
					scores[j].rank++;
			}
		}

		// 출력하기
		for(Student st : scores)
		{
			System.out.println(st);
		}
		
		System.out.println();
		
		// 정렬하기
		int minSumIndex;
		
		Student s1 = new Student();
		
		for(int i = 0 ; i < scores.length - 1; i++)
		{
			minSumIndex = i; 
			for(int j = i+1; j < scores.length; j++)
			{
				if(scores[i].sum < scores[j].sum)
					minSumIndex = j;
			}
			
			s1 = scores[i];
			scores[i] = scores[minSumIndex];
			scores[minSumIndex]= s1;
		}
		
		// 출력하기
		
		System.out.println("정렬 후");
		for(Student st : scores)
		{
			System.out.println(st);
		}
	}
	
	class Student{
		
		String name; 
		int kor;
		int eng; 
		int math;
		int sum;
		double avg;
		int rank;
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum
					+ ", avg=" + avg + ", rank=" + rank + "]";
		} 
		
	}
}
