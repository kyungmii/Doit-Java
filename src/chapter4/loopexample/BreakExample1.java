package chapter4.loopexample;

public class BreakExample1 {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		
		for(num =0 ; sum<100; num ++) { //합한값이 100보다 클 떄 종료 
			sum += num;
		}
		System.out.println("num : "+num);
		System.out.println("sum : " + sum);
	}

}
