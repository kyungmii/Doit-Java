package com.kh.practice.func;
import java.util.Scanner;
public class OperatorPractice6 {

	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 나이 : ");
		int age =  sc.nextInt();
		
		String result = age <=13 ? "어린이" : (age>13 && age<=19)? "청소년" : "성인" ;
		System.out.println(result);
		// 삼항 연산자: 조건식? 값or 연산식 : 값or연산식 
		
				
	}	
}
