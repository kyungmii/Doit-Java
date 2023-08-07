package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice6 {

	public void Practice6() {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("권한을 확인하고자 하는 회원 등륵 ㅂ: ");
		
		switch (sc.next()) {
		case  "관리자": 
			System.out.println("회원관리, 게시글 관리 , ");
		case "회원" :
			System.out.println("게시글 작성, 댓글작성 , ");
	
		case "비회원" :
			System.out.println("게시글 조회 ");
			break;
			default : 
				System.out.println("잘못 입력하였습니다.");
				break;
		}
		
	
	}

}
