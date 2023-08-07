package com.kh.practice.view;
import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;


public class PointMenu {
	private Scanner sc = new Scanner (System.in) ;
	private CircleController cc = new CircleController();
	private RectangleController  rc = new RectangleController();

	
public void mainMenu(){
	
	System.out.println("===== 메뉴 =====");
	
	System.out.println("1.원 : ");
	System.out.println("2.사각형 : ");
	System.out.println("9. 끝내기 : ");
	System.out.print("메뉴 번호 : ");
	
	int menu = sc.nextInt(); sc.nextLine();
	
	if (menu==1) {
		this.circleMenu();
	}
	else if(menu == 2) {
		this.rectangleMenu();
	}
	else   {
		System.out.println("끝내기 ");
	}
}

public void circleMenu() {
	System.out.println( " ===== 원 메뉴 ===== ");
	System.out.println("1. 원 둘레 : ");
	System.out.println("2 . 원 넓이 : ");
	System.out.println("9. 메인으로 : ");
	System.out.print("메뉴 번호 : ");
	
	int menu = sc.nextInt(); sc.nextLine();
	if (menu==1) {
		this.calcCircum() ;  // 원 둘레 
		
	}
		else if (menu ==2) {
			this.calcCircumArea(); // 원넓이

	}
		else if (menu == 9) {
			this.mainMenu();
		}
		else {
			this.circleMenu();
		}
	}
	
public void rectangleMenu() {
	
	System.out.println("===== 메뉴 =====");
	System.out.println("1.사각형 둘레 ");
	System.out.println("2. 사각형 넓이 ");
	System.out.println("3. 메인으로 ");
	System.out.print("메뉴 번호 : ");
	
	int menu = sc.nextInt(); sc.nextLine();
	if (menu==1) {
		this.calcPerimeter() ;  //사각형둘레
	}
		else if (menu ==2) {
			this.clacRectArea();     // 사각형 넓이 
	}
		else if (menu == 9) {
			this.mainMenu();
		}
		else {
			this.rectangleMenu();
		}
}
public void calcCircum() {
	
	System.out.print("x좌표 : ");
	int x = sc.nextInt(); sc.nextLine();
	
	System.out.print("y좌표 : ");
	int y = sc.nextInt(); sc.nextLine();
	
	System.out.print("반지름 : ");
	int radiuse = sc.nextInt(); sc.nextLine() ;
	
	//데이터를 cicleController (cc)의 caclCircum() 의매개변수로 보내 반환값 출력
	System.out.println(cc.calcCircum(x, y, radiuse));
	
	this.mainMenu();
	
}
public void calcCircumArea() {
	
	System.out.print("x좌표 : ");
	int x = sc.nextInt(); sc.nextLine();
	
	System.out.print("y좌표 : ");
	int y = sc.nextInt(); sc.nextLine();
	
	System.out.print("반지름 : ");
	int radiuse = sc.nextInt(); sc.nextLine(); 	
	
	//데이터를 cicleController (cc)의 calcArea() 의매개변수로 보내 반환값 출력
	System.out.println(cc.calcArea(x, y, radiuse));
	
	this.mainMenu();
}
public void calcPerimeter() {
	
	System.out.print("x 좌표 : ");
	int x = sc.nextInt(); sc.nextLine();
	
	System.out.print("y 좌표: ");
	int y = sc.nextInt(); sc.nextLine();
	
	System.out.print(" 높이 : ");
	int height = sc.nextInt(); sc.nextLine();
	
	System.out.print(" 너비 : ");
	int width = sc.nextInt();  sc.nextLine();
	 
	//데이터를 RectangleController(rc) calcPerimeter() 의매개변수로 보내 반환값출력
	System.out.println(rc.calcPerimeter(x, y, height, width));
	
	this.mainMenu();
}
public void clacRectArea() {
	System.out.print("x 좌표 : ");
	int x = sc.nextInt(); sc.nextLine();
	
	System.out.print("y 좌표: ");
	int y = sc.nextInt(); sc.nextLine();
	
	System.out.print(" 높이 : ");
	int height = sc.nextInt(); sc.nextLine();
	
	System.out.print(" 너비 : ");
	int width = sc.nextInt();  sc.nextLine();
	
	//데이터를 RectangleController(rc) calcArea()의 매개변수로 보내 반환값 출력 
	System.out.println(rc.calcArea(x, y, height, width));
	this.mainMenu();
	
}
	
}
