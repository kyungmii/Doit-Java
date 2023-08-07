package com.kh.practice.func;

import java.util.Scanner;

public class Test {

	public void Test1() {
		// TODO Auto-generated constructor stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("정수 : " ); 
		
		int num = sc.nextInt();
		
		String result = num > 0 ?"양수다 " :"양수가 아니다.";
		
		System.out.println(result);
		
		
		
	}

}
