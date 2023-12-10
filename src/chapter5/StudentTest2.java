package chapter5;

public class StudentTest2 {
public static void main(String[] args) {
	Student student1 = new Student();
	student1.studentName = "안연수";

	Student student2 = new Student();
	student2.studentName = "안승연";
	
	System.out.println(student1);//참조 변수 값 출력 
	System.out.println(student2);  //참조 변수 값 출력 
}
}
//객체 : 객체 지향 프로그램의 대상, 생성된 인스턴스 
//클래스 : 객체를 프로그래밍 하기 위해 코드로만든 상태
//인스턴스 : 클래스가 메모리에 생성된 상태
//멤버변수: 클래스의 속성, 특성
//메서드 : 멤버 변수를 이용하여 클래스의 기능을 구현
//참조 변수 : 메모리에 생성된 인스턴스를 가르키는 변수
//참조 값 : 생성된 인스턴스의 메모리 주소값 