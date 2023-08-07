package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice3 {
	
	public void practice3() {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 점수 : ");
		int korScore = sc.nextInt();
		
		System.out.print("수학 점수 : ");
		int mathScore = sc.nextInt();
		
		System.out.print("영어 점수 : ");
		int engScore = sc.nextInt();
		
		int sum = korScore + mathScore + engScore;
        double avg = sum / 3.0;
        	
		if ((korScore>=40)&& (mathScore >=40) && (engScore>=40)) {
			System.out.println("국어 : " + korScore);
			System.out.println("수학 : " + mathScore);
			System.out.println("영어 : " + engScore);
			System.out.println("합계 : " + sum);
			System.out.println("평균: " + avg);
			System.out.println("축하합니다 , 합격입니다! ");
		}
		else {
			System.out.println("불합격입니다.");
		}	
	}		
	}


