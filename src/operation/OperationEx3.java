package operation;

public class OperationEx3 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1 + 10) < 10) && ((i=i+2)<10) ;
		System.out.println(value); //f
		System.out.println(num1); // 20
		System.out.println(i); // 2

		value =((num1=num1+10) > 10) || ((i=i+2) <10);
		System.out.println(value);//t
		System.out.println(num1); //30
		System.out.println(i);//2
		
		//논리연산자 : 명제 
		//&&(논리곱) : 두 항이 모두 참인 경우에만 결과 값이 참 
		//||(논리합) : 두 항중 하나의 항만 참이면 결과값은 참 
		//! (부정) : 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿈 
	}

}
