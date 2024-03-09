package kr.or.ddit.study06.sec06;

public class BookExample {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("정리하는 뇌");
		b1.setWriter("대니얼 J 레버틴");
		b1.setPublisher("와이즈베리");
		b1.setPublicationDate("2015.06.22");
		

		System.out.println("제목 : "+b1.getTitle());
		System.out.println("저자 : "+b1.getWriter());
		System.out.println("출판사 : "+b1.getPublisher());
		System.out.println("출판일 : "+b1.getPublicationDate());
		
		System.out.println();
		
		Book b2 = new Book();
		b2.setTitle("역행자");
		b2.setWriter("자청");
		b2.setPublisher("웅진지식하우스");
		b2.setPublicationDate("2022.05");
		

		System.out.println("제목 : "+b2.getTitle());
		System.out.println("저자 : "+b2.getWriter());
		System.out.println("출판사 : "+b2.getPublisher());
		System.out.println("출판일 : "+b2.getPublicationDate());
		
		System.out.println();
	}
}
