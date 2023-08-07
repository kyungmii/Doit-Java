package com.kh.practice.model.vo;

public class Point {
	
	private int x; 
	private int y; 
	
	public Point() {
		
	}
	public Point (int x , int y) {
		this.x = x;
		this.y= y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "Point [x =" + x + ", y =" + y+ "]";
		
		//return " Point : x = " + 
		
	}
	
}
//Getter : 내부의 멤버변수에 저장된 값을 외부로 리턴.
//메개변수는 없고, 리턴값만 있는 메서드로 정의한다. 
//메서드명은 주로 getXXX() 메서드 형식으로 지정
//XXX은 해당 멤버변수의 변수명을 사용.
//Setter : 외부로부터 데이터를 전달받아 멤버변수에 저장.
//매개변수만 있고, 리턴값은 없는 메서드로 정의.



