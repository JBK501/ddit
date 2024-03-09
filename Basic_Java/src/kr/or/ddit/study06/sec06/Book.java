package kr.or.ddit.study06.sec06;

public class Book {
	private String title;
	private String writer;
	private String publisher;
	private String publicationDate;
	
	
	
	public Book(String title, String writer, String publisher, String publicationDate) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}

	public Book() {
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", publisher=" + publisher + ", publicationDate="
				+ publicationDate + "]";
	}
	
}
