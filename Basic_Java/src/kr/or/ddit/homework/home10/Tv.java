package kr.or.ddit.homework.home10;

public class Tv {
	String maker;
	int year;
	int size;
	
	public Tv(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tv [maker=" + maker + ", year=" + year + ", size=" + size + "]";
	}
	
}
