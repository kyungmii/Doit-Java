package chapter2;

public class Constant {
	public static void main(String[] args) {

		final int MAX_NUM = 100 ; // 선언과 동시에 초기화 
		final int MIN_NUM ;
		
		MIN_NUM = 0 ; // 사용하기전에 초기화 해야함 안하면 오류 발생 
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

		
		final int MY_AGE = 22;
		System.out.println(MY_AGE);
		
	
	}
}
