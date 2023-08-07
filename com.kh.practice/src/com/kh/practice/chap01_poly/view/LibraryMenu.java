package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println("성별 : ");
		char gender = sc.next().charAt(0);
		Member member = new Member(name,age,gender);
		lc.insertMember(member);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt(); 
			
			switch(menuNum) {
			case 1: System.out.println(lc.myInfo().toString()); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.exit(0); break;
			}
			System.out.println();
		}
		 
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i+"번도서 : " + bList[i].toString());
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] bList = lc.searchBook(keyword);
		
		for(Book book : bList) {
			if(book != null) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0: System.out.println("성공적으로 대여되었습니다."); break;
		case 1: System.out.println("나이 제한으로 대여 불가능입니다."); break;
		case 2: System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요."); break;
		}
	}
	
}
