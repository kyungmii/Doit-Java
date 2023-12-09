package operation;

public class OperationEx2 {

	public static void main(String[] args) {

		int gameScore = 150; // 처음은 150
		
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1); // 150 에서 1을 증가한 151
		
		int lastScore2 = --gameScore; // 151에서 -1 를 한 150 출력 
		System.out.println(lastScore2);
		
		//증감,감소 연산자
		//++: 항의 값에 1을 더함 val = ++num;
		//val = ++num; : 먼저 num 값이 1증가한 후 val변수에 대입
		//val = num++; : val 변수에 기존 num 값을 먼저 대입 한 후 num값 1증가 
		
		//--: 항의 값에 1을 뺌 val = --num;
		
		
		
	}

}
