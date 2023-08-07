package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public static void practice1 () {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("정수 : ");
		int num = sc.nextInt( );
		
		// 삼항 연산자: 조건식? 값or 연산식 : 값or연산식 
		
		String result = num > 0 ? "양수다" : "양수가 아니다";
		System.out.println(result);		
					
}
}
