package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice8 {
	public void Practice8() {
		Scanner sc = new Scanner (System.in) ;
		int num1 ;
		int num2 ;
		char op ;
		double result =0;
		
		System.out.println("피연산자 1 입력 : ");
		num1= sc.nextInt();
		System.out.println("피연산자 2 입력 : ");
		num2= sc.nextInt();
		System.out.println("연산자 입력(+,-,*,/,%)");
		op= sc.next().charAt(0);
		
		if(num1>0 && num2>0) {
			switch(op) {
			case '+' : 
					result = num1 + num2 ;
					break ;
			 case '-' :
				  result = num1-num2;
				  break;
				 case '*' :
				  result = num1*num2;
				  break;
				 case '/' :
				  result = num1/num2;
				  break;
			default:
				System.out.println("잘못된 연산자를 입력했따.");

			}
		}
			System.out.println(num1 + " "+ op + " " + num2 + " = " + result );
}
}
