package com.kh.practice.chap01_poly.model.vo;

public class BookTest {
	private String title; 
	private String author; 
	private String publisher;
	
	public BookTest() {
		
	}
	

	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public BookTest(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "BookTest [title=" + title + ", author=" + author + ", publisher=" + publisher + "]";
	}
}
