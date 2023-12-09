package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
// 묵시적 형변환 : 바이트 크기가 작은 자료형에서 큰 자료형으로 대입 하는 경우 
		
		byte bNum = 10;
		int iNum = bNum;
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2; // int형 값이 float형 변수로 대입됨 
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum ;
		System.out.println(dNum);
	
	
	}
}
