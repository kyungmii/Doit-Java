package chapter6;
//this 출력하기 
class Birthday {

	int day;
	int month;
	int year;

	public void setYear(int year) {
		this.year = year;		//bDay.year = year;

			
	}//태어난 연도를 지정하는 메서드
		
	public void printThis() {
		System.out.println(this); //syso(bDay)랑 같음 
	} // this 출력 메서드 

}

public class ThisExample {
	public static void main(String[] args) {
		Birthday bDay = new Birthday();
		bDay.setYear(2000); // 태어난 연도를 2000으로 지정
		System.out.println(bDay); // 참조 변수 출력 
		bDay.printThis(); // this  출력 메서드 호출 
	}
}
