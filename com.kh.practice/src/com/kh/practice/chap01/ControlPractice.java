package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
	
//		System.out.println("1.입력");
//		System.out.println("2.수정");
//		System.out.println("3.조회");
//		System.out.println("4.삭제");
//		System.out.println("7: 종료");
		
		Scanner sc = new Scanner (System.in) ;
		System.out.print("메뉴 번호를 입력 하세요 : ");
		int num = sc.nextInt();
		
		String menu = "";
		switch(num) {
		case 1 : menu = "입력";
			break;
		case 2 : menu = "수정 ";
			break;
		case 3 : menu = "조회";
			break;
		case 4 : menu = "삭제";
			break;
		case 7 : menu = "종료";
			break;
		}
		System.out.print(menu + " 메뉴입니다.");
		}
	}

