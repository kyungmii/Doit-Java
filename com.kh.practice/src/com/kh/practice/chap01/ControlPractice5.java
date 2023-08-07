package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice5 {

	public void Practice5() {

		Scanner sc = new Scanner (System.in);
		 String id = "myId";
		 String pwd = "myPassword12";
		
		
		System.out.println("아이디: ");
		String ID1= sc.toString();
		sc.nextLine() ; 
		
	
		System.out.println("비밀번호 : ");
		String Pwd1= sc.toString();
		sc.nextLine() ; 
		
		if(id.equals(ID1)== true) 
			if(pwd.equals(Pwd1)==true) {
				System.out.println("로그인성공");
			}
			else {System.out.println("비밀번호가틀렸습니다.");
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
		
		
		
}
}