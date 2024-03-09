package kr.or.ddit.study06.sec03;

public class Tv {
	
	String company;
	int year;
	double size;
	
	public Tv() {
		
	}
	
	public Tv(String company, int year, double size)
	{
		this.company = company;
		this.year = year;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [company=" + company + ", year=" + year + ", size=" + size + "]";
	}
	
	
	
}
