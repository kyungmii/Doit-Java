package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice4 {
		public void practice4 () {
			Scanner sc = new Scanner (System.in);
			System.out.print(" 인원 수: ");
			 int peopleNum= sc.nextInt() ; 
			 
			 System.out.print("사탕 개수 : ");
			 int candyNum = sc.nextInt();
			
			 System.out.println("1인당 사탕 개수 : " +candyNum / peopleNum);
			 System.out.println("남는 사탕 개수 : " +  candyNum % peopleNum );

		}

}
