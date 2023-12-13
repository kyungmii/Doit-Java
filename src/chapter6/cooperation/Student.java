package chapter6.cooperation;

public class Student {
	public String studentName;
	public int grade; 
	public int money;
	

	public Student(String studentName, int money) {
		this.studentName=studentName;
		this.money = money; 
	} // 학생 이름과 가진 돈을 매개 변수로 받는 생성자 
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -=1000; // 학생이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드
	}
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money-=1500;
	}
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
	
}
