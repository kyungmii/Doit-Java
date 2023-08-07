package com.kh.practice.controller;

import com.kh.practice.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle() ;
	
	public String calcArea (int x, int y , int radius) {
		
		c.setX(x); c.setY(y); c.setRadius(radius);
		return "면적 : " + c.toString() + "/" + 
				(Math.PI * c.getRadius()*c.getRadius());	
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x); c.setY(y);  c.setRadius(radius);
		return "둘레 : " + c.toString() + "/" + 
				(Math.PI*2 *(c.getRadius()));
	}

}
