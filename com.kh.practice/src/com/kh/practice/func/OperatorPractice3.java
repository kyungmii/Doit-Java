package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice3 {
	public void practice3() {
		Scanner sc = new Scanner (System.in);
		
		System.out.print( " 정수 : ");
		int num = sc.nextInt();
		
		//연산자 
		String result = (num%2==0)? ("짝수다") : ("홀수다");
		System.out.println(result);	
	}

}
