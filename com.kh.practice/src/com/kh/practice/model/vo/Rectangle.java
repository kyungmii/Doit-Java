package com.kh.practice.model.vo;

public class Rectangle extends Point {
	private int width;
	private int height;

	public Rectangle() {

	}

	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
@Override 
	public String toString() {
		return  this.getX() + ", " + this.getY() + ", " + 
	this.getHeight() + ", " + this.getWidth(); // 면적  
	}
}
//Getter : 내부의 멤버변수에 저장된 값을 외부로 리턴.
//메개변수는 없고, 리턴값만 있는 메서드로 정의한다. 
//메서드명은 주로 getXXX() 메서드 형식으로 지정
//XXX은 해당 멤버변수의 변수명을 사용.
//Setter : 외부로부터 데이터를 전달받아 멤버변수에 저장.
//매개변수만 있고, 리턴값은 없는 메서드로 정의.
