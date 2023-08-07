package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice4 {

	public void practice4() {
		
		int num = 0 ; 
		String season = "null";
		Scanner sc = new Scanner (System.in) ;
		System.out.print("1~12 사이의 정수입력 : ");
		num = sc.nextInt();
		
		switch (num) {
		case 3 : 
		case 4 : 
		case 5 :
				season = "봄";
				break; 
		case 6: 
		case 7: 
		case 8 : 
				season = "여름";
				break;
				
		case 9 : 
		case 10 : 
		case 11: 
			season = "가을";
			break; 
			
		case 12: 
		case 1: 
		case 2: 
			season = "겨울";				
			break; 
				
		default :
				season = "잘못 입력된 달";
		}
		System.out.println(num + " 월은 " + season + " 입니다.");
		
	}
}
