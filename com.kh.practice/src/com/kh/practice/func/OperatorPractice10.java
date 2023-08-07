package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice10 {
	public void practice10() {
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.print("입력1: ");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2: ");
		int num2 = sc.nextInt( );
		
		System.out.print("입력3: ");
		int num3 = sc.nextInt();

	String result =(num1 == num2 && num2 ==num3 ? "true" : "false");
	System.out.println(result);
		   
	}

}
