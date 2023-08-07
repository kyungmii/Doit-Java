package com.kh.practice.chap01;

import java.util.Scanner;


public class ControlPractice2 {
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if( num >0) {
			if( num % 2== 0) {
				System.out.print("짝수이다.");
			}
			else {
				System.out.print("홀수이다.");
			}
			}
		
		else {
			System.out.println("양수 만 입력해주세요.");
		}
		
		}
		}
	

