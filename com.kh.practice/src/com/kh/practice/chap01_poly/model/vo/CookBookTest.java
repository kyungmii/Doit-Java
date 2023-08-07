package com.kh.practice.chap01_poly.model.vo;

public class CookBookTest extends BookTest {
	private boolean coupon; 
	public CookBookTest() {
		
	}
	public CookBookTest(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBookTest [coupon=" + coupon + "]";
	}
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

}
