package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice5 {
	public void practice5() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine() ;
		
		System.out.print("학년 (숫자만): ");
		int grade = sc.nextInt();
		
		System.out.print("반 (숫자만) : ");
		int class1 = sc.nextInt() ;
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("성별 (M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지 : )");
		double score = sc.nextDouble();
		
		String StudentGender = (gender =='F') ? ("여학생") : ("남학생");
		
		System.out.println( grade + "학년 " + class1 + "반 " + num + "번 " + name + StudentGender + 
			"의 성적은 " + score+ "이다.");
		
		
		

		
		
		
		
		
	}
	
}
