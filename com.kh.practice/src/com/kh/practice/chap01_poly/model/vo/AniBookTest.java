package com.kh.practice.chap01_poly.model.vo;

public class AniBookTest extends BookTest{
	private int accessAge; 
	
	public AniBookTest() {
		super() ; 
	}
	public AniBookTest(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher); 
		this.accessAge= accessAge; 
	}
	public int getAccessAge() {
		return accessAge;
	}
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		return "AniBookTest [accessAge=" + accessAge + "]";
	}
	

}
