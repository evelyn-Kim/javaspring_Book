package com.hwkim.mvc05.vo;

public class BookVo {
	private String title, publisher, writer;
	private int price;
	// �⺻������(Ctrl+Space)
	// ������ü �޴� ������(Source->Generate Constructor Using Fields)
	public BookVo() {
	}
	public BookVo(String title, String publisher, String writer, int price) {
		super();
		this.title = title;
		this.publisher = publisher;
		this.writer = writer;
		this.price = price;
	}
	// getter and setter �޼���(SOurce->Generate Getters and Setters)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	// toString(Source->Generate toString)
	@Override
	public String toString() {
		return "BookVo [title=" + title + ", publisher=" + publisher + ", writer=" + writer + ", price=" + price + "]";
	}
	
	
}
	
	
