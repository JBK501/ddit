package kr.or.ddit.homework.home10;

public class Grade {
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	
	public Grade(int kor, int eng, int math) {
		this.kor= kor;
		this.eng = eng;
		this.math = math;
		
		this.sum = kor + eng + math;
		this.avg = sum / 3.0f;
	}

	@Override
	public String toString() {
		return "Grade [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + "]";
	}
	
	
}
