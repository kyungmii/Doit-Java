package operation;

public class OperationEx4 {

	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F' ;
		
		System.out.println(ch);
		
		// 조건 연산자 : 연산에 필요한 항의 개수는 3개 여서 삼항 연산자라고도 함. 
		// 조건식 ? 결과1 : 결과2 ; 
		// 조건식이 참이면 결과1 조건식이 거짓이면 결과2가 선택됨 .
	}

}
