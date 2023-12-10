package chapter4.loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for (num =1 ; num <=100; num++) {
			if (num %2==0)
				continue;
			total +=num;
		}
		System.out.println("1부터 100까지의 홀수의 합은 : " +total + "입니다");
	}
	
}
// continue 문을 사용 하는 경우: 
// 반복문을 계속 수행하는데, 특정 조건에서는 수행하지 않고 건너 뛰어야 할 때 사용 