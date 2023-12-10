package chapter4.ifexample;

public class IfExampleQuiz1 {

	public static void main(String[] args) {
		//page100
		
		int score = 95;
		char grade ; 
		
		if( score >=90) {
			System.out.println("A학점입니다.");
		}else if ( score >=80 ) {
			System.out.println("B학점입니다.");
		}else if ( score >=70) {
			System.out.println("C학점입니다.");
		}else if ( score >=60) {
			System.out.println("D학점입니다.");
		}else {
			System.out.println("F학점입니다.");
		}
	}

}
